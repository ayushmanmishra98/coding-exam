package com.goodproducts.exception;

public class ProductNotFound extends Exception{
	
	public ProductNotFound(String msg) {
		super(msg);
	}
	
	public ProductNotFound() {
		super("No Product Found");
	}

}
