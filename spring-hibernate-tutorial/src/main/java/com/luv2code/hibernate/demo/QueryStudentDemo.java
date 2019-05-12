package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(QueryStudentDemo.class);
	
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();

		try {
			
			session.getTransaction().begin();
			List<Student> students = session.createQuery("from Student").getResultList();
			session.getTransaction().commit();
			displayStudents(students);
			
		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> students) {
		for(Student student : students) {
			logger.info(student.getFirstName());
		}
	}

}
