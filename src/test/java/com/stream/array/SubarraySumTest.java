package com.stream.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SubarraySumTest {

    @Test
    public void testSubarrayExists() {
        int[] arr = {1, 2, 3, 7, 5};
        int n = arr.length;
        int s = 12;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 4)); // Subarray from index 2 to 4
        assertEquals(expected, Ar_01_SubArrayWithGivenSum.subarraySum(arr, n, s));
    }

    @Test
    public void testSubarrayDoesNotExist() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int s = 20;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-1)); // No subarray found
        assertEquals(expected, Ar_01_SubArrayWithGivenSum.subarraySum(arr, n, s));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int n = arr.length;
        int s = 0;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-1)); // No subarray found
        assertEquals(expected, Ar_01_SubArrayWithGivenSum.subarraySum(arr, n, s));
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {5};
        int n = arr.length;
        int s = 5;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 1)); // Subarray is the element itself
        assertEquals(expected, Ar_01_SubArrayWithGivenSum.subarraySum(arr, n, s));
    }


    @Test
    public void testMultiplePossibleSubarrays() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int s = 9;
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 4)); // Subarray from index 2 to 4
        assertEquals(expected, Ar_01_SubArrayWithGivenSum.subarraySum(arr, n, s));
    }
}
