package com.arun.sample;

class BillGenerator{
	private String  uscNo;
	private String UserName;
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	private String add;
	private int prevUnits;
	private int currUnit;
	
	public String getUcsNo()
	{
		return uscNo;
	}
	public void setUscNo(String ucsNo)
	{
		this.uscNo=uscNo;
	}
	
}
public class Electric_bill_Generator {
	public static void main(String []args) {
		//BillGenerator o=new BillGenerator;
		//o.uscNO="1234";
		//System.out.println(o.uscNO);
		BillGenerator o1=new BillGenerator;
		o1.setUscNo("1234");
		String ucsNo=o1.getUcsNo();
		System.out.println(o1.uscNo);
		
		
	}

}
//for cretaing getter and setter for all ->go for source and click on Generate Getters and Setters
