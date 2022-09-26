package com.product;

import java.util.Scanner;

import com.entity.Product;

public class DeleteProduct {
	 public  static int deleteProduct() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the product id");
			int id1=sc.nextInt();
			return id1;
	 }

}
