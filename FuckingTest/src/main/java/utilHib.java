package main.java;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.*;

import org.springframework.stereotype.Repository;

@Repository
public class utilHib {


	

	public static SessionFactory getsession_factory_() {
		return session_factory_;
	}

	public static void setsession_factory_(SessionFactory session_factory_) {
		 utilHib.session_factory_ = session_factory_;
	}

	private static SessionFactory session_factory_;


	public Session openSession_() {
		return session_factory_.openSession();
	}

	public Session getCurrentSession_() {
		return session_factory_.getCurrentSession();
	}

	public static void close_() {
		if (session_factory_!= null) {
			session_factory_.close();
		}
		session_factory_ = null;
	}

}
