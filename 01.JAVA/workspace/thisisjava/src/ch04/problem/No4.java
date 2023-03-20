package ch04.problem;

public class No4 {

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			int dice1, dice2;
			dice1 = (int)(Math.random() * 6) + 1;
			dice2 = (int)(Math.random() * 6) + 1;
			System.out.println("dice1 : " + dice1 + ", dice2 : " + dice2);
			if(dice1+dice2 == 5)
				flag = false;
		}
	}

}
