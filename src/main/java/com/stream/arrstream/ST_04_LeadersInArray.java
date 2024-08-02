package com.stream.arrstream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ST_04_LeadersInArray {
    public static List<Integer> leaders(int[] arr) {
       

        // Find leaders using Streams
        List<LeaderEntry> leaders = IntStream.range(0, arr.length)
            .mapToObj(i -> new LeaderEntry(i, arr[i]))
            .sorted((a, b) -> Integer.compare(b.value, a.value)) // Sort by value in descending order
            .collect(Collectors.toList());

        // Filter leaders based on the original array
        return leaders.stream()
            .filter(entry -> entry.index == leaders.stream()
                .filter(e -> e.value >= entry.value)
                .mapToInt(e -> e.index)
                .max()
                .orElse(-1))
            .map(entry -> entry.value)
            .collect(Collectors.toList());
    }

    // Helper class to store index and value
    private static class LeaderEntry {
        int index;
        int value;

        LeaderEntry(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = leaders(arr);
        System.out.println(leaders); // Output will be [17, 5, 2]
    }
}
