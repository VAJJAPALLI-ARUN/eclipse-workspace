package com.arun.sample;

import java.util.Scanner;
//19. WAP that accepts a string and checks if the given string is palindrome or not.
public class WAP_19 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int flg=0;
		int j=s.length()-1;
		for(int i=0;i<=j;i++) {
			if(s.charAt(i)!=s.charAt(j)) {
				flg=1;
				break;
			}
			j--;
		}
		if(flg==1) {
			System.out.println("Not palin");
		}
		else
			System.out.println("palin");
	}

}
