package com.stream.imp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class St_05_PrimeNumberStreamApi {

	public static int[] checkPrime(List<Integer> num) {
		int res[] = new int[num.size()];
		int j = 0;
		for (int i = 0; i < num.size(); i++) {
			if (isPrime(num.get(i))) {
				res[j] = num.get(i);
				j++;
			} else
				continue;
		}
		return res;
	}

	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		double sqrt = Math.sqrt(n);
		for (int i = 2; i <= sqrt; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		int res[]=checkPrime(numbers);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		List<Integer> prime=numbers.stream().filter(St_05_PrimeNumberStreamApi::isPrime).collect(Collectors.toList());
        System.out.println(prime);
	}

}
