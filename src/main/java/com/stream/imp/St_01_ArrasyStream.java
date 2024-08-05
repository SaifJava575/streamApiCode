package com.stream.imp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class St_01_ArrasyStream {
	
	//https://medium.com/@bhangalekunal2631996/java-stream-api-coding-interview-questions-and-answers-2a212505e1c6

	public static void main(String[] args) {
  
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum=list.stream().mapToInt(Integer::intValue).sum();
			
		int max=list.stream().mapToInt(Integer::intValue).max().orElseThrow();
		int min=list.stream().mapToInt(Integer::intValue).min().orElseThrow();
		double avg=list.stream().mapToDouble(Integer::intValue).average().orElseThrow();
        long count=list.stream().count();
        List<Integer>square=list.stream().map(n->n*n).collect(Collectors.toList());
        int product=list.stream().reduce(1,(a,b)->a*b);
        int sumOfList=list.stream().reduce(0, (a,b)->a+b);
       List<Integer> divisibleNumber= list.stream().filter(n-> (n%3==0 || n%5==0)).collect(Collectors.toList());
		
		System.out.println("The Sum of the Element is :"+sum);
		System.out.println("The maximum Element is ::"+max);
		System.out.println("The minmum Element is ::"+min);
		System.out.println("The avagrage element is ::"+avg);
		System.out.println("The number of Element is ::"+count);
		System.out.println("Sqaure of the Integer is "+square);
		System.out.println("The product of the Array is :"+product);
		System.out.println("the sum of the Product is :"+sumOfList);
		System.out.println("The divisible number is :"+divisibleNumber);
	}
}
