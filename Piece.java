import java.awt.*;
/*
The thing that either displays an X or an O
Be able to click on this
 */
public class Piece {
    private int width = SchoolTacToe.WIDTH/3;
    private int height = SchoolTacToe.HEIGHT/3;
    private char value; // '-', 'X', 'O'
    // x and y variable

    public Piece() {
        this.value = '-';
    }

    public void paint(Graphics g){
        g.drawRect(0, 0, width, height);
        Font font = new Font("Courier New", Font.PLAIN, 166);
        g.setFont(font);
        g.drawString("" + value, width/2, height/2);
    }
}
