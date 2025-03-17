package com.arun.sample;

import java.util.Scanner;

public class WAP_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine() ;
		int c=0;
		char ans[]=s.toCharArray();
		for(int i=0;i<ans.length;i++) {
			if(!Character.isLetterOrDigit(ans[i]))
				c++;
		}
		
		System.out.println("special char count - "+c);
	}

}
