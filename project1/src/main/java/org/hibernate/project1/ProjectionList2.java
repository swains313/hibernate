package org.hibernate.project1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionList2 {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Criteria crt=ss.createCriteria(ProductDTO.class);
		Projection pr1=Projections.sum("pprice");
		Projection pr2=Projections.avg("pprice");
		
		ProjectionList pl=Projections.projectionList();
		pl.add(pr1);
		pl.add(pr2);
		
		crt.setProjection(pl);
		
		List<Object> ls=crt.list();
		Object[] obj=(Object[])ls.get(0);
		System.out.println("SUM "+obj[0]);
		System.out.println("AVG "+obj[1]);
	}

}
