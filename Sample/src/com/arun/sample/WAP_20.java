package com.arun.sample;

import java.util.Scanner;
//20. WAP that accepts a string and counts total vowels and consonants in the given string.

public class WAP_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String k="aeiou";
		int cc=0,vc=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			
			if(k.indexOf(s.charAt(i))!=-1)
				vc++;
			else
				cc++;
		}
		System.out.println("vowels = "+vc+" \nconsonants = "+cc);

	}

}
