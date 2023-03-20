package ch11;

import java.io.FileInputStream;

public class ExceptionExam {

	public static void main(String[] args) {			
		try {
			System.out.println(3/1);
			System.out.println(3/0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Class.forName("java.lang.String");
			System.out.println("string 클래스 존재");
		} catch(Exception e) {
			System.out.println(e.getMessage());			
		}
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("");
		}catch (Exception e) {
			System.out.println(e.getMessage());			
		} finally {
			try {fis.close();} catch(Exception e) {}
		}

	}

}
