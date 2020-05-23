public class Grid {
    private Piece[][] grid = new Piece[3][3];

    public Grid(){
        for(int row = 0; row < 3; row++){
            for(int columns = 0; columns < 3; columns++){
                grid[row][columns] = new Piece();
            }
        }
    }
}
