package com.ecommerce.shopping.crud;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
	
	public static void main()
	{
		HiberCrudOperations.addItems("Eyewear", 20.00, 2);
		HiberCrudOperations.addItems("cloth", 10.00, 3);
		System.out.println("items added to database");
		HiberCrudOperations.deleteItems(1);
		System.out.println("item deleted from database");
		Shopping s=HiberCrudOperations.retrieveItems(2);
		System.out.println(s.getItemid());
		System.out.println(s.getItemname());
		System.out.println(s.getItemprice());
		System.out.println(s.getNumberOfItemsAvailable());
		HiberCrudOperations.updateItems(2, "cloth", 15.00, 3);
		System.out.println("updtaed");
	}
	
}
