package com.goodproducts.model.utility;

/*
Author:Ayushman Mishra
Purpose:Factory Pattern Class
*/

import com.goodproducts.model.business.BusinessLayerImpl;
import com.goodproducts.model.dao.ProductDaoImpl;

public class ProductFactory {
public static Object getInstance(Type type) {
	Object obj=null;
	switch(type) {
	case DAO:
		obj=new ProductDaoImpl();
		break;
	case BUSINESS:
		obj=new BusinessLayerImpl();
		break;
	}
	return obj;
}
}
