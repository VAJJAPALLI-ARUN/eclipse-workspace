package com.arun.sample;

import java.util.Scanner;

public class WAP_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.contains(s2)) {
			System.out.println("True");
		}
		else
			System.out.println("False");

	}

}
// WAP that accepts two strings and checks whether the second string exists in the first string