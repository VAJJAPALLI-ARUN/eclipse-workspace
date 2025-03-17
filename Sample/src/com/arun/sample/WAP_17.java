package com.arun.sample;

import java.util.Random;
import java.util.Scanner;

public class WAP_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int a[]=new int[n];
		Random r=new Random();
		for(int i=0;i<n;i++) {
			a[i]=r.nextInt(100);
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
