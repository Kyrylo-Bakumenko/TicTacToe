import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacPanel extends JPanel implements MouseListener{
    Piece piece = new Piece();


    public TicTacPanel() {

        setBackground(new Color(255, 255, 230));
        //Color.LIGHT_GRAY
        addMouseListener(this);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        piece.paint(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}
