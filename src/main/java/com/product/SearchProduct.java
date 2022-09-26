package com.product;

import java.util.Scanner;

public  class SearchProduct {
	
	public static int searchproduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id");
		int id=sc.nextInt();
		return id;
		
	}
}
