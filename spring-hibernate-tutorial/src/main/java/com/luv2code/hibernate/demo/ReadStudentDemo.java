package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			
			session.getTransaction().begin();
			Student student = session.get(Student.class, 1);
			session.getTransaction().commit();
			System.out.println(student.getFirstName());
			
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			factory.close();
		}
	}

}
