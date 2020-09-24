package com.goodproducts.model.beans;

/*
Author:Ayushman Mishra
Purpose:Class for Food Items
*/

import java.util.Date;

//Food Items class.
public class FoodItems extends Product{
	private Date dateOfManufacture;
	private Date dateOfExpiry;
	private String vegetarian;
	
	public FoodItems() {
		super();
	}

	public FoodItems(int itemCode, String itemName, double unitPrice, Date dateOfManufacture, Date dateOfExpiry,
			String vegetarian, int quantity) {
		super(itemCode,itemName,unitPrice,quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
	}

	

	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}


	
	
	
}
