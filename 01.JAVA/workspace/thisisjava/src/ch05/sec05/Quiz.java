package ch05.sec05;

public class Quiz {

	public static void main(String[] args) {
		String fileName = "신한DS1회차.xlsx";
		
		System.out.println(fileName);
		fileName = fileName.replace(fileName.substring(0,fileName.indexOf(".xlsx")),"밀리세컨초");
		String ext = fileName.substring(fileName.indexOf("."));
		System.out.println(fileName);

	}

}
