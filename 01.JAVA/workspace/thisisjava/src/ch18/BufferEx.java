package ch18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferEx {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\util\\sqldeveloper-22.2.1.234.1810-x64.zip");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(fis.read() != -1) {} 
		long end = System.currentTimeMillis();
		System.out.println("버퍼 x : "+(end-start));
	}

}
