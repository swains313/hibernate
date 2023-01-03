package org.hibernate.project1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class BeetWeenFunction {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Criteria crt=ss.createCriteria(ProductDTO.class);
		
		Criterion con=Restrictions.and(Restrictions.ge("pprice", 2500.0),Restrictions.le("pprice", 30000.0));
		crt.add(con);
		List<ProductDTO> ls=crt.list();
		
		for (ProductDTO p : ls) {
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPprice());
			
		}
	}

}
