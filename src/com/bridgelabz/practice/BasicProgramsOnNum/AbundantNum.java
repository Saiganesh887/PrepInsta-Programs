package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class AbundantNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int i,facts=0;
        for(i=1;i<n;i++){
            if(n%i == 0){
                facts += i;
            }
        }
        if(facts > n){
            System.out.println(n+" is a abundant number");
        }else{
            System.out.println(n+ " is not a abundant number");
        }

    }
}
