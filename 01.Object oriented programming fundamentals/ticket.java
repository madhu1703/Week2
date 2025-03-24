import java.lang.*;
import java.util.*;
class ticket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;
    public ticket(String movieName)
    {
        this.movieName=movieName;
        this.isBooked=false;
    }
    public void bookTicket(String seatNumber,double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked!");
        }
    }
    public void display()
    {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter movie name:");
        String movie = sc.nextLine();
        ticket ticket = new ticket(movie);

        System.out.println("Enter seat number:");
        String seat = sc.nextLine();

        System.out.println("Enter ticket price:");
        double price = sc.nextDouble();

        ticket.bookTicket(seat, price);
        ticket.display();
}

}
