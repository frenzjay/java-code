import java.util.Scanner;

public class CarRentalInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Car type (S for Sedan, V for Van): ");
        char carType = scanner.next().charAt(0);

        System.out.print("Enter Rental days: ");
        int rentalDays = scanner.nextInt();

        System.out.print("Enter Daily rate: ");
        double dailyRate = scanner.nextDouble();

        System.out.print("With driver (true/false): ");
        boolean withDriver = scanner.nextBoolean();

        System.out.println("\n--- CAR RENTAL SUMMARY ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Car Type: " + carType);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("With Driver: " + withDriver);
        System.out.println("--------------------------");
    }
}
