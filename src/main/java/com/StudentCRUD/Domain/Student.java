package com.StudentCRUD.Domain;

import java.util.HashSet;
import java.util.Set;

public class Student {
	
	private Long id;
	private String firstName;
	private String lastName;
	private String gender;
	private int level;
	private Grades grade;
	private Address address;
	private Set<Teacher> teachers = new HashSet();

	public Student(){
		
	}

	public Student(String firstName, String lastName, String gender, int level) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.level = level;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Grades getGrade() {
		return grade;
	}

	public void setGrade(Grades grade) {
		this.grade = grade;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
}
