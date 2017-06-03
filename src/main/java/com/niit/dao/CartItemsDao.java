package com.niit.dao;

import java.util.List;

import com.niit.model.CartItems;

public interface CartItemsDao {
public boolean saveorupdate(CartItems cartitems);
	
	public boolean delete(CartItems  cartitems);
	
	public CartItems get(String id);
	
	public List<CartItems> list();



}
