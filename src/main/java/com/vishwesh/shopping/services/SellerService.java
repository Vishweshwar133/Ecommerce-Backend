package com.vishwesh.shopping.services;

import java.util.List;

import com.vishwesh.shopping.entities.Seller;

public interface SellerService {
	void registerSeller(Seller seller);
	List<Seller> allSellers();
	Seller findById(int id);
	Seller validate(String userid,String pwd);
	void deleteSeller(int id);
	
}
