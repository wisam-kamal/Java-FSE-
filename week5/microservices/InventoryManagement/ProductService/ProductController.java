@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @GetMapping
    public List<Product> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Product add(@RequestBody Product product) {
        return repository.save(product);
    }
}
