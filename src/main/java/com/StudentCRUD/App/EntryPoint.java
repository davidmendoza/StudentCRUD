package com.StudentCRUD.App;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.StudentCRUD.Domain.Address;
import com.StudentCRUD.Domain.Grades;
import com.StudentCRUD.Domain.Student;
import com.StudentCRUD.Domain.Teacher;
import com.StudentCRUD.Util.HibernateUtil;

public class EntryPoint {

	public static void main(String[] args) {
		HibernateUtil.getSessionFactory();
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.getTransaction().begin();
			
			Grades grade1 = new Grades(88,93,82);
			Address add1 = new Address("Project 6", "Quezon City");
			Address add2 = new Address("Tondo","Manila");
			Student stud1 = new Student();
			Teacher t1 = new Teacher();
			
			stud1.setFirstName("Mary");
			stud1.setLastName("Lamb");
			stud1.setGender("Female");
			stud1.setLevel(1);
			stud1.setAddress(add1);
			
			t1.setFirstName("Carl");
			t1.setLastName("Seldran");
			t1.setGender("Male");
			t1.setAddress(add2);
			stud1.getTeachers().add(t1);
			
			stud1.setGrade(grade1);
			grade1.setStudent(stud1);
			
			session.save(add1);
			session.save(add2);
			session.save(stud1);
			session.save(t1);
			
			
		
		} catch(HibernateException e){
			if (session!=null){
				session.getTransaction().rollback();
				System.err.println("Error: "+e);
			}
		} finally {
			if (session!=null){
				session.getTransaction().commit();
				session.close();
			}
		}
	}

}
