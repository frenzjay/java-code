package com.example.demo;
import java.util.Scanner;

public class SalaryBonusSystem {
  public static void main(String[] args) {
    Scanner gwapo = new Scanner(System.in);

    System.out.print("Enter Monthly Salary: ");
    int monthlySalary = gwapo.nextInt();
    
    System.out.print("Enter Years of Service: ");
    int yearsOfService = gwapo.nextInt();

    if (yearsOfService >= 10){
      // seqrch percent formula on google
      double bonus = 0.20 * monthlySalary;
      System.out.println("Bonus: " + bonus);
    } else if (yearsOfService >= 5){
      double bonus = 0.10 * monthlySalary;
      System.out.println("Bonus: " + bonus);
    } else {
      System.out.println("No bonus");
  } 
}
}
