package com.arun.sample;
import java.util.Scanner;
public class WAP_4 {
	//WAP that accepts time in seconds. Then it should print the time in "XXh YYm ZZs" format.
	//Hint: 1 hour = 60 minutes = 3600 seconds
	public static void main(String []args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  tym in sec");
		int x=s.nextInt();
		if(x<60)
			System.out.println("00h "+ "00m "+x+"s");
		if(x>60 && x<3600) {
			int m=x/60;
			int sec=x-(m*60);
			System.out.println("00h "+ m+"m "+sec+"s");
		}
		if(x>=3600) {
			int h=x/3600;
			int m=(x-(h*3600))/60;
			int sec=x%60;
			System.out.println(h+"h "+ m+"m "+sec+"s");
		}
	}

}
