package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class GreatestofNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("enter Second number: ");
        int n2 = sc.nextInt();
        if(n1 > n2)
        {
            System.out.println("first number is greater than second number");
        }
        else if(n1 == n2)
        {
            System.out.println("Numbers are Equal");
        }
        else{
            System.out.println("second number is greater than first number");
        }
    }
}
