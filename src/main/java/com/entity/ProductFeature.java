package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ProductFeature")
public class ProductFeature {
	@Id
	@Column(name="pro_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String processor;
	private String ram;
	private String rom;
	private int product_quantity;
	private int minQuantity;
	private int maxQuantity;
	public ProductFeature(){
		
	}
	
	public ProductFeature(String processor, String ram, String rom,int product_quantity,int minQuantity,int maxQuantity) {
		super();
		this.processor = processor;
		this.ram = ram;
		this.rom = rom;
		this.product_quantity = product_quantity;
		this.minQuantity=minQuantity;
		this.maxQuantity=maxQuantity;
	}

	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getRom() {
		return rom;
	}
	public void setRom(String rom) {
		this.rom = rom;
	}
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public int getMinQuantity() {
		return minQuantity;
	}

	public void setMinQuantity(int minQuantity) {
		this.minQuantity = minQuantity;
	}

	public int getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	@Override
	public String toString() {
		return "ProductFeature [processor=" + processor + ", ram=" + ram + ", rom=" + rom +", product_quantity=" + product_quantity + ", minQuantity="
				+ minQuantity + ", maxQuantity=" + maxQuantity + "]";
	}
	
	

}
