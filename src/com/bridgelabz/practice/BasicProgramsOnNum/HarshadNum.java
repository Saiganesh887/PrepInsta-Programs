package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class HarshadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int sum=0,digit;
        while(n != 0){
            digit = n % 10;
            sum += digit;
            n /= 10;
        }
        if(n % sum == 0) {
            System.out.println("Harshad Number");
        }else{
            System.out.println("not a Harshad Number");
        }
    }
}
