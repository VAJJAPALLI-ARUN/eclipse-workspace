package com.arun.sample;
import java.util.Scanner;
public class WAP_13 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num ");
		int a=sc.nextInt() ;
		int k,s=0,r;
		for(int i=1;i<a;i++) {
			k=i;
			while(k>0) {
				r=k%10;
				s=s*10+r;
				k/=10;
		}
		if(s==i)
			System.out.println(s+" ");
		s=0;
		}
	}

}
