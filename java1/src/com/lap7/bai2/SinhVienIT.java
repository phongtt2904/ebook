package com.lap7.bai2;

public class SinhVienIT extends SinhVienPoly{
	private double java;
	private double html;
	private double css;
	public SinhVienIT(String hoten, String nganh,double java,double html,double css) {
		super(hoten, nganh);
	}
	@Override
	double getDiem() {
		double diem = (2*java+html+css)/4;
		return diem;
	}

}
