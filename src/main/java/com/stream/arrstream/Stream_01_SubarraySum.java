package com.stream.arrstream;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Stream_01_SubarraySum {

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] prefixSum = new int[n + 1];
        IntStream.range(1, n + 1).forEach(i -> prefixSum[i] = prefixSum[i - 1] + arr[i - 1]);

        boolean found = IntStream.range(0, n)
            .anyMatch(i -> IntStream.range(i + 1, n + 1)
                .filter(j -> prefixSum[j] - prefixSum[i] == s)
                .peek(j -> {
                    result.add(i + 1);
                    result.add(j);
                })
                .findFirst()
                .isPresent()
            );

        if (!found) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int s = 12;
        System.out.println(subarraySum(arr, n, s)); // Output: [2, 4]

        arr = new int[]{1, 2, 3, 4, 5};
        n = arr.length;
        s = 20;
        System.out.println(subarraySum(arr, n, s)); // Output: [-1]
    }
}
