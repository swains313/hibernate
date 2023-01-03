package org.hibernate.project1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CriteriList {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Criteria crt=ss.createCriteria(ProductDTO.class);
		List<ProductDTO> ls=crt.list();
		for (ProductDTO prd : ls) {
			
			System.out.println(prd.getPid()+" "+prd.getPname()+" "+prd.getPprice());
			
		}
		
	
	}

}
