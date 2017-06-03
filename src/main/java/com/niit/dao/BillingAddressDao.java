package com.niit.dao;

import java.util.List;

import com.niit.model.BillingAddress;



public interface BillingAddressDao {
public boolean saveorupdate(BillingAddress billingAddress);
	
	public boolean delete(BillingAddress billingAddress);
	
	public BillingAddress get(String id);
	
	public List<BillingAddress> list();
	
}
