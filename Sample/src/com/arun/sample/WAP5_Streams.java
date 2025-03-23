package com.arun.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WAP5_Streams {

	public static boolean primeNum(int n) {
		int c=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				c++;
		}
		return c==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9);
		Map<Object,List<Integer>> pnum=nums.stream()
				.collect(Collectors.groupingBy(n->primeNum(n)?"prime":"not A Prime"));
		System.out.println(pnum);

	}

}
