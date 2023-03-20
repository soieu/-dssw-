package projOmok;

import java.util.Scanner;

public class Board {
    int size;
    String[][] map;
    Board(int size) {
        this.size = size;
        map = new String[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                map[row][col] = ".";
            }
        }
    }
    public void print() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
            	if(col == 0 && row >9)
            		System.out.print(row);
            	else if (col == 0)
            		System.out.print(" "+ row);
                System.out.print(" " + map[row][col]);
            }
            System.out.println();
        }
        System.out.print("   ");
        for (int i = 0; i < size; i++)
        {
        	System.out.print((char)(i+'A')+ " ");
        }
    }
    
    // 플레이어가 돌의 위치를 입력하고, 돌이 없으면 돌을 놓고 다시 보드를 출력. return값으로 five의 결과를 출력해서 5개가 만들어졌는지 확인
    public boolean playPlayer(String name, String stone, Player player) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("\n"+name+">");
    	int col = (int)scan.next().charAt(0) - 'A';
    	int row = scan.nextInt();
    	

    	//돌을 놓을까?
    	if(map[row][col] != ".")
    	{
    		System.out.println("이미 돌이 있습니다. 다시 입력하세요!!");
    	}
    	else
    	{
    		map[row][col] = stone;
    		print();
    	}
    	return five(player);
    }
    
    // 5줄이 완성됐는지 확인
    private boolean five(Player player)
    {
    	// / : a         \ : b         | : c       - : d
    	int a = 0;
    	int b = 0;
    	int c = 0;
    	int d = 0;
    	
    	
    	if(map[row+1][col+1] == player.stone || map[row-1][col-1] == player.stone)
    	{
    		while (map)
    		
    	}
    		return false;
    	return true;
    }
}







































