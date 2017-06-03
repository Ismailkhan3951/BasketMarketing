package com.niit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Cart")
@Component
public class Cart 
{
	@Id
	private String Cart_Id;
	private double Grand_total=00.0;
	private int Total_item=0;
	
	@OneToMany
	private List<CartItems> cartitems;
	
	
	public List<CartItems> getCartitems() {
		return cartitems;
	}
	public void setCartitems(List<CartItems> cartitems) {
		this.cartitems = cartitems;
	}
	public String getCart_Id() {
		return Cart_Id;
	}
	public void setCart_Id(String cart_Id) {
		Cart_Id = cart_Id;
	}
	public double getGrand_total() {
		return Grand_total;
	}
	public void setGrand_total(double grand_total) {
		Grand_total = grand_total;
	}
	public int getTotal_item() {
		return Total_item;
	}
	public void setTotal_item(int total_item) {
		Total_item = total_item;
	}
	
}
