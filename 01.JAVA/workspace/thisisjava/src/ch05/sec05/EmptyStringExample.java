package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		String hobby = "";
		if("".equals(hobby)) {
			System.out.println("hobby 변수가 참조하는 string 객체는 빈 문자열");
		}

	}

}
