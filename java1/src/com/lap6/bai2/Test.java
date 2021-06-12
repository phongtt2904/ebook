package com.lap6.bai2;

import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		ArrayList<SanPham> list = new ArrayList<SanPham>();
		SanPham sp = new SanPham("ip6",1000, "iphone");
		SanPham sp1 = new SanPham("nokia213",1500, "nokia");
		SanPham sp2 = new SanPham("samsunggalaxy",2000, "samsung");
		list.add(sp2);
		list.add(sp1);
		list.add(sp);
		for (SanPham sanPham : list) {
			if(sanPham.getHang().equals("nokia")) {
				System.out.println(sanPham.toString());
			}
		}	
	}

}
