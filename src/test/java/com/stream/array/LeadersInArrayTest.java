package com.stream.array;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.stream.arrstream.ST_04_LeadersInArray;

public class LeadersInArrayTest {
    
    @Test
    public void testLeaders() {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        List<Integer> expected1 = Arrays.asList(17, 5, 2);
        assertEquals(expected1, ST_04_LeadersInArray.leaders(arr1));

        int[] arr2 = {1, 2, 3, 4, 5};
        List<Integer> expected2 = Arrays.asList(5);
        assertEquals(expected2, ST_04_LeadersInArray.leaders(arr2));

        int[] arr3 = {5, 4, 3, 2, 1};
        List<Integer> expected3 = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expected3, ST_04_LeadersInArray.leaders(arr3));

        int[] arr4 = {5, 4, 5, 4, 5};
        List<Integer> expected4 = Arrays.asList(5);
        List<Integer> actual=ST_04_LeadersInArray.leaders(arr4);
        assertEquals(expected4, actual);

        int[] arr5 = {};
        List<Integer> expected5 = Arrays.asList();
        assertEquals(expected5, ST_04_LeadersInArray.leaders(arr5));
    }
}
