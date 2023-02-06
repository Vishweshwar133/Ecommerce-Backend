package com.vishwesh.shopping.services;

import java.util.List;

import com.vishwesh.shopping.entities.Customer;
import com.vishwesh.shopping.entities.Order;

public interface OrderService {

	Order saveOrder(Order order);
	List<Order> getAllOrders();
	List<Order> getCustomerOrders(Customer customer);
	Order findById(int id);
}
