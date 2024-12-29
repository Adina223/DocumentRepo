package com.example.demo.Service;

public abstract class ParentDocument implements DocumentService {

	public void printDocument() {
		readData();
		processData();
		printData();
	}

	@Override
	public void readData() {
		System.out.println("read data from db");

	}

}
