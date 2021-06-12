package com.lap7.bai2;

public class SinhVienBiz extends SinhVienPoly{
	private double marketing;
	private double sales;
	public SinhVienBiz(String hoten, String nganh,double marketing, double sales) {
		super(hoten,nganh);
	}
	@Override
	double getDiem() {
		double diem =(2*marketing + sales)/3;
		return diem;
	}

}
