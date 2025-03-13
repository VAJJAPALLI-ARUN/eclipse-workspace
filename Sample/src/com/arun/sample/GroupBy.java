package com.arun.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class stud{
	private int roll;
	private  String name;
	private int age;
	private String branch;
	public stud(int roll, String name, int age, String Branch){
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.branch=branch;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "stud [roll=" + roll + ", name=" + name + ", age=" + age + ", branch=" + branch + "]";
	}
	
}

public class GroupBy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
//		Map<Object,List<Integer>> numsbyEvenOdd = nums.stream()
////				.collect(Collectors.groupingBy(n -> n%2 = 0 ? "even":"odd"));
//				.collect(Collectors.groupingBy(n->n%2 == 0 ? "even" : "odd"));
//		System.out.println(numsbyEvenOdd);
		
		
		List<String> strs=Arrays.asList("arun","aruna","sai","sasi","ram");
		Map<Object,List<String>> groupingStrs=strs.stream()
				.collect(Collectors.groupingBy(n->n.charAt(n.length()-1)));//n.length()
		System.out.println(groupingStrs);
		
		
//		List<stud> students=new ArrayList<>();
//		students.add(new stud(1,"arun",22,"It"));
//		students.add(new stud(2,"sai",23,"cse"));
//		Map<Object,List<stud>> studGrouping =students.stream()
//			.collect(Collectors.groupingBy(n->(n.getName())));
//		System.out.println(studGrouping);
		
		//List<Integer> nums=Arrays.asList(1,2,3,4,5);
//		Integer sum=nums.stream().reduce(0,(x,y)->x+y);
//		System.out.println(sum);
//		
//		IntSummaryStatistics summaryStatistics =nums.stream().mapToInt(x->x).summaryStatistics();
//		System.out.println(summaryStatistics);
		
		
//		List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
//		double avgOfOdd=nums.stream()
//				.filter(n->n%2!=0).mapToInt(n->n)
//				.summaryStatistics().getAverage();
//		System.out.println(avgOfOdd);

	}

}
