package com.bridgelabz.practice.Arrays;

import java.util.Scanner;

public class SecondSmallestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0],min2 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min > arr[i])
                min = arr[i];
        }
        for(int i=0;i < n;i++){
            if(arr[i] < min2 && arr[i] > min)
                min2 = arr[i];
        }
        System.out.println("Smallest Number In Array is: "+min);
        System.out.println("Second Smallest Number In Array is: "+min2);
    }
}
