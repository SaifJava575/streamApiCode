package com.stream.arrstream;
import java.util.Arrays;

public class St_02_MissingNumber {
    public static int missingNumber(int[] arr, int length) {
       int n=arr.length+1;
       int expecetedSum=n*(n+1)/2;
       int actulaSum=Arrays.stream(arr).sum();
       return expecetedSum-actulaSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int length = arr.length;
        System.out.println(missingNumber(arr, length)); // Output: 3

        arr = new int[]{2, 3, 4, 5, 6};
        length = arr.length;
        System.out.println(missingNumber(arr, length)); // Output: 1

        arr = new int[]{1, 2, 3, 4, 5};
        length = arr.length;
        System.out.println(missingNumber(arr, length)); // Output: 6

        arr = new int[]{2};
        length = arr.length;
        System.out.println(missingNumber(arr, length)); // Output: 1

        arr = new int[]{1, 2, 3, 4};
        length = arr.length;
        System.out.println(missingNumber(arr, length)); // Output: 5
    }
}
