package com.arun.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WAP4_Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(1,2,3,12,13,14,23,34,35,45,46,45,56,57,58,67,68,69,78,79,70,88,99,100);
		Map<Object,List<Integer>> range=nums.stream()
				.collect(Collectors.groupingBy(n-> n<0 ? "-ve":
					(n>=0 && n<11)? "0 - 10":
					(n>10 && n<21)? "11 - 20":
					n>20 && n<31? "21 - 30":
					n>30 && n<41? "31 - 40":
					n>40 && n<51? "41 - 50":
					n>50 && n<61? "51 - 60":
					n>60 && n<71? "61 - 70":
					n>70 && n<81? "71 - 80":
					n>80 && n<91? "81 - 90":
					n>90 && n<101? "91 - 100":"greater than 100"));
		System.out.println(range);

	}

}
