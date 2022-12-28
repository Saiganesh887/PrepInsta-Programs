package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int arm=0,rem,temp=n;
        while(n!=0){
         rem= n%10;
         arm += rem*rem*rem;
         n=n/10;
        }
        System.out.println(arm + " is ");
        if(arm == temp){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("Not a armstrong number");
        }
    }
}
