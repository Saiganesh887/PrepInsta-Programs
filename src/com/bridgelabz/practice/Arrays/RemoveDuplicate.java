package com.bridgelabz.practice.Arrays;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]){
                    for (int k = j; k < n - 1; k++)
                    {
                        arr[k] = arr [k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.println("Array without duplicates: ");
        System.out.println("Array Size: "+n);
        for(int i=0; i<n; i++)
        {
                System.out.print(arr[i] + ",");
        }
    }
}
