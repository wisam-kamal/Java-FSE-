interface CustomerRepository {
    Customer findCustomerById(String id);
}

class CustomerRepositoryImpl implements CustomerRepository {
    public Customer findCustomerById(String id) {
        if (id.equals("C101")) {
            return new Customer("C101", "Wisam Kamal");
        }
        return null;
    }
}

class Customer {
    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class CustomerService {
    private CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer findCustomer(String id) {
        return repository.findCustomerById(id);
    }
}
