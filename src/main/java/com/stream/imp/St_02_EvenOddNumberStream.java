package com.stream.imp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class St_02_EvenOddNumberStream {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> even=list.stream().filter(num->num%2==0).collect(Collectors.toList());
		List<Integer>  odd=list.stream().filter(num->num%2==1).collect(Collectors.toList());
		
		System.out.println("The Even number is ::"+even);
        System.out.println("The Odd Number is ::"+odd);
	}

}
