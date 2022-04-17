package com.company.firsthomework;


public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 25, 7, 100, 35, 310};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        {
            System.out.println("Largest element present in given array: " + max);
        }
    }
}