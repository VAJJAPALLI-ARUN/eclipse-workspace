package com.arun.sample;
import java.util.*;
class Student{
	String  name;
	int roll;
	int attend;
	public void EnterDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter roll number");
		int roll=sc.nextInt();
		System.out.println("enter attendence");
		int attend=sc.nextInt();
	}
	
}
public class first_Project {
	public static void main(String []args) {
		Student stud=new Student();
		while(1)
		{
			stud.EnterDetails();
			System.out.println("To enter another person's details enter yes");
			String yes=sc.next();
			if( yes!="yes" || yes!="Yes")
				break;
		}
		
	}
	

}
