package org.hibernate.project1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class LikeFunction {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Criteria crt=ss.createCriteria(ProductDTO.class);
		Criterion con=Restrictions.like("pname", "%a%");
		crt.add(con);
		
		List<ProductDTO> ls=crt.list();
		
		for (ProductDTO pro : ls) {
			System.out.println(pro.getPname());
			
		}
	}

}
