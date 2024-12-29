package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class ExcelServiceImpl extends ParentDocument {

	@Override
	public void processData() {

		System.out.println("process data for excel");

	}

	@Override
	public void printData() {

		System.out.println("print excel");

	}

}
