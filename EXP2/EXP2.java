import java.awt.*;
import java.awt.event.*;

public class EXP2 extends Frame implements MouseListener {

    String msg = "Perform Mouse Action";

    EXP2() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);

        addMouseListener(this);

        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        msg = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        msg = "Mouse Released";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        msg = "Mouse Entered Window";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        msg = "Mouse Exited Window";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 150);
    }

    public static void main(String[] args) {
        new EXP2();
    }
}