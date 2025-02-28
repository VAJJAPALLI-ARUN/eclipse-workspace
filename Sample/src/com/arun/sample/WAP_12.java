package com.arun.sample;
import java.util.Scanner;
public class WAP_12 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num ");
		int a=sc.nextInt() ;
		int k=a,s=0,r;
		while(k>0) {
			r=k%10;
			s=s*10+r;
			k/=10;
		}
		System.out.println(s);
		if(s==a)
			System.out.println("palin");
		else
			System.out.println("not");
	}

}
