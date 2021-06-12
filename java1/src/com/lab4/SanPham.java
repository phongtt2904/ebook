package com.lab4;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	public double getThueNhapKhau() {
		double thue = 0.1*donGia;
		return thue;
		
	}
	public void xuat() {
		System.out.println("Ten san pham: " +tenSp +"\nDon gia: "+donGia+"\nGiam gia:"+ giamGia);
		
	}
	public void nhap() {
		this.tenSp= "pepsi";
		this.donGia=20000;
		this.giamGia=0.2;
		
		
		
	}
	

}
