package com.example.demoFactory;

import com.example.demo.Service.DocumentService;
import com.example.demo.Service.ExcelServiceImpl;
import com.example.demo.Service.PdfServiceImpl;

public class DocumentFactory {

	public static DocumentService getDocumentObject(String type) {
		if (type.equals("pdfServiceImpl")) {
			PdfServiceImpl p = new PdfServiceImpl();
			return p;
		}

		if (type.equals("excelServiceImpl")) {
			ExcelServiceImpl e = new ExcelServiceImpl();
			return e;
		}

		return null;

	}
}
