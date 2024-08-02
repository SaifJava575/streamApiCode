package com.stream.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    @Test
    public void testMissingNumberMiddle() {
        int[] arr = {1, 2, 4, 5, 6};
        int length = arr.length;
        int expected = 3;
        assertEquals(expected, Ar_02_MissingNumberArray.missingNumber(arr, length));
    }

    @Test
    public void testMissingNumberStart() {
        int[] arr = {2, 3, 4, 5, 6};
        int length = arr.length;
        int expected = 1;
        assertEquals(expected, Ar_02_MissingNumberArray.missingNumber(arr, length));
    }

    @Test
    public void testMissingNumberEnd() {
        int[] arr = {1, 2, 3, 4, 5};
        int length = arr.length;
        int expected = 6;
        assertEquals(expected, Ar_02_MissingNumberArray.missingNumber(arr, length));
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {2};
        int length = arr.length;
        int expected = 1;
        assertEquals(expected, Ar_02_MissingNumberArray.missingNumber(arr, length));
    }

    @Test
    public void testMissingNumberNoMissing() {
        int[] arr = {1, 2, 3, 4};
        int length = arr.length;
        int expected = 5;
        assertEquals(expected, Ar_02_MissingNumberArray.missingNumber(arr, length));
    }
}
