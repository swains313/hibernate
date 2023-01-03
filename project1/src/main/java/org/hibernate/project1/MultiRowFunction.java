package org.hibernate.project1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class MultiRowFunction {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Criteria crt=ss.createCriteria(ProductDTO.class);
		
		Criterion con=Restrictions.ge("pprice", 1000.0);
		crt.add(con);
		List ls=crt.list();
		
		for (Object object : ls) {
			ProductDTO prd=(ProductDTO)object;
			System.out.println(prd.getPid()+" "+prd.getPname()+" "+prd.getPprice());
			
			
		}
	}

}
