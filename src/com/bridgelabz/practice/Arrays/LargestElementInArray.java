package com.bridgelabz.practice.Arrays;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<n;i++){
                if(max < arr[i]){
                    max = arr[i];
            }
        }
        System.out.println("Largest Number In Array is: "+max);
    }
}
