package com.lap7.bai2;

public abstract class SinhVienPoly {
	private String Hoten;
	private String nganh;
	public SinhVienPoly(String hoten, String nganh) {
		super();
		Hoten = hoten;
		this.nganh = nganh;
	}
	abstract double getDiem();
	public void getHocLuc() {
		if(getDiem()<5)System.out.println("Yếu");
		if(getDiem()>=5 && getDiem()<6.5)System.out.println("Trung bình");
		if(getDiem()>=6.5 && getDiem()<7.5)System.out.println("Khá");
		if(getDiem()>=7.5 && getDiem()<9)System.out.println("Giỏi");
		if(getDiem()>=9)System.out.println("Xuất sắc");
	}
	public void xuat() {
		System.out.println("hoten: "+ Hoten+ "nganh: "+ nganh+"diem: "+getDiem());
		getHocLuc();
	}
}
