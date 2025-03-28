import java.lang.*;
import java.util.*;
interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}
abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;
    private double discount;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.discount = 0;
    }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public double getDiscount() { return discount; }

    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("--------------------------");
    }
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            this.discount = percent;
        }
    }

    public String getDiscountDetails() {
        return "Discount applied: " + discount + "%";
    }
    public abstract double calculateTotalPrice();
}
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        double discounted = total - (total * getDiscount() / 100);
        return discounted;
    }
}
class NonVegItem extends FoodItem {
    private final double nonVegCharge = 30.0; // extra charge

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + nonVegCharge) * getQuantity();
        double discounted = total - (total * getDiscount() / 100);
        return discounted;
    }
}
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Paneer Butter Masala", 180.0, 2);
        item1.applyDiscount(10);

        FoodItem item2 = new NonVegItem("Chicken Biryani", 250.0, 1);
        item2.applyDiscount(5);

        FoodItem item3 = new NonVegItem("Mutton Curry", 300.0, 2);
        item3.applyDiscount(15);
        FoodItem[] order = { item1, item2, item3 };

        System.out.println("Order Summary:");
        for (FoodItem item : order) {
            item.getItemDetails();
        }
    }
}
