package com.arun.sample;
import java.util.Scanner;
public class WAP_14 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();                  
		if((a<10&& a>100) && (b<10&& b>100))
			System.out.println("enter valid data");
		else
		{
			String as=Integer.toString(a);
			String bs=Integer.toString(b);
			for(int i=0;i<as.length();i++)
				for(int j=0;j<bs.length();j++) {
					if(as.charAt(i)==bs.charAt(j)) {
						System.out.println(as.charAt(i));
						break;
					}
						
				}
		}
	}

}
