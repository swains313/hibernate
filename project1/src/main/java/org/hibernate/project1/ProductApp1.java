package org.hibernate.project1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductApp1 {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Query qr=ss.createQuery("from ProductDTO");
		List ls=qr.list();
		for(Object obj : ls)
		{
			ProductDTO p=(ProductDTO)obj;
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPprice());
		}
		
		ss.close();
		sf.close();
		
	}

}
