public class CustomerTester {
    public static void main(String [] args) {
    Customer customer_1 = new Customer("Sam");
    customer_1.greet();
    customer_1.purchase("chips", "chocolate", "orange juice");
    System.out.println("-----------------------------");
    Customer customer_2 = new Customer("David");
    customer_2.greet("David");
    customer_2.purchase("orange juice");
    }
    }