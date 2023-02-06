package com.vishwesh.shopping.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishwesh.shopping.entities.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {

}
