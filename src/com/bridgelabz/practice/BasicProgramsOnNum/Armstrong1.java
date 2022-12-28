package com.bridgelabz.practice.BasicProgramsOnNum;

import java.util.Scanner;

public class Armstrong1 {
    static int order (int x)
    {
        int len = 0;
        while (x != 0 )
        {
            len++;
            x = x / 10;
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
            int sum=0,temp,digit, len;
            len = order(n);
            temp = n;
            while(temp != 0){
                digit = temp % 10;
                sum += (int)Math.pow(digit,len);
                temp /= 10;
            };
            if(sum == n){
                System.out.println(n +" is a armstrong number");
            }
            else{
                System.out.println(n + " is not a armstrong number");
            }
        }
    }
