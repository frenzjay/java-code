import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Movie title: ");
        String movieTitle = scanner.nextLine();

        System.out.print("Enter Number of tickets: ");
        int numTickets = scanner.nextInt();

        System.out.print("Enter Ticket price: ");
        double ticketPrice = scanner.nextDouble();

        System.out.print("Enter Seat type (R for Regular, V for VIP): ");
        char seatType = scanner.next().charAt(0);

        System.out.print("Is student discount applied? (true/false): ");
        boolean studentDiscount = scanner.nextBoolean();

        System.out.println("\n--- MOVIE TICKET SUMMARY ---");
        System.out.println("Movie: " + movieTitle);
        System.out.println("Tickets: " + numTickets);
        // System.out.println("Ticket Price: ₱" + ticketPrice);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Seat Type: " + seatType);
        System.out.println("Student Discount: " + studentDiscount);
        System.out.println("Enjoy your movie!");
        System.out.println("----------------------------");
    }
}
