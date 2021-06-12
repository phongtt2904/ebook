package com.lap5.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class NhapMang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		ArrayList<Double> list = new ArrayList<Double>(n);
		for(int i = 0; i<n;i++) {
		Double x = sc.nextDouble();
		list.add(x);
		}
		for(double x:list) {
			sum+=x;
			
		}
		System.out.println("danh sach cac phan tu"+list);
		System.out.println("tong: " + sum);
		
	}
	
	
}
