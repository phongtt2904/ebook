package com.phongtt.vd;

public class Test {
	public static void main(String[] args) {
		Student s = new Student("phong", "hanam");
		System.out.println(s.toString());
		s.addCourseGrade("Toan", 10);
		s.addCourseGrade("Van", 9);
		s.addCourseGrade("Anh", 10);
		s.printGrade();
		System.out.println(s.getAverageGrade());
		Teacher t = new Teacher("thaygiaoba", "tphcm");
		System.out.println(t.toString());
		t.setCourse1("Toan");
		t.setCourse2("Lap trinh");
		System.out.println(t.getCourse1());
		System.out.println(t.getCourse2());
		
		
	}

}
