package org.hibernate.project1;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadProduct {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		
//		Query qry=ss.createQuery(" from ProductDTO where pid=2");
//		List<Object> ls=qry.list();
//		ProductDTO p=(ProductDTO)ls.get(0);
//		for(Object obj: ls)
//		{
//			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPprice());
//		}
		
//		qry=ss.createQuery("select p.pname from ProductDTO p where p.pid=1");
//		List<String> qr1=qry.list();
//		for(String s:qr1)
//		{
//			System.out.println(s);
//		}
		
		Query qry=ss.createQuery(" from ProductDTO where pid=:id");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the pid for read ");
		int id=sc.nextInt();
		
		qry.setParameter("id", id);
		List ls=qry.list();
		
		for(Object obj: ls)
		{
			ProductDTO p=(ProductDTO)obj;
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPprice());
		}
		ss.close();
		sf.close();
		
		
		
		
	}

}
