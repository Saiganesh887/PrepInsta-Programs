package com.bridgelabz.practice.Arrays;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Smallest Number In Array is: "+min);
    }
}
