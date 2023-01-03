package org.hibernate.project1;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NativeSql2 {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		SQLQuery qr=ss.createSQLQuery("select pname, pprice from ProductDto");
		List<Object[]> ls=qr.list();
		
		for (Object[] objects : ls) {
			
			System.out.println(objects[0]+" "+objects[1]);
			
		}
		
	}

}
