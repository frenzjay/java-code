package com.example.demo;
import java.util.Scanner;

public class hourMinSec {
  public static void main(String[] args) {
    Scanner gwapo = new Scanner(System.in);
    
    System.out.print("Enter a seconds: ");
    int seconds = gwapo.nextInt();
    
    int hours = seconds / 3600;
    int minutesRem = seconds % 3600;
    int minutes = minutesRem / 60;
    int second = minutesRem % 60;
    System.out.println("Hour: " + hours + " Minute: " + minutes + " Seconds: " + second);



  }
}
