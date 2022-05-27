package com.collection.api.json;

public class Address {
	private String street;
	private String streetNo;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String streetNo) {
		super();
		this.street = street;
		this.streetNo = streetNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", streetNo=" + streetNo + "]";
	}

}
