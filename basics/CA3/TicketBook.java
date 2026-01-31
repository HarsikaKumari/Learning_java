package CA3;

public class TicketBook {
    private String passengerName;
    private String flightNumber;
    private double ticketPrice;

    public TicketBook(String passengerName, String flightNumber, double ticketPrice) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.ticketPrice = ticketPrice;
    }

    public void displayTicketDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Ticket Price: $" + ticketPrice);
    }

    public static void main(String[] args) {
        TicketBook ticket1 = new TicketBook("Alice", "ABC123", 250.0);
        TicketBook ticket2 = new TicketBook("Bob", "XYZ789", 300.0);

        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails(); 
    }

}
