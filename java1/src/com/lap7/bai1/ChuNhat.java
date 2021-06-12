package com.lap7.bai1;

public class ChuNhat {
	private double dai;
	private double rong;
	public ChuNhat(double dai, double rong) {
		super();
		this.dai = dai;
		this.rong = rong;
	}
	public double getChuVi(double dai, double rong) {
		 double c=(dai+rong)*2;
		return c;
	}
	public double getDienTich(double dai, double rong) {
		double s=dai*rong;
		return s;
	}
	public void xuat() {
		System.out.println("dai: "+dai);
		System.out.println("rong: "+rong);
		System.out.println("chu vi: "+getChuVi(dai, rong));
		System.out.println("dien tich: "+getDienTich(dai, rong));
	}

}
