package com.example.demo;
import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner gwapo = new Scanner(System.in);
    
    System.out.print("Enter a Year: ");
    int year = gwapo.nextInt();
    
    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
      System.out.println("Leap year");
    } else {
      System.out.println("Not a leap year");
    }
    



  }
}
