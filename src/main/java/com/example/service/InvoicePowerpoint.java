package com.example.service;

public class InvoicePowerpoint extends CommonClass
{

	@Override
	public String ReadData() {
		// TODO Auto-generated method stub
		System.out.println("ReadData from powerpoint");
		return "read the  data";
	}

	@Override
	public String processData() {
		// TODO Auto-generated method stub
		System.out.println("process the data which present in powerpoint");
		return "process the data from pp";
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		System.out.println("printing the data");
		return "prnitng the data from powerpoint";
		
	}

}
