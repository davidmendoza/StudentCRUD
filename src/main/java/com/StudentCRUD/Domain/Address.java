package com.StudentCRUD.Domain;

import java.util.HashSet;
import java.util.Set;

public class Address {
	
	private Long id;
	private String Area;
	private String City;
	private Set<Teacher> teachers = new HashSet();
	private Set<Student> students = new HashSet();
	
	public Address(){
		
	}
	
	public Address(String area, String city) {
		super();
		Area = area;
		City = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
	
	
}
