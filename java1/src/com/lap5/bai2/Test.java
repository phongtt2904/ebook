package com.lap5.bai2;

public class Test {
	public static void main(String[] args) {
		
		ListSV listSV = new ListSV();
		listSV.nhap();
		listSV.xuat();
//		listSV.ngaunhien();
//		listSV.sapxep();
		listSV.xoa(2);
		System.out.println("list sau khi xoa");
		listSV.xuat();
	}

}
