package com.lab4;

import java.util.Scanner;

public class SanFam {
	private String name;
	private int cost;
	 void nhap() {
		Scanner sc = new Scanner(System.in);
	    this.name =sc.nextLine();
		this.cost = sc.nextInt();
		
		
		
	}
	public void xuat() {
		System.out.println("name:" + this.name+" "+"cost: "+this.cost);
	}

}
