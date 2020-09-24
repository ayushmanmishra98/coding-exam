package com.goodproducts.model.dao;

/*
Author:Ayushman Mishra
Purpose:Interface for Dao layer
*/

import com.goodproducts.model.beans.Product;


public interface ProductDao {
	public Product storeAll(Product item);
	public Product fetchById(int id);
	public Product[] getAllProduct();
}
