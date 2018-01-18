package com.pluralsight.cxfdemo;

import javax.jws.WebService;

//The HelloWorld interface is the contract for our web service endpoint
//It contains the JAX-WS annotation of web service to identify it as the endpoint interface

@WebService
public interface HelloWorld {
    
	//A service method named sayHi
	String sayHi(String text);
}

