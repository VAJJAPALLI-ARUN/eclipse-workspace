package com.arun.sample;
import java.util.Scanner;
public class WAP_7 {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if( a%4==0 && a%100!=0 || a%400==0) 
			System.out.println("Leapyr");
		else
			System.out.println("Not Laep yr");
	}

}
