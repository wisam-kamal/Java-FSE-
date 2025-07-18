@Entity
public class User {
  @Id @GeneratedValue private Long id;
  private String name, email;
  // getters/setters
}
