package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class RangePrime {
    public static void main(String[] args) {
        int a, z, i,j,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the lower limit :");
        a = sc.nextInt();
        System.out.println ("Enter the upper limit :");
        z = sc.nextInt();
        System.out.println ("The prime numbers in between " + a + " and " + z +  " are :");
        for(i = a; i <= z; i++) {
            for(j = 2;j < i; j++){
                if(i%j == 0){
                    flag = 0;
                    break;
                }
                else {
                    flag = 1;
                }
            }
            if(flag==1){
                System.out.println(i);
            }
        }
    }
}