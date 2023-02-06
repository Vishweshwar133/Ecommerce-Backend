package com.vishwesh.shopping.services;

import com.vishwesh.shopping.entities.Address;

public interface AddressService {
	Address saveAddress(Address address);
	Address findAddress(int id);
}
