package com.bridgelabz.practice.Arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int[] arr = new int[n];
        for(int i=0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Elements to search: ");
        int search = sc.nextInt();
        for(int i=0;i < n;i++) {
            if (search == arr[i])
                System.out.println("Searched Element Found: " + search);
        }
        System.out.println("Searched Element is not present in array.");
    }
}
