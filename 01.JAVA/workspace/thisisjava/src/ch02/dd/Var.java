package ch02.dd;

public class Var {
	public static void main(String[] args) {
		int number;
		number = 3;
		double d = 3.14;
		int a;
		a = number + (int)d;
		System.out.println(a);
		
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte) (b1 + b2);
		System.out.println(b3);
		
		String s = "12" + 3 + "s";
		System.out.println(s);
		
		String age = "30";
		int age2  = Integer.parseInt(age);
		System.out.println(age2+10);
		
		String id = "admin";
		String id2 = new String("admin");
		System.out.println(id === id2);
		
	}
}
