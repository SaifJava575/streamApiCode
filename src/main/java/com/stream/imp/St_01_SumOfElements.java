package com.stream.imp;

import java.util.Arrays;
import java.util.List;

public class St_01_SumOfElements {
	
	//https://medium.com/@bhangalekunal2631996/java-stream-api-coding-interview-questions-and-answers-2a212505e1c6

	public static void main(String[] args) {
  
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		int sum=list.stream().mapToInt(Integer::intValue).sum();
			
		int max=list.stream().mapToInt(Integer::intValue).max().orElseThrow();
		int min=list.stream().mapToInt(Integer::intValue).min().orElseThrow();
		double avg=list.stream().mapToDouble(Integer::intValue).average().orElseThrow();
        long count=list.stream().count();
		
		System.out.println("The Sum of the Element is :"+sum);
		System.out.println("The maximum Element is ::"+max);
		System.out.println("The minmum Element is ::"+min);
		System.out.println("The avagrage element is ::"+avg);
		System.out.println("The number of Element is ::"+count);
	}
}
