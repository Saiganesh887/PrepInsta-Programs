package com.bridgelabz.practice;

import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args){
        int i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Start from : ");
        int a = sc.nextInt();
        System.out.println("upto : ");
        int z = sc.nextInt();
        for(i = a; i <= z ; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
