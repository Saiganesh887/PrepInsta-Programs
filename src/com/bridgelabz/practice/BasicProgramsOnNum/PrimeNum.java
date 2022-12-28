package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int i,c=0;
        if(n < 2){
            System.out.println(n +" not a prime number");
        }
        for(i=1;i<n;i++){
            if(n%i == 0){
                c += 1;
            }
        }
        if(c > 1)
        {
            System.out.println(n +" is not a prime number");
        }
        else
        {
            System.out.println(n +" prime number");
        }
    }
}
