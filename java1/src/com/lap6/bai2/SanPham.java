package com.lap6.bai2;

public class SanPham {
	
	private String tenSp;
	private double donGia;
	private String hang;
	public String getHang() {
		return hang;
	}
	public SanPham(String tenSp, double donGia, String hang) {
		super();
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.hang = hang;
	}
	@Override
	public String toString() {
		return "SanPham [tenSp=" + tenSp + ", donGia=" + donGia + ", hang=" + hang + "]";
	}
	
	

}
