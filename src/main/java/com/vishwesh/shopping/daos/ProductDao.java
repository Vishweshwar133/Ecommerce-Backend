package com.vishwesh.shopping.daos;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishwesh.shopping.entities.Product;
import com.vishwesh.shopping.entities.Seller;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
	List<Product> findBySeller(Seller sellerId,Sort sort);
	List<Product> findByPcatAndSubcat(String pcat,String subcat,Sort sort);
}
