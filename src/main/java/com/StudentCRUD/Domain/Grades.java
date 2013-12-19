package com.StudentCRUD.Domain;

public class Grades {
	
	private Long studentId;
	private int math;
	private int science;
	private int english;
	private Student student;
	
	private Grades(){
		
	}

	public Grades(int math, int science, int english) {
		super();
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
}
