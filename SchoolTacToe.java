import javax.swing.*;
import java.awt.*;

public class SchoolTacToe{
    public static final int WIDTH = 996;
    public static final int HEIGHT = 996;

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(WIDTH, HEIGHT + 22);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(new TicTacPanel());
        window.setVisible(true);


    }
}