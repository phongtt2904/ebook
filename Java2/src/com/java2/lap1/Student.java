package com.java2.lap1;

import java.util.Scanner;

public class Student extends Person{
	public Student(String id, String name, int age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
	}
	public int getMark() {
		return mark;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	private int mark;
	public void setMark(int mark) {
		this.mark = mark;
	}
	private String grade;
	public void calGrade(int mark) {
		if(mark >= 8)this.grade= "distinction";
		if(mark >= 7 && mark <8)this.grade="credit";
		if(mark>=5 && mark <7)this.grade ="pass";
		if(mark >= 0 && mark <5)this.grade ="fail";
		System.out.println(grade);
	}
	 @Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String name = sc.nextLine();
		int age = sc.nextInt();
		this.id = id;
		this.age = age;
		this.name = name;
		
	}
	 @Override
	public void display() {
		// TODO Auto-generated method stub
		 
		super.display();
		System.out.println(id+" "+name+" "+age);
	}
	 public static void main(String[] args) {
			Student s = new Student();
			s.input();
			s.display();
			s.calGrade(6);
		}
	public Student() {
		
	}
	
	 

}
