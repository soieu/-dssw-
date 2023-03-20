package ch05.problem;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요.");
		String student_num = scan.nextLine();
		int num = Integer.parseInt(student_num);
		int max = 0;
		int index = 0;
		int[] scores = new int[num];
		int total_score = 0;
		
		while(true)
		{
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");
			String strX = scan.nextLine();
			int x = Integer.parseInt(strX);
			if (x == 1)
			{
				System.out.println("학생수는 총 "+ num+"명 입니다.");
			}
			else if(x == 2 && index < num)
			{
				System.out.println((index+1)+"번 째 학생의 점수를 입력하세요.");
				String score_s = scan.nextLine();
				int score_n = Integer.parseInt(score_s);
				scores[index] = score_n;
				total_score += score_n;
				if (max < score_n)
				{
					max = score_n;
				}
				index++;
			}
			else if(x == 3)
			{
				for(int i = 0; i < scores.length; i++)
				System.out.println((i+1)+"번 째 학생의 점수는 "+scores[i] + "입니다.");
			}
			else if(x == 4)
			{
				System.out.println("최고점수는 "+max+"점, 평균 점수는 " +(total_score/scores.length)+"점 입니다.");
			}
			else if(x == 5)
			{
				break;
			}
		}
	}

}
