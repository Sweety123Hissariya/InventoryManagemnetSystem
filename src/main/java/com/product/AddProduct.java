package com.product;

import java.util.Scanner;

import com.entity.Product;
import com.entity.ProductFeature;

public class AddProduct {
	public  static Product addProduct() {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the product category");
		String cat=sc.next();
		System.out.println("Enter the product name");
		String name=sc.next();
		
		System.out.println("Enter the product price");
		int price=sc.nextInt();
		System.out.println("Enter processor");
		String pro=sc.next();
		System.out.println("Enter RAM");
		String ram=sc.next();
		System.out.println("Enter ROM");
		String rom=sc.next();
		System.out.println("Enter the product quantity");
		int quan=sc.nextInt();
		System.out.println("Enter minmum Quantity");
		int minq=sc.nextInt();
		System.out.println("Enter maximum Quantity");
		int maxq=sc.nextInt();
		ProductFeature pf=new ProductFeature(pro,ram,rom,quan,minq,maxq);
		
		Product p=new Product(cat,name,price,pf);
		
		
		return p;
	}

}
