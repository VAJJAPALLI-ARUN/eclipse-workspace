package com.arun.sample;
import java.util.*;
public class WAP_9 {
	int c=0, mc=0;
	public int is_Prime(int a){
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
				c++;
		}
		if(c==0)
			return 1;
		else
			return 0;
	}
	public static void main(String []args) {
		int c=0, mc=0;
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		WAP_9 obj=new WAP_9();
		for(int i=1;i<k;i++)
		{
			 int j=obj.is_Prime(i);
			if (j==1)
				mc++;
		}
		System.out.println(mc);
	}
	

}
//WAP that accepts a number between 1 and 1000 inclusive. In the range find whether the number is prime or not, along with total number of factors found for each number. At the end print the total number of prime numbers found.
//Hint: Use appropriate messages for invalid input. Use proper data types and looping construct.
