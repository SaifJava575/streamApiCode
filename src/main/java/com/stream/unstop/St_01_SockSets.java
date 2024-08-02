package com.stream.unstop;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class St_01_SockSets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of pairs of socks
        int n = scanner.nextInt();
        
        // Read the colors of each pair of socks
        int[] socks = new int[n];
        for (int i = 0; i < n; i++) {
            socks[i] = scanner.nextInt();
        }
        
        // Use Stream API to count occurrences of each color
        Map<Integer, Long> sockCount = Arrays.stream(socks)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Calculate the number of sets of 3 socks for each color
        long setsCount = sockCount.values().stream()
            .mapToLong(count -> (count * 2) / 3) // Since each entry represents two socks
            .sum();

        // Output the total number of sets of 3 socks
        System.out.println(setsCount);

        scanner.close();
    }
}
