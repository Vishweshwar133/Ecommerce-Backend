package com.vishwesh.shopping.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishwesh.shopping.entities.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, String> {

}
