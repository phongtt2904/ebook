package com.lap8;

public final class XPoly {
	public static final double sum(double...x) {
		double s = 0;
		for (double a : x) {
			s+= a;
		}
		return s;
	}
	public static final double max(double...x) {
		double max =x[0];
		for(int i = 0;i<x.length;i++) {
			if(x[0]<x[i]) {
				max=x[i];
				x[i] = x[0];
			}
		}
		return max;
	}
	public static final double min(double...x) {
		double min =x[0];
		for(int i = 0;i<x.length;i++) {
			if(x[0]>x[i]) {
				min = x[i];
				x[i] = x[0];
			}
		}
		return min;
	}
	public static final String toUpperFirstChar(String s) {
		String[] words = s.split(" ");
		for(int i = 0;i<words.length;i++) {
			char firstChar = words[i].charAt(0);
			char up = String.valueOf(firstChar).toUpperCase().charAt(0);
			words[i] = up + words[i].substring(1);
			String ss = String.join(" ", words);
			s=ss;
		}
		return s;
	}

}
