package com.phongtt.vd;

public class CourseTaken {
	private String courseName;
	private int grade;
	public int getGrade() {
		return grade;
	}
	public CourseTaken(String courseName, int grade) {
		super();
		this.courseName = courseName;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "CourseTaken [courseName=" + courseName + ", grade=" + grade + "]";
	}
	

}
