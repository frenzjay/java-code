import java.util.Scanner;

public class EmployeePayrollRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Hours worked: ");
        int hoursWorked = scanner.nextInt();

        System.out.print("Enter Hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter Work shift (D for day, N for night): ");
        char workShift = scanner.next().charAt(0);

        System.out.print("Is full-time employee? (true/false): ");
        boolean isFullTime = scanner.nextBoolean();

        System.out.println("\n--- PAYROLL RECORD ---");
        System.out.println("Employee: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Shift: " + workShift);
        System.out.println("Full-Time: " + isFullTime);
        System.out.println("----------------------");
    }
}
