import java.awt.*;
import java.awt.event.*;

public class EXP1 extends Frame implements KeyListener {

    String pressed = "";
    String released = "";
    String typed = "";

    EXP1() {
        setTitle("Key Event Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());

        Label l = new Label("Click here and press any key");
        add(l);

        addKeyListener(this);

        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void keyPressed(KeyEvent e) {
        pressed = "Key Pressed: " + e.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        released = "Key Released: " + e.getKeyChar();
        repaint();
    }

    public void keyTyped(KeyEvent e) {
        typed = "Key Typed: " + e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(pressed, 50, 100);
        g.drawString(released, 50, 130);
        g.drawString(typed, 50, 160);
    }

    public static void main(String[] args) {
        new EXP1();
    }
}