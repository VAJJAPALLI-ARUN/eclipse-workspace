package com.arun.sample;
class base {
	public base() {
		super();
		System.out.println("base");
	}
	public base(msg) {
		System.out.println("base "+msg);
	}
class derived extends base{
	
	public derived() {
		super(msg);
		System.out.println("base");
	}
	
}

}

public class inheritance {
	public static void main(String []args) {
		derived d=new derived("ih");
	}

}
