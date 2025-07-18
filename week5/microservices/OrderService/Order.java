@Entity
public class Order {
  @Id @GeneratedValue private Long id;
  private Long userId; private String description;
}
