public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        Customer customer = service.findCustomer("C101");
        if (customer != null) {
            System.out.println("Customer Found: " + customer.getName());
        } else {
            System.out.println("Customer not found.");
        }
    }
}
