package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class ShipingAddress {
	@Id
	private String Ship_id;
	private String Ship_name;
	private String Ship_houseno;
	private String Ship_streetname;
	private String Ship_city;
	private String Ship_state;
	private String Ship_pincode;
	private String Ship_country;
	
	public String getShip_country() {
		return Ship_country;
	}
	public void setShip_country(String ship_country) {
		Ship_country = ship_country;
	}
	public String getShip_state() {
		return Ship_state;
	}
	public void setShip_state(String ship_state) {
		Ship_state = ship_state;
	}
	public String getShip_pincode() {
		return Ship_pincode;
	}
	public void setShip_pincode(String ship_pincode) {
		Ship_pincode = ship_pincode;
	}
	public String getShip_houseno() {
		return Ship_houseno;
	}
	public void setShip_houseno(String ship_houseno) {
		Ship_houseno = ship_houseno;
	}
	public String getShip_streetname() {
		return Ship_streetname;
	}
	public void setShip_streetname(String ship_streetname) {
		Ship_streetname = ship_streetname;
	}
	public String getShip_city() {
		return Ship_city;
	}
	public void setShip_city(String ship_city) {
		Ship_city = ship_city;
	}
	public String getShip_id() {
		return Ship_id;
	}
	public void setShip_id(String ship_id) {
		Ship_id = ship_id;
	}
	public String getShip_name() {
		return Ship_name;
	}
	public void setShip_name(String ship_name) {
		Ship_name = ship_name;
	}
	 
}
