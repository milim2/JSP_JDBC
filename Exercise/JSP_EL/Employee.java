package com.exampl.model;

public class Employee implements Person {
	
	private int id;
	private String name;
	private Address address;
	
	public Employee() {
		
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		
		return 99;
	}

	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
	

	
	
}
