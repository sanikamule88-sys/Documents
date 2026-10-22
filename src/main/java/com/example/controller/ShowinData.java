package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.Invoice;

@RestController
public class ShowinData
{
@GetMapping("print/{type}")
	public String print(@PathVariable String type) 
	{
		Invoice i= Factory.createObject(type);
		i.ReadData();
		i.processData();
		return i.print();
	
		
	}
}
