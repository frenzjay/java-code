package com.example.demo;
import java.util.Scanner;

public class CalcIfElse {
  public static void main(String[] args) {
    Scanner gwapo = new Scanner(System.in);

    int total;
    
    System.out.print("Enter First Number: ");
    int firstNum = gwapo.nextInt();
    
    System.out.print("Enter Second Number: ");
    int secondNum = gwapo.nextInt();

    System.out.print("Enter operator: ");
    char operator = gwapo.next().charAt(0);

    if (operator == '+'){
      total = firstNum + secondNum;
      System.out.println("Answer: " + total);
    } else if (operator == '-'){
      total = firstNum - secondNum;
      System.out.println("Answer: " + total);
    } else if (operator == '*'){
      total = firstNum * secondNum;
      System.out.println("Answer: " + total);
    } else if (operator == '/'){
      total = firstNum / secondNum;
      int rem = firstNum % secondNum; 
      System.out.println("Remainder: " + rem);
      System.out.println("Answer: " + total);
    }



  }
}
