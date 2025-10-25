import java.util.Scanner;

public class ProductInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter Unit Price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter Size (e.g., S, M, L): ");
        char size = scanner.next().charAt(0);

        System.out.print("On Sale (true/false): ");
        boolean onSale = scanner.nextBoolean();

        System.out.println("\n--- PRODUCT DETAILS ---");
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Size: " + size);
        System.out.println("On Sale: " + onSale);
        System.out.println("-----------------------");
    }
}
