package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class OrderItems {
	@Id
	private String OrderItem_id;

	@ManyToOne
	@JoinColumn(name="Order_id")
	Order order;
	private String P_id;
	public String getOrderItem_id() {
		return OrderItem_id;
	}
	public void setOrderItem_id(String orderItem_id) {
		OrderItem_id = orderItem_id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getP_id() {
		return P_id;
	}
	public void setP_id(String p_id) {
		P_id = p_id;
	}
	
	

}
