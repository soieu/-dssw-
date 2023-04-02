public class Board {
    static int size;
    static String[][] map;
    static String m;
    static int[] dx = {0, 1, 1, -1};
	static int[] dy = {1, 0, 1, 1};

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
            System.out.printf("%2d",row);
            for (int col = 0; col < size; col++) {
                System.out.print(" " + map[row][col]);
            }
            System.out.println();
        }
        System.out.print("   ");
        for (int i = 0; i < size; i++) {
            System.out.print((char)(i+'A')+" ");
        }
        System.out.println();
    }
    public static void turn(int a, int b, Player p) {
        map[b][a] = p.stone;
    }

    public static boolean end() {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(map[i][j].charAt(0) != '.')
                {
                    m = map[i][j];
                    for(int x = 0; x < 4; x++)
                    {
                        int cnt = 1;
                        int nx = i + dx[x];
                        int ny = j + dy[x];

                        while( 0<= nx && nx< size && 0<=ny && ny< size && map[nx][ny] == m)
                        {
                            cnt +=1;
                            if(cnt == 5)
                            {
                                if (0 <= i - dx[x] && i - dx[x] < 19 && 0 <= j - dy[x] && j - dy[x] < 19 && map[i - dx[x]][j - dy[x]] == m){
                                    break;
                                }
                                if (0 <= nx + dx[x] && nx + dx[x]< 19 && 0 <= ny + dy[x] && ny + dy[x] < 19 && map[nx + dx[x]][ny + dy[x]] == m)
                                {   
                                    break;
                                }
                                return false;
                            }
                            nx += dx[x];
                            ny += dy[x];

                        }
                    }
                }

            }
        }
        return true;
    }
}
