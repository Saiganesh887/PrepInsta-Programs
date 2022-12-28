package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;
public class Power {
    static double powerNum(int x , int y){
        double z = Math.pow(x,y);
        return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Power of Number: ");
        int b = sc.nextInt();
        double c;
        c = powerNum(a,b);
        int d = (int)c;
        System.out.println(a + " power of " + b +" is : " +d);
    }
}
