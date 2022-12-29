package com.bridgelabz.practice.Arrays;

import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] fre = new int[n];
        System.out.println("Enter array Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            fre[i] = 1;
        }
        for(int i=0;i<n;i++) {
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                    fre[j] = 0;
                }
            }
            if(fre[i] != 0)
            {
                fre[i] = count;
            }
        }
        System.out.print("Frequency of all elements of array : " + '\n');
        for(int i=0; i<n; i++)
        {
            if(fre[i] != 0)
            {
                System.out.print(arr[i] + " occurs " + fre[i] + " times" + '\n');
            }
        }
    }
}
