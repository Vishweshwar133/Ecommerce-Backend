package com.vishwesh.shopping.services;

import java.util.List;

import com.vishwesh.shopping.entities.Order;
import com.vishwesh.shopping.entities.OrderDetails;

public interface OrderdetailService {

	void saveOrderDetails(OrderDetails od);
	OrderDetails findById(int id);
	List<OrderDetails> findByOrder(Order order);
}
