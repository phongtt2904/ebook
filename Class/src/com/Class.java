package com;

import java.util.ArrayList;
import java.util.List;

public class Class {
	private String name;
	private List<Student> list = new ArrayList<Student>();
	public void add(Student s) {
		if(this.list.size() < 3) {
			this.list.add(s);
			s.setClass1(this);
			System.out.println("ok them r");
		}
		else {
			System.out.println("qua r th ngu");
		}
	}
	public void remove(Student s) {
		this.list.remove(s);
		System.out.println("xoa r con lon");
		
	}
	public void printListSV() {
		for (Student student : list) {
			System.out.println("name " + student.getName() + " adress " + student.getAddress() );
		}
	}
	
	

}
