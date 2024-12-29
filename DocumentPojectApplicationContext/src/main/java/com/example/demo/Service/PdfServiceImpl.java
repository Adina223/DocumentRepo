package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class PdfServiceImpl extends ParentDocument {

	@Override
	public void processData() {

		System.out.println("process data for service");
	}

	@Override
	public void printData() {

		System.out.println("print service");

	}

}
