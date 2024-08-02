package com.stream.unstop;

import java.util.stream.IntStream;

public class St_02_SetFrequencyCount {

	public static void main(String[] args) {
		int n=5;
		int res=setFrequncyCount(n);
		System.out.println(res);

	}

	private static int setFrequncyCount(int n) {
		return (int) IntStream.rangeClosed(1, n).mapToLong(Integer::bitCount).sum();
	}

}
