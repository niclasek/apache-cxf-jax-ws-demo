package com.pluralsight.cxfdemo.orders;

import javax.jws.WebService;

import com.pluralsight.schema.order.AccountType;
import com.pluralsight.schema.order.ObjectFactory;
import com.pluralsight.schema.order.OrderInquiryResponseType;
import com.pluralsight.schema.order.OrderInquiryType;
import com.pluralsight.service.orders.Orders;

@WebService(portName="OrdersSOAP", serviceName="Orders", endpointInterface="com.pluralsight.service.orders.Orders", 
targetNamespace="http://www.pluralsight.com/service/Orders/")
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
