package org.hibernate.project1;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteProduct {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
//		static
//		Query qr=ss.createQuery("delete from ProductDTO where pid=5");
//		int row=qr.executeUpdate();
//		Transaction ts=ss.beginTransaction();
//		ts.commit();
//		System.out.println("Number of rows affected "+row);
		
		//Dynamic
		
		Query qr=ss.createQuery("delete ProductDTO where pid=:id");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id for deleted ");
		Integer id=sc.nextInt();
		
		qr.setParameter("id", id);
		int row=qr.executeUpdate();
		Transaction tr=ss.beginTransaction();
		tr.commit();
		System.out.println("Number of rows affected "+row);
		
		ss.close();
		sf.close();
		
		
	}

}
