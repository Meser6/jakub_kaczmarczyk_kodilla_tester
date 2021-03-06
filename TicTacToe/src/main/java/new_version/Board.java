package new_version;

public class Board {


    private final static int SIZEX = 3;
    private final static int SIZEY = 3;
    private Side[][] board = new Side[SIZEX][SIZEY];

    public void put(int x, int y, Side side) {
        board[x][y] = side;

    }

    public void draw() {
        for (int x = 0; x < SIZEX; x++) {
            System.out.println("\n-----|-----|-----");
            for (int y = 0; y < SIZEY; y++) {
                if (this.board[x][y] != null) {
                    System.out.print(this.board[x][y]);
                    System.out.print("  |  ");
                }
            }
        }
    }
}
