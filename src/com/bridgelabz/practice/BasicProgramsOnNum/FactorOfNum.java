package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class FactorOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int i,facts;
        for(i=1;i<n;i++){
            if(n%i == 0){
                facts = i;
                System.out.println(facts);
            }
        }
    }
}
