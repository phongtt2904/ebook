package com.java2.lap1;

import java.util.Scanner;

public class Person implements PersonExample{
	protected String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	protected String name;
	protected int age;
	
	public Person() {
		super();
	}
	public Person(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public void input() {
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	

}
