package com.bridgelabz.practice.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int[] arr = new int[n];
        int sort, count = 0,max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    sort = arr[i];
                    arr[i] = arr[j];
                    arr[j] = sort;
                }
            }
            if (i > 0 && arr[i] == arr[i - 1] + 1) {
                count++;
            } else if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            } else {
                count = 1;
            }
                max = Math.max(max,count);
        }
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("Longest consecutive Elements: " + max);
    }
}
