package com.ecommerce.shopping.crud;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HiberCrudOperations  {
	static Session ses=null;
	  SessionFactory factory=HelperSessionFactory.getInstance();
	ses=factory.openSession();
	 
	 public static void addItems(String item,double price,int noofitems)
	 {
		 Transaction tr=ses.beginTransaction();
		 Shopping sp=new Shopping();
		 sp.setItemname(item);
		 sp.setItemprice(price);
		 sp.setNumberOfItemsAvailable(noofitems);
		 ses.save(sp);
		 tr.commit();
	 }
	 public static Shopping retrieveItems(int itemid)
	 {
		 Transaction tr=ses.beginTransaction();
		 
		 Shopping sh=ses.find(Shopping.class, itemid);
		 sh.getItemid();
		 sh.getItemname();
		 sh.getItemprice();
		 sh.getNumberOfItemsAvailable();
		  tr.commit();
		 return sh;
	 }
	 public static void updateItems(int itemid,String item,double price,int noofitems)
	 {
		 Transaction tr=ses.beginTransaction();
		Shopping sh= ses.find(Shopping.class, itemid);
		sh.setItemname(item);
		sh.setItemprice(price);
		sh.setNumberOfItemsAvailable(noofitems);
		 tr.commit();
	 }
	
	 public static void deleteItems(int itemid)
	 {
		 Transaction tr=ses.beginTransaction();
		Shopping sh= ses.find(Shopping.class, itemid);
		ses.delete(sh);
		 tr.commit();
	 }
	
	

}
