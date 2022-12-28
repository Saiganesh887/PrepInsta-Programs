package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int rem, rev=0, x;
        x = n;
        while(x!=0) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if(rev == n){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
