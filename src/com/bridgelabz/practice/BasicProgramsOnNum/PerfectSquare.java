package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class PerfectSquare {
    static boolean isPerfectSquare(int x)
    {
        if (x >= 0) {
            int sr = (int)Math.sqrt(x);
            return((sr * sr) == x);
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = sc.nextInt();
        if (isPerfectSquare(x))
            System.out.print(x+" is a perfect number");
        else
            System.out.print(x+" is not a perfect number");
    }
}
