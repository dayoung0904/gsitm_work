package com.hw.phone;

public class PhoneCompanyInfo extends PhoneInfo{
	private String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company){
		super(name, phoneNumber);
		this.company=company;
	}
	
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("company: "+company);
	}
}