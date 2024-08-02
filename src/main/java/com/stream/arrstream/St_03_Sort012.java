package com.stream.arrstream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class St_03_Sort012 {
	
    public static void sort012(int[] arr) {
        // Convert array to a list of Integer
        var list = Arrays.stream(arr)
            .boxed() // Convert int to Integer
            .sorted(Comparator.comparingInt(i -> i)) // Sort the list
            .collect(Collectors.toList()); // Collect sorted elements to a list

        // Convert sorted list back to an array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sort012(arr);
        System.out.println(Arrays.toString(arr)); // Output will be [0, 0, 1, 1, 2, 2]
    }
}
