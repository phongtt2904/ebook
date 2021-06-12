package com.java2.lap3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class write_to_file {
	public static void main(String[] args) {
		File filename = new File("C:\\Users\\admin\\OneDrive\\Máy tính\\nhanvien.txt");
		try {
			FileWriter out = new FileWriter(filename);
			out.write("ten nhan vien");
			out.write(124);
			out.close();
		} catch (IOException e) {
			System.out.println("error: "+e);
		}
		
	}

}
