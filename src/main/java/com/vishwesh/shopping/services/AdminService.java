package com.vishwesh.shopping.services;

import com.vishwesh.shopping.entities.Admin;

public interface AdminService {
	Admin validate(String userid,String pwd);
	void updateAdmin(Admin amin);
	long countAdmin();
}
