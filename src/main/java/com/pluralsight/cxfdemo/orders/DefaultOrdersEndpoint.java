package com.pluralsight.cxfdemo.orders;

import javax.jws.WebService;

import schema.order.AccountType;
import schema.order.ObjectFactory;
import schema.order.OrderInquiryResponseType;
import schema.order.OrderInquiryType;
import service.orders.Orders;

@WebService(portName="OrdersSOAPFoo", serviceName="OrdersFooBaz", endpointInterface="service.orders.Orders", 
targetNamespace="http://www.foos.com/service/Orders/")
public class DefaultOrdersEndpoint implements Orders {
	
	@Override
	public OrderInquiryResponseType processOrderPlacement(OrderInquiryType orderInquiry) {
		ObjectFactory objectFactory = new ObjectFactory();
		OrderInquiryResponseType response = objectFactory.createOrderInquiryResponseType();
		AccountType account = objectFactory.createAccountType();
		account.setAccountId(1);
		response.setAccount(account);
		return response;
	}

}
