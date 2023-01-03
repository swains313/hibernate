package org.hibernate.project1;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductAppBackup {
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Query qr=ss.createQuery("insert into ProductBackupDto(xpid,xpname,xpprice) select p.pid,p.pname,p.pprice from ProductDTO p  )");
		//Query qr=ss.createQuery("insert into ProductBackupDto(xpid,xpname,xpprice) select p.pid,p.pname,p.pprice from ProductDTO p where pid>=:id )");//DYNAMICALLY READ 
		//Query qr=ss.createQuery("insert into ProductBackupDto(xpid,xpname,xpprice) select p.pid,p.pname,p.pprice from ProductDTO p where pid>=1000 )");
		//Query qr=ss.createQuery("insert into ProductBackupDto(xpid,xpname) select p.pid,p.pname from ProductDTO p where pid=9 )");
		Transaction tr=ss.beginTransaction();
		int row=qr.executeUpdate();
		tr.commit();
		System.out.println("Number of rows affected "+row);
		ss.close();
		sf.close();
	}

}
