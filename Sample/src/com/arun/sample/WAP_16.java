package com.arun.sample;

import java.util.Scanner;

public class WAP_16 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter vals for 5kg bag and 1kg bag and enter the kgs need to be filed");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	a=a*5;
	int ac=0,bc=0;
	while(c>0) {
		if(c<a) {
			a-=5;
			c-=5;
			ac++;
		}
		else {
			
			b-=c;
		}
			
	}
	System.out.println(ac+" of 5kg and "+bc+" of 1kg ");
}
}
