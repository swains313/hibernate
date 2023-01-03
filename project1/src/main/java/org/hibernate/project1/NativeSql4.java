package org.hibernate.project1;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NativeSql4 {
	
	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		SQLQuery sq=ss.createSQLQuery("update ProductDto set pprice=45.0 where pid=1");
		int r=sq.executeUpdate();
		tr.commit();
		System.out.println("Number of rows Affected "+r);
		
		
		
		
	}

}
