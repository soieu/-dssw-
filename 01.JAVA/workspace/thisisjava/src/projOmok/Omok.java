package projOmok;

public class Omok {
    public static void main(String[] args) {
        Player user = new Player("사용자", "O");
        Player computer = new Player("컴퓨터", "X");
        Board board = new Board(19);
        play(board, user, computer);
    }
    private static void play(Board board, Player user, Player computer) {
        boolean flag = true;
    	board.print();
        
    	while(flag)
    	{
    		flag = board.playPlayer(user.name, user.stone, user);
    		flag = board.playPlayer(computer.name, computer.stone, computer);
    	}
    }
}