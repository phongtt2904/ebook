package com.lap5.bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListSV {
	List<String> list = new ArrayList<String>();
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i<n;i++) {
			String s = sc.nextLine();
			list.add(s);
		}
	}
	public void xuat() {
		System.out.println("danh sach nhap tu ban phim");
		for (int i = 0; i < this.list.size() ; i++) {
			System.out.println("sv thu " + i  +" : " + this.list.get(i));
		}
	}
	public void ngaunhien() {
		Collections.shuffle(list);
		System.out.println("danh sach ngau nhien");
		for(int i = 0; i< this.list.size();i++) {
			System.out.println("sv thu " + i +" : "+ this.list.get(i));
		}
		
	}
	public void sapxep() {
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println("danh sach sap xep");
		for(int i = 0; i< this.list.size();i++) {
			System.out.println("sv thu " + i +" : "+ this.list.get(i));
		}
	}
	public void xoa(int index) {
		this.list.remove(index);
		
		
	}
}
