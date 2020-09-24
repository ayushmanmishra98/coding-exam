package com.goodproducts.model.business;

/*
Author:Ayushman Mishra
Purpose:Interface for Business Logic
*/

import com.goodproducts.exception.ProductNotFound;
import com.goodproducts.model.beans.Product;

public interface BusinessLayer {
public Product store(Product product);
public Product[] getAllProducts();
public Product getById(int id) throws ProductNotFound;
}
