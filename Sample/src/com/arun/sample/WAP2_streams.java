package com.arun.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WAP2_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(2,5,7,21,22,55,77);
		Map<String,List<Integer>> div=nums.stream()
				.collect(Collectors.groupingBy(n->n%2==0?"div by 2":
						n%5==0?"div by 5":"div by neither"));
		System.out.println(div);
		

	}

}
