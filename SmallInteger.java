package com.bentley.system;

import java.util.Arrays;

public class SmallInteger {
	static int solution(int[] a) {
		Arrays.sort(a);
		int n = 1;
		for(int i = 0;i < a.length;i++) {
			if(a[i]>0) {
				if(a[i] == n)
					n++;
				else if(a[i] < n)
					continue;
				else
					return n;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3};
		solution(a);
	}
}
