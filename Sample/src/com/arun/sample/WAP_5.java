package com.arun.sample;
import java.util.Scanner;
public class WAP_5 {
    	//WAP that accepts time in minutes and seconds. Then it should also print the time in "XXh YYm ZZs" format.Validations:
		//1. The value for seconds and minutes must be > = 0 and <= 59. 
		//2. Handle invalid data entry with appropriate messages.
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  tym in min and sec");
		int v=s.nextInt();
		int n=s.nextInt();
		public static void fun(x) {
		if(x<60)
			//System.out.println("00h "+ "00m "+x+"s");
		if(x>60 && x<3600) {
			int m=x/60;
			int sec=x-(m*60);
			//System.out.println("00h "+ m+"m "+sec+"s");
		}
		if(x>=3600) {
			int h=x/3600;
			int m=(x-(h*3600))/60;
			int sec=x%60;
		}
		}
		System.out.println(h+"h "+ m+"m "+sec+"s");
		WAP_5 obj=new Wap_5;
		obj.fun(v);
		obj.fun(n);
	}

}
