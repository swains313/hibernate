package org.hibernate.project1;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class AscDescOrder {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		
		Criteria crt=ss.createCriteria(ProductDTO.class);
		Criterion con=Restrictions.like("pname", "%oo%");
		
		crt.add(con);
		crt.addOrder(Order.asc("pprice"));
		List<ProductDTO> ls=crt.list();
		
		for (ProductDTO p : ls) {
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPprice());
			
		}
		
		
	}

}
