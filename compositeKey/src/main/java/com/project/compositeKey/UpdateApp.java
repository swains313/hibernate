package com.project.compositeKey;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateApp {
	
	public static void main(String[] args) {
		 Session ss=new Configuration().configure().buildSessionFactory().openSession();
		 
		 Product p=new Product();
		 p.setCname("APPLE");
		 p.setPname("iphone");
		 
		 Product pr=(Product)ss.load(Product.class, p);
		 pr.setPrice(55000.0);
		 Transaction tr=ss.beginTransaction();
		 tr.commit();
		 System.out.println("Updated");
		 ss.close();
		
	}

}
