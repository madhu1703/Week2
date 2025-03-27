import java.util.*;

class Product {
    private String productName;
    private double price;

    public Product(String name, double price) {
        this.productName = name;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
class Order {
    private static int orderCounter = 1;
    private int orderId;
    private List<Product> products;
    private Customer customer;

    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.products = new ArrayList<>();
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added " + product.getProductName() + " to Order #" + orderId);
    }

    public void displayOrderDetails() {
        System.out.println("Order #" + orderId + " by " + customer.getName());
        double total = 0;
        for (Product p : products) {
            System.out.println("  - " + p.getProductName() + " ($" + p.getPrice() + ")");
            total += p.getPrice();
        }
        System.out.println("Total: $" + total + "\n");
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order);
    }

    public void viewOrders() {
        System.out.println("\nOrders for " + name + ":");
        for (Order o : orders) {
            o.displayOrderDetails();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 800.00);
        Product p2 = new Product("Phone", 500.00);
        Product p3 = new Product("Headphones", 150.00);
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");
        Order order1 = new Order(c1);
        order1.addProduct(p1);
        order1.addProduct(p3);
        c1.placeOrder(order1);
        Order order2 = new Order(c2);
        order2.addProduct(p2);
        c2.placeOrder(order2);
        c1.viewOrders();
        c2.viewOrders();
    }
}