package com.niit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table(name="Orders")
@Component
public class Order {
	@Id
	private String Order_id;
	
	@OneToOne
	@JoinColumn(name ="Bill_id")
	BillingAddress billingAddress;

	@OneToOne
	@JoinColumn(name ="ship_id")
	ShipingAddress shipingAddress;

	@OneToOne
	@JoinColumn(name ="Payment_id")
	Payment Payment;

	@OneToOne
	@JoinColumn(name ="User_id")
	User user;

	
	private double Grand_total;
	@OneToMany(mappedBy="order")
	List<OrderItems> orderItems ;
	
	private String Order_date;
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	public ShipingAddress getShipingAddress() {
		return shipingAddress;
	}
	public void setShipingAddress(ShipingAddress shipingAddress) {
		this.shipingAddress = shipingAddress;
	}
	public Payment getPayment() {
		return Payment;
	}
	public void setPayment(Payment payment) {
		Payment = payment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<OrderItems> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}

	private String Order_time;
	public String getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(String order_id) {
		Order_id = order_id;
	}
	public double getGrand_total() {
		return Grand_total;
	}
	public void setGrand_total(double grand_total) {
		Grand_total = grand_total;
	}
	public String getOrder_date() {
		return Order_date;
	}
	public void setOrder_date(String order_date) {
		Order_date = order_date;
	}
	public String getOrder_time() {
		return Order_time;
	}
	public void setOrder_time(String order_time) {
		Order_time = order_time;
	}
	
}
