package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(UpdateStudentDemo.class);
	
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			
			session.getTransaction().begin();
			Student student = session.get(Student.class, 1);
			student.setEmail("yargla@example.com");
			session.save(student);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			factory.close();
		}
	}

}
