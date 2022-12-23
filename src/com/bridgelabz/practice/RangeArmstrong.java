package com.bridgelabz.practice;

import java.util.Scanner;

public class RangeArmstrong {
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
            System.out.println("start from: ");
            int a = sc.nextInt();
            System.out.println("upto: ");
            int b = sc.nextInt();
            for(int i=a;i<=b;i++){
                int sum=0,temp,digit, len;
                len = order(i);
                temp = i;
                while(temp != 0){
                    digit = temp % 10;
                    sum += (int)Math.pow(digit,len);
                    temp /= 10;
                };
                if(sum == i){
                    System.out.println(i);
                }
            }
        }
}
