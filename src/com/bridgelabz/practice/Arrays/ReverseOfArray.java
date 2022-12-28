package com.bridgelabz.practice.Arrays;

import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse of Elements is :");
        for(int i=n-1;i>=0;i--) {
            System.out.println(arr[i]);
        }
    }
}
