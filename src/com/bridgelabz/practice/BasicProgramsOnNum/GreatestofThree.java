package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class GreatestofThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter Third number: ");
        int n3 = sc.nextInt();
        if(n1 > n2 && n1 > n3)
        {
            System.out.println("first number "+ n1 + " is greater");
        }
        else if(n2 > n1 && n2 > n3)
        {
            System.out.println("Second number " + n2 + " is greater");
        }
        else
        {
            System.out.println("Third number " + n3 + " is greater");
        }
    }
}
