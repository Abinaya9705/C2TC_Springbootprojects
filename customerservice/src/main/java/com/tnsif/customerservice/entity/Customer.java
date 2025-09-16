package com.tnsif.customerservice.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@Column(name="C_id")
	private int c_id;
	@Column(name="C_name")
	private String c_name;
	@Column(name="Address")
	private String address;
	
	public Customer() {
		super();
		  // TODO Auto-generated constructor stub
		
	}
	public Customer(int c_id, String c_name, String address) {
		super();
		this.c_id=c_id;
		this.c_name=c_name;
		this.address=address;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_name(int c_id2) {
		// TODO Auto-generated method stub
		
	}
	public Object getAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getC_name() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setAddress(Object address2) {
		// TODO Auto-generated method stub
		
	}
	

}
