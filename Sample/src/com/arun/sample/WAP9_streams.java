package com.arun.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class student{
	private String name;
	private String roll;
	private char grade;
	public student(String name, String roll, char grade) {
		super();
		this.name = name;
		this.roll = roll;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", roll=" + roll + ", grade=" + grade + "]";
	}
	
}
public class WAP9_streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student> s=new ArrayList<>();
		s.add(new student("arun","121",'A'));
		s.add(new student("varun","122",'B'));
		s.add(new student("karun","123",'C'));
		s.add(new student("arjun","124",'D'));
		Map<Object,Long> count=s.stream().collect(Collectors.groupingBy(student::getGrade,Collectors.counting()));

		System.out.println(count);

	}
}
