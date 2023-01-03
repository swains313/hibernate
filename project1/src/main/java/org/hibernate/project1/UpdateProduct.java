package org.hibernate.project1;


import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateProduct {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		//static
//		Query wr=ss.createQuery("update ProductDTO p set p.pprice=100 where pid=1");
//		Transaction tr=ss.beginTransaction();
//		int row=wr.executeUpdate();
//		tr.commit();
//		System.out.println("Number of rows affected "+row);
		
		//Dynamic
		
		Scanner sc=new Scanner(System.in);
		
		Query qr=ss.createQuery("update ProductDTO p set p.pprice=:nprice  where pid=:id");
		System.out.println("Enter the id & new price ");
		Integer id=sc.nextInt();
		Double price=sc.nextDouble();
		
		qr.setParameter("id", id);
		qr.setParameter("nprice", price);
		Transaction tr=ss.beginTransaction();
		int row=qr.executeUpdate();
		tr.commit();
		System.out.println("Number of rows affected "+row);
		sc.close();
		ss.close();
		sf.close();
	
	}

}
