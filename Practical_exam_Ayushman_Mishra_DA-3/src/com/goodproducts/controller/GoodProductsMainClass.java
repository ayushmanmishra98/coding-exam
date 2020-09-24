package com.goodproducts.controller;

/*
Author:Ayushman Mishra
Purpose:Main controller Layer
*/

import java.util.Date;
import java.util.Scanner;

import com.goodproducts.model.beans.Apparel;
import com.goodproducts.model.beans.Electronics;
import com.goodproducts.model.beans.FoodItems;
import com.goodproducts.model.beans.Product;
import com.goodproducts.model.business.BusinessLayer;
import com.goodproducts.model.utility.ProductFactory;
import com.goodproducts.model.utility.Type;

public class GoodProductsMainClass {

	public static void main(String[] args) {
		BusinessLayer businessLayer=(BusinessLayer)ProductFactory.getInstance(Type.BUSINESS);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the category in which you want to enter Products in capital letter:");
		System.out.println("1.FOODITEMS");
		System.out.println("2.APPAREL");
		System.out.println("3.ELECTRONICS");
		System.out.println("Enter the items in FOODITEMS,APPAREL,ELECTRONICS");

			System.out.println("Enter the number of products to be inserted items");
			int n=scanner.nextInt();
			for(int i=0;i<n;i++) {
/*				int itemCode=scanner.nextInt();
				String name=scanner.next();
				String price=scanner.next();*/
			Product foodItems=new FoodItems(1, "Apple", 10, "2008-10-25", "2009-11-27", "Yes", 10);
			}
			for(int i=0;i<n;i++) {
			Product apparel=new Apparel(itemCode, itemName, unitPrice, quantity);
			}
			for(int i=0;i<n;i++) {
			Product apparel=new Electronics(itemCode, itemName, unitPrice, quantity);
			}
			
			

			
	}

}
