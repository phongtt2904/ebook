package com.lab4;

public class XanPham {
	private String name;
	private int cost;
	private int reduceCost;
	public XanPham(String name, int cost, int reduceCost) {
		super();
		this.name = name;
		this.cost = cost;
		this.reduceCost = reduceCost;
	}
	public XanPham(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	private double getThueThuNhap() {
		double thue=0.1*cost;
		return thue;
	}
	public void xuat() {
		System.out.println("name:"+ name +" "+"cost"+ cost+"ReduceCost: "+ reduceCost);
	}
	

}
