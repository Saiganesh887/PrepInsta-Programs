package com.bridgelabz.practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci series upto : ");
        int n = sc.nextInt();
        int a = 0,b = 1,c;
        System.out.println(a + " , " + b + " , ");
        for(int i=2;i<=n;i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c + " , ");
        }
    }
}
