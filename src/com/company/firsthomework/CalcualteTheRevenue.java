package com.company.firsthomework;

import java.util.Scanner;

public class CalcualteTheRevenue {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Enter unit price: ");
      double unitPrice = scanner.nextDouble();

      System.out.print("Enter quantity price: ");
      int quantity = scanner.nextInt();
      double totalPrice = unitPrice * quantity;
      double percent = 0.0;
      double discount = 0.0;

      if (quantity >= 100 && quantity <= 120) {
        percent = 0.15;
        discount = totalPrice * percent;
      } else if (quantity > 120) {
        percent = 0.20;
        discount = totalPrice * percent;
      }

      totalPrice = totalPrice - discount;

      System.out.println("The revenue from sale: $" + totalPrice);
      System.out.println("Discount: $" + discount + " (" + percent * 100 + "%)");
    } finally {
      scanner.close();
    }
  }
}