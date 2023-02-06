package com.vishwesh.shopping.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishwesh.shopping.entities.Order;
import com.vishwesh.shopping.entities.OrderDetails;

@Repository
public interface OrderDefailsDao extends JpaRepository<OrderDetails, Integer> {
	List<OrderDetails> findByOrder(Order order);
}
