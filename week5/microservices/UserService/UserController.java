@RestController
@RequestMapping("/api/users")
public class UserController {
  @Autowired private UserRepository repo;
  @PostMapping public User create(@RequestBody User u) { return repo.save(u); }
  @GetMapping("/{id}") public ResponseEntity<User> get(@PathVariable Long id){
    return repo.findById(id).map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
  }
}
