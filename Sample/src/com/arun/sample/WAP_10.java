package com.arun.sample;
import java.util.*;
//WAP that loops between 1 and 1000 inclusive. Accept 2 numbers and print out the numbers that are divisible by given 
//2 numbers.Once after finding 5 numbers, come out of the loop and print the sum of all the 3 numbers
public class WAP_10 {
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int k=0,x=0;
		for(int i=1;i<1000;i++)
		{
			if(i%a==0 && i%b==0) {
				k++;
				x+=i;
			}
			if (k==3)
				break;
			
		}
		System.out.println(x);
	}

}
