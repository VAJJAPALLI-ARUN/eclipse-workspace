package com.arun.sample;

import java.util.Scanner;

public class WAP_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String ans="";
		int i=0;
		for(char c: s.toCharArray()) {
			if(i%2==0) {
				ans=ans+Character.toUpperCase(c);
			}
			else
				ans+=c;
			i++;
		}
		System.out.println(ans);
		

	}

}
