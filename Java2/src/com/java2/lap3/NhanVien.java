package com.java2.lap3;

import java.io.Serializable;
import java.util.Scanner;

public class NhanVien implements Serializable{
	private String manv;
	private String hoten;
	private int tuoi;
	private float luong;
	public NhanVien(String manv, String hoten, int tuoi, float luong) {
		super();
		this.manv = manv;
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.luong = luong;
	}
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public float getLuong() {
		return luong;
	}
	public void setLuong(float luong) {
		this.luong = luong;
	}
	
	@Override
	public String toString() {
		return "NhanVien [manv=" + manv + ", hoten=" + hoten + ", tuoi=" + tuoi + ", luong=" + luong + "]";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String manv = sc.nextLine();
		String hoten = sc.nextLine();
		int tuoi = sc.nextInt();
		float luong = sc.nextFloat();
		NhanVien nv = new NhanVien(manv, hoten, tuoi, luong);
		System.out.println(nv.toString());
	}
	

}
