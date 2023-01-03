package org.hibernate.project1;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NamedQuery {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Query qr=ss.getNamedQuery("q1");
		qr.setParameter(0, 7);
		
		List<ProductDTO> ls=qr.list();
		
		for (ProductDTO pr : ls) {
			System.out.println(pr.getPid()+" "+pr.getPname()+" "+pr.getPprice());
			
		}
		
		Query qr1=ss.getNamedQuery("q2");
		qr1.setParameter(0, 5);
		
		List<Object[]> ls1=qr1.list();
		Object[] obj=(Object[])ls1.get(0);
		System.out.println(obj[0]+" "+obj[1]+" "+obj[2]);
		
		
	}

}
