package com.bridgelabz.practice.Arrays;

import java.util.Scanner;

public class HalfAscendDescend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n/2;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int j=n/2;j<n-1;j++){
                if(arr[j+1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(i=0;i<n;i++)
            System.out.println(arr[i]);
        }
    }
}
