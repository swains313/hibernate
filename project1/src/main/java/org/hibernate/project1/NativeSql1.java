package org.hibernate.project1;


import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NativeSql1 {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		SQLQuery qr=ss.createSQLQuery("select * from ProductDto");
		
		qr.addEntity(ProductDTO.class);
		
		List<ProductDTO> l=qr.list();
		
		for (ProductDTO p : l) {
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPprice());
			
		}
		
		
	}

}
