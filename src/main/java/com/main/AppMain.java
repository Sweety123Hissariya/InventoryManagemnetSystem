package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import com.entity.Product;
import com.entity.ProductFeature;
import com.helper.FactoryProvider;
import com.product.AddProduct;
import com.product.DeleteProduct;
import com.product.InventoryLevel;
import com.product.SearchProduct;
import com.product.UpdateProduct;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to your Inventory................................");
        System.out.println();
        int u_choice=1;
        while(u_choice==1) {
		    System.out.println("Enter the operation");
			 System.out.println("1. Add-Product 2.Search-Product 3.Delete-Product 4.Update-Product 5.Show-Inventory  6.Inventory Level");
			 int choice1=sc.nextInt();
			 switch(choice1){
					case 1:{
						Product p1=AddProduct.addProduct();
						Session session=FactoryProvider.getFactory().openSession();
						Transaction tx=session.beginTransaction();
						session.save(p1);
						tx.commit();
						session.close();
						System.out.println("Done.........................");
						break;
					}
					case 2:{
						System.out.println("1.By product_id         2.By product_category");
						int s=sc.nextInt();
						switch(s) {
							case 1:{
								int id1=SearchProduct.searchproduct();
							    Session session=FactoryProvider.getFactory().openSession();
							    Product p1=session.get(Product.class, id1);
							    System.out.println(p1);
							    break;
								
							}
							case 2:{

								 Session session=FactoryProvider.getFactory().openSession();
								 Criteria c=session.createCriteria(Product.class);  
								System.out.println("Enter product category ");
								String y=sc.next();
								Query q=session.createQuery("FROM Product E where E.product_category=:x");
								List<Product> l=q.setParameter("x", y).getResultList();
								
								l.forEach(System.out::println);
								break;
								
							}
							
						}
						break;
						
					}
					case 3:{
						int id=DeleteProduct.deleteProduct();
						Session session=FactoryProvider.getFactory().openSession();
						Transaction tx=session.beginTransaction();
						Product p1=session.get(Product.class, id);
						session.delete(p1);
						tx.commit();
						session.close();
						System.out.println("Done.............................");
						break;
					}
					case 4:{
						int id=UpdateProduct.updateProduct();
						Session session=FactoryProvider.getFactory().openSession();
						Transaction tx=session.beginTransaction();
						//Product p1=new Product();
						ProductFeature p1=session.get(ProductFeature.class, id);
					    System.out.print("Enter the new product quantity;Current Quantity is: ");
					    System.out.println(p1.getProduct_quantity());
						int quant=sc.nextInt();
					    p1.setProduct_quantity(quant);
					    session.update(p1);
					    tx.commit();
					    session.close();
					    System.out.println("Done..........................................");
					    break;
					}
					case 5:
					{
						Session session=FactoryProvider.getFactory().openSession();
						Transaction tx=session.beginTransaction();
						Query q=session.createQuery("from Product");
						List<Product> l=q.getResultList();
						l.forEach(System.out::println);
						
						break;
					}
					case 6:{
                        System.out.println("1.Maximum level Inventory  2.Order Level Inventory  3.Minimum Level Inventory=");
						int c=sc.nextInt();
						switch(c){
							case 1:{
								Session session=FactoryProvider.getFactory().openSession();
								Query q=session.createQuery("select p from ProductFeature p where p.product_quantity>p.maxQuantity");
								List<Product> l=q.getResultList();
								System.out.println(l);
								break;
							}
							case 2:{
								Session session=FactoryProvider.getFactory().openSession();
								Query q=session.createQuery("select p from ProductFeature p where p.product_quantity>40 and p.product_quantity<50");
								List<Product> l=q.getResultList();
								System.out.println(l);
								break;
								
							}
							case 3:{
								Session session=FactoryProvider.getFactory().openSession();
								Query q=session.createQuery("select p from ProductFeature p where p.product_quantity<p.minQuantity");
								List<Product> l=q.getResultList();
								System.out.println(l);
								break;
							}
							
						}
						break;
						
						
						
						
					}
			 
			
			}
		  System.out.println();
		  System.out.println("To continue press 1");
	      System.out.println("To exit press 0");
	      u_choice=sc.nextInt();
		}
        System.out.println("Thank you..................");
      
	}
}
		
		
		
		
		
		
			 
			
