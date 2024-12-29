package com.example.demo.controllerr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DocumentService;

@RestController
public class DocumentController {
	
	@Autowired
	ApplicationContext a;


	@GetMapping("print/{type}")
	public String printDocument(@PathVariable("type") String type ) {
		DocumentService service =  (DocumentService) a.getBean(type);// dependancy pool

		service.printDocument();

		return "data printed";
	}

}
