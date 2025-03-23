package com.arun.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WAP1_Streams {
	public static boolean comparingfun(String n) {
		String v="aeiou";
		return v.indexOf(n.charAt(0))!=-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nums=Arrays.asList("ai","ml","ds","ipl");
		  Map<String, List<String>> words = nums.stream()
	                .collect(Collectors.groupingBy(n -> comparingfun(n) ? "vowels" : "consonants"));
		System.out.println(words);

	}
}
