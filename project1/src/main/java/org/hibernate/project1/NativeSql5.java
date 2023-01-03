package org.hibernate.project1;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NativeSql5 {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		SQLQuery sq=ss.createSQLQuery("update ProductDto set pprice=? where pid=? ");
		sq.setParameter(0, 220);
		sq.setParameter(1, 2);
		int r=sq.executeUpdate();
		tr.commit();
		System.out.println("Number of rows affected "+r);
		
		
	}

}
