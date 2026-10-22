package com.example.controller;

import com.example.service.Invoice;
import com.example.service.InvoiceExcel;
import com.example.service.InvoicePdf;
import com.example.service.InvoicePowerpoint;

public class Factory 
{
public static Invoice createObject (String type)
{
	if(type.equals("pdf"))
	{
		InvoicePdf i=new InvoicePdf();
		return i;
	}
	if(type.equals("excel"))
	{
		InvoiceExcel i2=new InvoiceExcel();
		return i2;
	}
	if (type.equals("powerpoint")) 
	{
	
		InvoicePowerpoint i3= new InvoicePowerpoint();
		return  i3;
		}
	return null;
}
}
