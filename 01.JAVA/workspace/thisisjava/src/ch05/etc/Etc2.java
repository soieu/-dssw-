package ch05.etc;

public class Etc2 {

	public static void main(String[] args) {
		String a = new String();
		String b = a;
		System.out.println( a == b );
		System.out.println(a);
		System.out.println(b);
		a="안녕";
		System.out.println( a == b );
		System.out.println(a);
		System.out.println(b);
		
	}

}
