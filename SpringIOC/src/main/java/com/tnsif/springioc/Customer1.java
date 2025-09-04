package com.tnsif.springioc;

import org.springframework.stereotype.Component;

@Component
public class Customer1 {

    private final Customer2 customer2;
	private int id;
	private String name;
	private String city;
	
	public Customer1(Customer2 customer2) //default constructor
	{
		System.out.println("Welcome Customer1");
		this.customer2 = customer2;
	}
	
	public void order()
	{
		System.out.println("Customer 1 ordering product");
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
