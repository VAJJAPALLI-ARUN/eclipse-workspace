package com.arun.sample;

import java.util.Scanner;

public class Sample {
	public int fun(int a, int b)
	{
		try {
			return a/b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public static void main(String[] args) {
		
		
		Sample obj=new Sample();
		int t=obj.fun(2,0);
		System.out.println(t);
	

		
	}

}
