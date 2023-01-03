package org.hibernate.project1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Projection1 {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Criteria crt=ss.createCriteria(ProductDTO.class);
		
		ProjectionList pl=Projections.projectionList();
		crt.add(Restrictions.ge("pprice", 1000.0));
		pl.add(Projections.property("pname"));
		pl.add(Projections.property("pprice"));
		crt.setProjection(pl);
		
		List ls=crt.list();
		for (Object p : ls) {
			Object []obj=(Object[])p;
			System.out.println(obj[0]+" "+obj[1]);
			
		}
		
	}

}
