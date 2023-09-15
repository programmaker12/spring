package com.student.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shop {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shop_number;
	private String shopname;
	private String shopcategory;
	private String shopstatus;
	
	
		public Integer getShopnumber() {
		return shop_number;
	}
	public void setShopnumber(Integer shop_number) {
		this.shop_number = shop_number;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getShopcategory() {
		return shopcategory;
	}
	public void setShopcategory(String shopcategory) {
		this.shopcategory = shopcategory;
	}
	public String getShopstatus() {
		return shopstatus;
	}
	public void setShopstatus(String shopstatus) {
		this.shopstatus = shopstatus;
	}
	
}
