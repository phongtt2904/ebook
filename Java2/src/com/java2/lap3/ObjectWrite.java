package com.java2.lap3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectWrite {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\OneDrive\\Máy tính\\nhanvien.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		NhanVien[] nv = {new NhanVien("234", "phong", 22, 1394), new NhanVien("2212", "minh", 22, 2389834)};
		

		oos.writeObject(nv);
		oos.close();
		

	}

}
