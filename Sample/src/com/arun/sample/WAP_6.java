package com.arun.sample;
import java.util.Scanner;
public class WAP_6 {
	//WAP that accepts a number and prints the given number in word form.
	public static void main(String []args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter  a num");
			int x=s.nextInt();
			//s.close();
			String[] units= {"zero","one","two","three","four","five","six","seven","eight","nine"};
			String[] teens= {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
			String tens[]= {"","", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
			if (x<10) 
				System.out.println(units[x]);
			if (x>9 && x<20)
				System.out.println(teens[x%10]);
			if(x>=20 && x<100)
				if (x%10!=0)
					System.out.println(tens[x/10]+" "+units[x%10]);
				else
					System.out.println(tens[x/10]);
					
				
			
	}


}
