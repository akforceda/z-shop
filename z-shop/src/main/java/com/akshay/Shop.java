package com.akshay;

public class Shop {
	private int id;
	private String productName;

	public Shop() {

	}

	public Shop(int id, String productName) {
		this.id = id;
		this.productName = productName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return productName;
	}

	public void setName(String productName) {
		this.productName = productName;
	}

}
