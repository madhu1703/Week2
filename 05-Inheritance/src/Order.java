import java.lang.*;
import java.util.*;
class Order {
    private double orderID;
    private String orderDate;


    public Order(double orderID, String orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public void display() {
        System.out.println("The order ID is " + orderID);
        System.out.println("The order date is " + orderDate);
    }
}
    class ShippedOrder extends Order
    {
        private double trackingNumber;
        public ShippedOrder(double orderID, String orderDate,double trackingNumber)
        {
            super(orderID, orderDate);
            this.trackingNumber=trackingNumber;
        }
        @Override
        public void display()
        {
            super.display();
            System.out.println("The tracking number is "+trackingNumber);
        }
    }
    class DeliveredOrder extends Order
    {
        private String orderStatus;
        public DeliveredOrder(double orderID, String orderDate,String orderStatus)
        {
            super(orderID, orderDate);
            this.orderStatus = orderStatus;
        }
        public boolean setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this.orderStatus.equalsIgnoreCase("delivered");
        }

        public void getOrderStatus() {
            System.out.println("The order status is " + orderStatus);
        }
    }
    class Main
    {
        public static void main(String[] args)
        {
            ShippedOrder s = new ShippedOrder(10101, "11/11/11", 12345);
            s.display();

            System.out.println();

            DeliveredOrder d = new DeliveredOrder(20202, "12/12/12", "in transit");
            d.getOrderStatus();
            boolean delivered = d.setOrderStatus("delivered");
            d.getOrderStatus();
            System.out.println("Is order delivered? " + delivered);
        }
        }
