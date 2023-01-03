package org.hibernate.project1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Demo {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Criteria ct=ss.createCriteria(ProductDTO.class);
		

		Query q=ss.createSQLQuery("select * from ProductDto");
		
		List<Object[]> ls=q.list();
		
		for (Object[] objects : ls) {
			
			for (Object o : objects) {
				System.out.print(o+" ");
			}
			System.out.println();
			
		}
		
		

			
		
		
	}
	

}
