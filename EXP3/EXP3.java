import java.awt.*;
import java.awt.event.*;

public class EXP3 extends Frame implements ActionListener {

    TextField t1, t2, t3;
    Label result;
    Button b;

    EXP3() {

        setTitle("Student Result");
        setSize(400, 300);

        // Grid layout: rows, columns
        setLayout(new GridLayout(5, 2, 10, 10));

        // Inputs
        add(new Label("Subject 1:"));
        t1 = new TextField();
        add(t1);

        add(new Label("Subject 2:"));
        t2 = new TextField();
        add(t2);

        add(new Label("Subject 3:"));
        t3 = new TextField();
        add(t3);

        // Button
        b = new Button("Calculate");
        add(b);

        // Empty space (for alignment)
        add(new Label(""));

        // Result
        result = new Label("Result will be shown here");
        add(result);

        b.addActionListener(this);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int m1 = Integer.parseInt(t1.getText());
            int m2 = Integer.parseInt(t2.getText());
            int m3 = Integer.parseInt(t3.getText());

            int total = m1 + m2 + m3;
            double percentage = total / 3.0;

            String res = (percentage >= 40) ? "Pass" : "Fail";

            result.setText("Total: " + total +
                           "  %: " + percentage +
                           "  Result: " + res);

        } catch (Exception ex) {
            result.setText("Enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new EXP3();
    }
}