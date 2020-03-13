package com.ecommerce.shopping.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shopping")
public class Shopping {
	
	
	@Id
	@Column(name="itemid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int itemid;
	
	@Column(name="itemname")
	private  String itemname;
	
	@Column(name="itemprice")
	private  double itemprice;
	
	@Column(name="numberOfItemsAvailable")
	private  int numberOfItemsAvailable;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getItemprice() {
		return itemprice;
	}
	public void setItemprice(double itemprice) {
		this.itemprice = itemprice;
	}
	public int getNumberOfItemsAvailable() {
		return numberOfItemsAvailable;
	}
	public void setNumberOfItemsAvailable(int numberOfItemsAvailable) {
		this.numberOfItemsAvailable = numberOfItemsAvailable;
	}
	

}
