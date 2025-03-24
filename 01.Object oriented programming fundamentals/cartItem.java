import java.lang.*;
import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    CartItem item;

    public void addItem(String itemName, double price, int quantity) {
        item = new CartItem(itemName, price, quantity);
        System.out.println(itemName + " added to cart.");
    }

    public void removeItem() {
        if (item != null) {
            System.out.println(item.itemName + " removed from cart.");
            item = null;
        } else {
            System.out.println("Cart is already empty.");
        }
    }

    public void displayTotalCost() {
        if (item != null)
            System.out.println("Total Cost: $" + item.getTotalPrice());
        else
            System.out.println("Cart is empty.");
    }
}

class ShoppingCartDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. Display Total Cost\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.next();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(name, price, quantity);
                    break;
                case 2:
                    cart.removeItem();
                    break;
                case 3:
                    cart.displayTotalCost();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
