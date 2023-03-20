package ch05.problem;

public class Ex08 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int total_score = 0;
		int total_pop = 0;
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array[i].length; j++)
			{
				total_pop++;
				total_score += array[i][j];
			}
				
		}
		System.out.println("전체 합 : "+total_score+"\n전체 평균 : "+total_score/total_pop);

	}

}
