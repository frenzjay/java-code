import java.util.Scanner;

public class LargestOfThree {
  public static void main(String[] args) {
    Scanner gwapo = new Scanner(System.in);
    
    System.out.print("Enter First Number: ");
    int firstNum = gwapo.nextInt();
    
    System.out.print("Enter Second Number: ");
    int secondNum = gwapo.nextInt();

    System.out.print("Enter Third Number: ");
    int thirdNum = gwapo.nextInt();

    int largest = firstNum;

    if (secondNum > largest){
      largest = secondNum;
    }
    if (thirdNum > largest){
      largest = thirdNum;
    }
    System.out.println("The largest is " + largest);



  }
}
