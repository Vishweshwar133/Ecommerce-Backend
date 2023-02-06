package com.vishwesh.shopping.services;

import com.vishwesh.shopping.entities.Payment;

public interface PaymentService {
	Payment savePayment(Payment payment);
	Payment findPaymentById(int id);
}
