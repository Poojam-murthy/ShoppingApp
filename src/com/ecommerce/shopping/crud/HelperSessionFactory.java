package com.ecommerce.shopping.crud;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HelperSessionFactory {
	private static final SessionFactory sf=getSessionFactory();
	private static SessionFactory getSessionFactory()
	{
		Configuration cfg=new Configuration();
		SessionFactory sessionfact=cfg.configure("Hibernate.cfg.xml").buildSessionFactory();
		return sessionfact;
		
	}
public static SessionFactory getInstance()
{
	return sf;
	
}
}
