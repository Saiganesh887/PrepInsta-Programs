package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class Automorphic {
    static boolean isAutomorphic(int n){
        int square = n * n;
        while(n != 0)
        {
            if(n % 10 != square % 10) {
                return false;
            }
            n /= 10;
            square /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int square = n*n;
        if(isAutomorphic(n) == true) {
            System.out.println(n + " is a automorphic number");
        }
        else{
            System.out.println(n+ " is not a automorphic number");
        }
    }
}
