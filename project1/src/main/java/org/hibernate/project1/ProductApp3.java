package org.hibernate.project1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductApp3 {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Query qr=ss.createQuery("select p.pid,p.pname from ProductDTO p");
		List ls=qr.list();
		
		for(Object obj:ls)
		{
			Object[] p=(Object[])obj;
			System.out.println(p[0]+" "+p[1]);
		}
		
	}

}
