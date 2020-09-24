package com.goodproducts.model.beans;

/*
Author:Ayushman Mishra
Purpose:Class for Apparel
*/

//Apparel class.
public class Apparel extends Product{
	private String size;
	
	public Apparel(int itemCode, String itemName, double unitPrice, int quantity) {
		super(itemCode,itemName,unitPrice,quantity);
		this.size=size;
	}
	
	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Apparel [size=" + size + "]";
	}

	
	
}
