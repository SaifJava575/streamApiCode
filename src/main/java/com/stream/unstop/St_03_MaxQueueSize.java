package com.stream.unstop;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class St_03_MaxQueueSize {
	
    public static int getMaxQueueSize(int N, int[] arr) {
        final int TIME_WINDOW = 5000;
        
        List<Integer> timestamps = IntStream.of(arr)
                                            .boxed()
                                            .sorted()
                                            .collect(Collectors.toList());
        
        int maxSize = 0;
        int start = 0;

        for (int end = 0; end < timestamps.size(); end++) {
            while (timestamps.get(end) - timestamps.get(start) > TIME_WINDOW) {
                start++;
            }
            maxSize = Math.max(maxSize, end - start + 1);
        }
        
        return maxSize;
    }
    public static void main(String[] args) {
    	 int[] timestamps1 = {1000, 2000, 3000, 4000, 5000, 6000, 7000};
    	 int response=getMaxQueueSize(timestamps1.length, timestamps1);
    	 System.out.println(response);
	}
}
