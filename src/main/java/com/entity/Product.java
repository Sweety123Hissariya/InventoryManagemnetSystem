package com.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Product")
public class Product {
	    @Id
	    @Column(name="id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int product_id;
	    @Column(name="category")
		private String product_category;
	    @Column(name="name",length=20)
		private String product_name;
	    @Column(name="price")
	    private int product_price;
	    @OneToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	    @JoinColumn(name="profeature_id")
	    private ProductFeature pro_fea;
		public Product(){
			
		}
		
		public Product(String product_category, String product_name,int product_price,ProductFeature pro_fea) {
			super();
			this.product_category = product_category;
			this.product_name = product_name;
			this.product_price=product_price;
			this.pro_fea=pro_fea;
		}
		

		public ProductFeature getPro_feature() {
			return pro_fea;
		}

		public void setPro_feature(ProductFeature pro_feature) {
			this.pro_fea = pro_feature;
		}

		public int getProduct_id() {
			return product_id;
		}
		public void setProduct_id(int product_id) {
			this.product_id = product_id;
		}
		public String getProduct_category() {
			return product_category;
		}
		public void setProduct_category(String product_category) {
			this.product_category = product_category;
		}
		public String getProduct_name() {
			return product_name;
		}
		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}

		public int getProduct_price() {
			return product_price;
		}

		public void setProduct_price(int product_price) {
			this.product_price = product_price;
		}
	
		@Override
		public String toString() {
			return "Product [product_id=" + product_id + ", product_category=" + product_category + ", product_name="
					+ product_name + ", product_price=" + product_price
					+ ", pro_fea=" + pro_fea + "]";
		}

		
		
		
		
		

	


}
