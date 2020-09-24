package com.goodproducts.model.beans;

/*
Author:Ayushman Mishra
Purpose:Class for Electronics
*/


public class Electronics extends Product{
	private int warranty;
	
	public Electronics(int itemCode, String itemName, double unitPrice, int quantity) {
		super(itemCode,itemName,unitPrice,quantity);
		this.warranty=warranty;
	}
	
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electronics(int warranty) {
		super();
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + "]";
	}

	
	
	
}
