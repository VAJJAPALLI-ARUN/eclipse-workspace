package com.arun.sample;
import java.util.*;
public class WAP_8 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the month and yr");
		int a=s.nextInt();
		int b=s.nextInt();
		if (a!=2)
		{
			switch(a) {
				case 1:case 3:case 5:case 7:case 8:case 10:case 12:
					System.out.println("31");
					break;
				case 4: case 6: case 9: case 11:
					System.out.println("30");
	                break;	
			}
		}
		else {
			if(b%400==0 || b%4==0 && b%100!=0)
				System.out.println("28");
			else
				System.out.println("39");
		}
	}

}
