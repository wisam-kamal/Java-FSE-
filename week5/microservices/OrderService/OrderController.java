@RestController
@RequestMapping("/api/orders")
public class OrderController {
  @Autowired private OrderRepository repo;
  @Autowired private WebClient.Builder wc;

  @PostMapping
  public ResponseEntity<Order> place(@RequestBody Order o) {
    UserDTO u = wc.build()
                  .get()
                  .uri("http://localhost:8081/api/users/" + o.getUserId())
                  .retrieve()
                  .bodyToMono(UserDTO.class)
                  .block();

    if (u == null) return ResponseEntity.badRequest().build();
    return ResponseEntity.ok(repo.save(o));
  }

  @GetMapping("/{id}") public ResponseEntity<Order> get(@PathVariable Long id){
    return repo.findById(id).map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
  }
}
