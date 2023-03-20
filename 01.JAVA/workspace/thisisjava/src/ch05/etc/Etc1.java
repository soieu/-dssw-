package ch05.etc;

public class Etc1 {
	public static void main(String[] args) {
		// TODO 0307 stringbuffer랑 stringbuilder랑 string 속도 차이, 그리고 append
		StringBuffer str1 = new StringBuffer();
		
		long start = System.currentTimeMillis();
		for (int i = 0; i<10000; i++) {
			str1.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("string buffer 소요시간: "+(end-start));
		
		String str2 = new String("");
		
		start = System.currentTimeMillis();
		for (int i = 0; i<10000; i++) {
			str2+=i;
		}
		end = System.currentTimeMillis();
		System.out.println("string 소요시간: "+(end-start));

	}

}
