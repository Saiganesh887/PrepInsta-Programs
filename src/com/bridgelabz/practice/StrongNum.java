package com.bridgelabz.practice;

import java.util.Scanner;

public class StrongNum {
    static int facto (int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact * i;
        return fact;
    }
    static boolean detectStrong (int num) {

        int digit, sum = 0;
        int temp = num;
        boolean flag = false;

        // calculate 1! + 4! + 5!
        while (temp != 0) {
            digit = temp % 10;

            sum = sum + facto(digit);
            temp /= 10;
        }
        if (sum == num)
            flag = true;
        else
            flag = false;

        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if (detectStrong (n))
            System.out.println (n + " is Strong Number");
        else
            System.out.println (n + " is not a Strong Number");
    }
}

