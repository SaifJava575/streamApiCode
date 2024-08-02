package com.stream.imp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class St_04_StringStream {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("banana", "apple", "orange", "grape");
		char ch='a';
		long count=strings.stream().filter(str->str.contains(String.valueOf(ch))).count();
		List<String> upperCase=strings.stream().map(String::toUpperCase).collect(Collectors.toList());		
		List<String> lowerCase=strings.stream().map(String::toLowerCase).collect(Collectors.toList());
		List<String> sort=strings.stream().sorted().collect(Collectors.toList());
		String concatanate=strings.stream().collect(Collectors.joining());
		String maxLength=strings.stream().max((str1,str2)->str1.length()-str2.length()).get();
		
		System.out.println("specific character :"+ch+" "+count);
		System.out.println("The Uppercase of the String is :"+upperCase);
		System.out.println("Collect the String is :"+lowerCase);
		System.out.println("Sort the alphabetical order :"+sort);
		System.out.println("The Concatanation of the String is :"+concatanate);
		System.out.println("Longest String is :"+maxLength);
		

	}

}
