package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int x = sc.nextInt();
    int y=0;
    while(x != 0)
    {
        y += x % 10;
        x = x/10;
    }
    System.out.println("Sum of Digits: "+ y);
    }

}
