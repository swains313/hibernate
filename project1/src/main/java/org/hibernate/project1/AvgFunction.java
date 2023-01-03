package org.hibernate.project1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AvgFunction {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Query qr=ss.createQuery("select sum(p.pprice), avg(p.pprice),max(p.pprice) from ProductDTO p");
		List<Object> ls=qr.list();
		
		Object obj[]=(Object[])ls.get(0);
		
		System.out.println("Total product price is "+obj[0]);
		System.out.println("Avrage of product is "+obj[1]);
		System.out.println("Max price of the product is "+obj[2]);
		
	}

}
