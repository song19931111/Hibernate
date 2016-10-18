package org.songxiang;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config  = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session  = factory.openSession();
		Transaction tx = session.beginTransaction();
		Person person =  new Person("songxiang","12323432",new java.util.Date());
		session.save(person);
		tx.commit();
		session.close();
	}

}
