package ch04.problem;

import java.util.Scanner;

public class NumberMatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int computerNum = (int)(Math.random()*100+1);
		boolean flag = true;
		int tryy = 0;

		while (flag) {
			System.out.println("1~100 사이의 숫자를 입력하세요.");
			String input = scan.nextLine();
			int inputInt = Integer.parseInt(input);
			if(inputInt == computerNum) {
				flag = false;
				System.out.println("맞았습니다. 시도횟수 "+ tryy + "회");
			}
			else if (inputInt < computerNum)
				System.out.println("큰 수를 입력하세요.");
			else if (inputInt > computerNum)
				System.out.println("작은 수를 입력하세요.");
			tryy++;
		}
		
		scan.close();
		

	}

}
