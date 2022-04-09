package com.company.firsthomework;

import java.util.Scanner;

public class EligibletoWork {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the age:");
        int age = scan.nextInt();
        if (age >= 18 && age <= 65) {
            System.out.println("You are eligible for work");
        } else if (age > 65 ) {
            System.out.println(("You are retired"));
        } else {
            System.out.println("You are not eligible for work");
        }
    }

}
