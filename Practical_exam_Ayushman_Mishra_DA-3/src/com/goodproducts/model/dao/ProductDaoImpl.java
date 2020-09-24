package com.goodproducts.model.dao;

/*
Author:Ayushman Mishra
Purpose:Implementation of Dao Layer
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.goodproducts.model.beans.Product;

public class ProductDaoImpl implements ProductDao {
	
	Set<Product> product=new HashSet<Product>();
		
	@Override
	public Product storeAll(Product item) {
		product.add(item);
		return item;
	}

	@Override
	public Product[] getAllProduct() {
		Product[] allproduct=new Product[product.size()];
		allproduct=product.toArray(allproduct);
		return allproduct;
	}

	@Override
	public Product fetchById(int id) {
		Product found=null;
		Iterator<Product> tempProduct=product.iterator();
		while(tempProduct.hasNext()) {
			Product temp=tempProduct.next();
			if(temp.getItemCode()==id) {
				found=temp;
				return found;
			}
			return found;
		}
		
	}

}
