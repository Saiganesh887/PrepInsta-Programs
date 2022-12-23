package com.bridgelabz.practice;

import java.util.Scanner;

public class NumberCheck {
        public static void main (String[]args) {

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter number:");
            int num = myObj.nextInt();
            if (num > 0)
                System.out.println("The number is positive");
            else if (num < 0)
                System.out.println("The number is negative");
            else
                System.out.println("Zero");
        }
}
