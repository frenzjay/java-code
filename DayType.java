import java.util.Scanner;

public class DayType {
  public static void main(String[] args) {
    Scanner gwapo = new Scanner(System.in);

    System.out.print("Input a number: ");
    int number = gwapo.nextInt();
    
    if (number > 7 || number < 1){
      System.out.println("Invalid");
    } else if (number > 5){
      System.out.println("Weekend");
    } else if (number <= 5){
      System.out.println("Weekdays");
    } 
  } 
} 
