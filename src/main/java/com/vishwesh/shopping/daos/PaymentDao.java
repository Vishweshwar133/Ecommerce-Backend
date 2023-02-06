package com.vishwesh.shopping.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishwesh.shopping.entities.Payment;

public interface PaymentDao extends JpaRepository<Payment, Integer> {

}
