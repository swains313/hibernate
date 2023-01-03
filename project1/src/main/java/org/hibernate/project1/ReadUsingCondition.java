package org.hibernate.project1;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadUsingCondition {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
//		Query qr=ss.createQuery("select p.pname from ProductDTO p where p.pprice>=1000");
//		List<String> ls=qr.list();
//		System.out.println(ls);
		
		
		//DataReadDynamically 
		Scanner sc=new Scanner(System.in);
		
		Query qr=ss.createQuery("from ProductDTO p where pprice>=:price");		
		System.out.println("Enter the product price ");
		Double p=sc.nextDouble();
	
		qr.setParameter("price", p);
		List<Object> ls=qr.list();
		for(Object o:ls)
		{
			ProductDTO prd=(ProductDTO)o;
			System.out.println(prd.getPid()+" "+prd.getPname()+" "+prd.getPprice());
			
		}
		ss.close();
		sf.close();
		
	}

}
