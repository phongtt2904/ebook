package com.lap6;

import java.util.Scanner;

public class HoTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hoten = sc.nextLine();
		String ho = hoten.substring(0,hoten.indexOf(" "));
		String ho1 = ho.toUpperCase();
		String ten = hoten.substring(hoten.lastIndexOf(" "), hoten.length());
		String ten1 = ten.toUpperCase();
		System.out.println(" "+ho1);
		System.out.println(hoten.substring(hoten.indexOf(" "), hoten.lastIndexOf(" ")));
		System.out.println(ten1);
		
	}

}
