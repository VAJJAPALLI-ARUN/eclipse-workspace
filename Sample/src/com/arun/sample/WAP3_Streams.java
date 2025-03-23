package com.arun.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WAP3_Streams {
	public static int count(String s) {
		String ss="aeiou";
		int c=0;
		for(char ch:s.toCharArray()) {
			if(ss.indexOf(ch)!=-1)
				c++;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words=Arrays.asList("arun","sai","ram","ae","aei","oui","aeio","aeiou");
		Map<Object,List<String>> vowelsCnt=words.stream()
				.collect(Collectors.groupingBy(s->count(s)));
		System.out.println(vowelsCnt);

	}

}
