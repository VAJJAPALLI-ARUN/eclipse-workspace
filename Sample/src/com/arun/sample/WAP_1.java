package com.arun.sample;
//...
import java.util.Scanner;

public class WAP_1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 integers and a target");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if (a+b==c)
			System.out.println("true");
		else
			System.out.println("false");
	}


}
