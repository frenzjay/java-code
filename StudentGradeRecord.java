import java.util.Scanner;

public class StudentGradeRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Section (e.g., A, B, C): ");
        char section = scanner.next().charAt(0);

        System.out.print("Enter Average Grade: ");
        double averageGrade = scanner.nextDouble();

        System.out.print("Passed (true/false): ");
        boolean passed = scanner.nextBoolean();

        System.out.println("\n--- STUDENT RECORD ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Section: " + section);
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Passed: " + passed);
        System.out.println("----------------------");
    }
}
