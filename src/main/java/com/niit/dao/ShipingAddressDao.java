package com.niit.dao;

import java.util.List;

import com.niit.model.ShipingAddress;



public interface ShipingAddressDao {
public boolean saveorupdate(ShipingAddress shipingAddress);
	
	public boolean delete(ShipingAddress ShipingAddress);
	
	public ShipingAddress get(String id);
	
	public List<ShipingAddress> list();


}
