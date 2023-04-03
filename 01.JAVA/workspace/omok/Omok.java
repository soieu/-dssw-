import java.util.Scanner;

public class Omok {
    public static void main(String[] args) {
        Player user = new Player("사용자", "O");
        Player computer = new Player("컴퓨터", "X");
        Board board = new Board(19);
        play(board, user, computer);
    }

    private static void play(Board board, Player user, Player computer) {
        board.print();

        int flag = 0; // 0이면 user 차례, 1이면 computer
        while(Board.end())
        {
            Scanner scan = new Scanner(System.in);
            
            if (flag==0)
            {
                System.out.print("사용자> ");
                int a = scan.next().charAt(0) - 'A';
                int b = scan.nextInt();
                Board.turn(a,b,user);
                flag = 1;
            }
            else
            {
                System.out.print("컴퓨터> ");
                int a = scan.next().charAt(0) - 'A';
                int b = scan.nextInt();
                Board.turn(a,b,computer);
                flag = 0;
            }
            board.print();
        }
        if(flag == 0){
            System.out.println("computer 승");
        }
        else {
            System.out.println("user 승");
        }

    }

}
