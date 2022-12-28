package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class FriendlyPair {
    static int divisorsSum (int n)
    {
        int sum = 0,i;
        for (i = 1; i < n; i++)
        {
            if (n % i == 0)
                sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int sum1,sum2;
        sum1 = divisorsSum(a);
        sum2 = divisorsSum(b);
        if(sum1 / a == sum2 / b){
            System.out.println(a+" and "+ b + " are friendly pair");
        }else{
            System.out.println(a+" and "+ b + " are not a friendly pair");
        }
    }
}
