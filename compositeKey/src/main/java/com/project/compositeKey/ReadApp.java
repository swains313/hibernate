package com.project.compositeKey;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ReadApp {
	public static void main(String[] args) {
		
		 Session ss=new Configuration().configure().buildSessionFactory().openSession();
		 Product p=new Product();
		 p.setCname("APPLE");
		 p.setPname("iphone");
		 
		 Product pr=(Product)ss.load(Product.class, p);
		 System.out.println(pr.getPrice());

	}

}
