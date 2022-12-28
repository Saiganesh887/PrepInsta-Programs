package com.bridgelabz.practice.Arrays;

import java.util.Scanner;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int[] arr = new int[n];
        for(int i=0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        for(int i=0;i < n;i++){
            if(smallest > arr[i])
                smallest = arr[i];
        }
        int sec_smallest = Integer.MAX_VALUE;
        for(int i=0;i < n;i++){
            if(arr[i] < sec_smallest && arr[i] != smallest)
                sec_smallest = arr[i];
        }
        int largest = arr[0];
        for(int i=0;i < n;i++){
            if(largest < arr[i])
                largest = arr[i];
        }
        int sec_largest = Integer.MIN_VALUE;
        for(int i=0;i < n;i++){
            if(arr[i] > sec_largest && arr[i] != largest)
                sec_largest = arr[i];
        }
        System.out.println("Smallest Number:"+smallest);
        System.out.println("Second Smallest Number: "+sec_smallest);
        System.out.println("Largest Element: "+largest);
        System.out.println("Second Largest Number: "+sec_largest);
    }
}
