package org.hibernate.project1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Projection {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Criteria crt=ss.createCriteria(ProductDTO.class);
		crt.add(Restrictions.gt("pprice", 2000.0));
		crt.setProjection(Projections.property("pname"));
		
		
		List<String> ls=crt.list();
		
		for (String string : ls) {
			System.out.println(string);
			
		}
	}

}
