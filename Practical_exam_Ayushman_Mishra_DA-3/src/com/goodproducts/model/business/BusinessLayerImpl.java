package com.goodproducts.model.business;


/*
Author:Ayushman Mishra
Purpose:Implementation of Business Logic
*/

import com.goodproducts.exception.ProductNotFound;
import com.goodproducts.model.beans.Product;
import com.goodproducts.model.dao.ProductDao;
import com.goodproducts.model.utility.ProductFactory;
import com.goodproducts.model.utility.Type;

public class BusinessLayerImpl implements BusinessLayer {

	ProductDao dao;

	public BusinessLayerImpl() {
		super();
		// TODO Auto-generated constructor stub
		dao=(ProductDao)ProductFactory.getInstance(Type.DAO);
	}
	
	@Override
	public Product store(Product product) {
		Product result=dao.storeAll(product);
		return result;
	}

	@Override
	public Product[] getAllProducts() {
		Product[] allProduct=dao.getAllProduct();
		return allProduct;
	}

	@Override
	public Product getById(int id) throws ProductNotFound{
		Product found=dao.fetchById(id);
		if(found==null)
			throw new ProductNotFound("Product not present");
		return found;
	}

}
