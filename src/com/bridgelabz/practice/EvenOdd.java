package com.bridgelabz.practice;

import java.util.Scanner;

public class EvenOdd {
    public static void main (String[] args){
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = Obj.nextInt();
        if(num ==0)
        {
            System.out.println("Zero");
        }
        else if(num%2 == 0)
        {
            System.out.println(num + " is a even number");
        }
        else
        {
            System.out.println(num + " is a odd number");
        }
    }
}
