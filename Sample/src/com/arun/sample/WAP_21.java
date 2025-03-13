package com.arun.sample;

import java.util.Scanner;
//21. WAP that accepts a string and finds all the duplicate characters in the given string.
public class WAP_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String k="";
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					k=k+s.charAt(i);
					
				}
			}
		}
		

	}

}
