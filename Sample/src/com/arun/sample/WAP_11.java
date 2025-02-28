package com.arun.sample;
import java.util.*;
public class WAP_11 {
	public static int addd(int m){
		int s=0;
		while(m>0)
		{
			s+=m%10;
			m=m/10;
		}
		return s;
	}
	public static void main(String []args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num");
	int k=sc.nextInt();
	while(k>=10)
	{
		k=addd(k);
	}
	if (k==1)
		System.out.println("magic "+k);
	else
		System.out.println("not "+k);
	}
}
