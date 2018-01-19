package com.pluralsight.cxfdemo.orders;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.schema.order.OrderInquiryResponseType;
import com.pluralsight.schema.order.OrderInquiryType;
import com.pluralsight.service.orders.Orders;

@WebService(portName = "OrdersSOAP", serviceName = "Orders", endpointInterface = "com.pluralsight.service.orders.Orders", targetNamespace = "http://www.pluralsight.com/service/Orders/")
public class DefaultOrdersEndpoint implements Orders {

	/* How does autowire work in Spring?
	* Spring looks for a matching class in the files marked with a Spring component annotation (@Service, @Repository, @Controller)
	* The configuration <context:component-scan base-package="com.pluralsight.cxfdemo" /> in beans.xml defines where to look for these components.
	* Autowire allows Spring to inject the order service containing core
	* business logic.
	*/
	@Autowired
	private OrderService orderService;

	@Override
	public OrderInquiryResponseType processOrderPlacement(OrderInquiryType orderInquiry) {
		OrderInquiryResponseType response = orderService.processOrder(orderInquiry.getUniqueOrderId(),
				orderInquiry.getOrderQuantity(), orderInquiry.getAccountId(), orderInquiry.getEan13());
		return response;
	}

}
