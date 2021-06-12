package com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student   student = new Student("minh", 18 , "TDH");
		Student   student1 = new Student("phong", 17 , "QL");
		Student   student2 = new Student("tien", 20 , "TDH");
		Student   student3 = new Student("duy", 20 , "QL");
		System.out.println(student.getClass1());
		
		
		
		Class class1 = new Class();
		class1.add(student3);
		class1.add(student2);
		class1.add(student);
		class1.add(student1);
		class1.printListSV();
		class1.remove(student3);
		System.out.println("sau khi xoa");
		class1.printListSV();
		System.out.println("truoc khi xoa sv khoi lop");
		System.out.println(student.getClass1());
		System.out.println("sau khi xoa sv khoi lop");
		student.out();
		System.out.println(student.getClass1());
	}

}
