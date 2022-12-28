package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class ReverseofNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int rev=0,rem;
        while(n != 0){
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        System.out.println("reverse of given number is: " + rev);
    }
}
