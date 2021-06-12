package com.phongtt.vd;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
	public Student(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	private int numCourses;
	private List<CourseTaken> courses = new ArrayList<CourseTaken>();
	@Override
	public String toString() {
		return "Student [getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	public void addCourseGrade(String course, int grade) {
		courses.add(new CourseTaken(course,grade));
	}
	public void printGrade() {
		for (CourseTaken courseTaken : this.courses) {
			System.out.println(courseTaken.toString());
		}
	}
	public double getAverageGrade() {
		double t = 0;
		for (CourseTaken courseTaken : courses) {
			t+=courseTaken.getGrade();
		}
		t/=courses.size();
		return t;
	}
	

}
