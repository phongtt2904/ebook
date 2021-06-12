package com.phongtt.vd;

public class Teacher extends Person{
	public Teacher(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	private String course1;
	private String course2;
	public String getCourse1() {
		return course1;
	}
	public void setCourse1(String course1) {
		this.course1 = course1;
	}
	public String getCourse2() {
		return course2;
	}
	public void setCourse2(String course2) {
		this.course2 = course2;
	}
	@Override
	public String toString() {
		return "Teacher [getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	
	
}
	