package com.lap7.bai1;

public class Test {
	public static void main(String[] args) {
		ChuNhat cn = new ChuNhat(5, 3);
		ChuNhat vu = new Vuong(6,6);
		System.out.println("thong tin hinh chu nhat: ");
		cn.xuat();
		System.out.println("thong tin hinh vuong: ");
		vu.xuat();
	}

}
