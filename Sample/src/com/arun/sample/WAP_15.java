package com.arun.sample;
import java.util.Scanner;
public class WAP_15 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String as=Integer.toString(a);
		String s[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		for(int i=0;i<as.length();i++) {
			System.out.print(s[as.charAt(i) - '0']+" ");
		}
	
	}

}
