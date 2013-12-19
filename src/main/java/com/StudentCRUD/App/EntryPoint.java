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
			Grades grade1 = new Grades(97,98,94);
			Address add1 = new Address("Project 8", "Quezon City");
			Address add2 = new Address("Dasmarinas","Cavite");
			Student stud1 = new Student();
			Teacher t1 = new Teacher();
			
			stud1.setFirstName("David");
			stud1.setLastName("Mendoza");
			stud1.setGender("Male");
			stud1.setLevel(4);
			stud1.setAddress(add1);
			
			t1.setFirstName("Mariam");
			t1.setLastName("Santiago");
			t1.setGender("Female");
			t1.setAddress(add2);
			t1.getStudents().add(stud1);
			
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
