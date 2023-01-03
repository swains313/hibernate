package com.project.compositeKey;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteApp {
	
	public static void main(String[] args) {
		 Session ss=new Configuration().configure().buildSessionFactory().openSession();
		 Transaction tr=ss.beginTransaction();
		 
		 Product p=new Product();
		 p.setCname("oneplus");
		 p.setPname("nord");
		 
		 Product pr=(Product)ss.load(Product.class, p);
		 ss.delete(pr);
		 tr.commit();
		 ss.close();
		 System.out.println("deleted");
	}

}
