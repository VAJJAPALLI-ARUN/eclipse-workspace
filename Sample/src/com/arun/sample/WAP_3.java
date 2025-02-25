package com.arun.sample;

import java.util.Scanner;

public class WAP_3 {
	//WAP to convert the given height in feet and inches to centimeters.
	//Hint: 1 foot = 12 inches
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  height");
		int a=s.nextInt();
		System.out.println(a*12);
	}
}
