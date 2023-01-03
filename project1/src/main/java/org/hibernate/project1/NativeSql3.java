package org.hibernate.project1;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.StandardBasicTypes;

public class NativeSql3 {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		SQLQuery sq=ss.createSQLQuery("select pname ,pprice from ProductDto");
		sq.addScalar("pname",StandardBasicTypes.STRING);
		sq.addScalar("pprice",StandardBasicTypes.DOUBLE);
		
		List<Object[]> ls=sq.list();
		for (Object[] obj : ls) {
			System.out.println(obj[0]+" "+obj[1]);
		}
	}

}
