package ch04.problem;

import java.util.Scanner;

public class No7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		int inputInt = Integer.parseInt(input);
		if(account < inputInt) {
			System.out.println(account+"이하로만 출금 가능");
		}
	}

}
