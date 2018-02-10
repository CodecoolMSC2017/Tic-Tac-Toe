import javax.swing.*;
import java.awt.*;

public class GuiTest {

    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lab;


    public GuiTest() {
        gui();
    }

    public void gui()
    {
        f = new JFrame("First Frame");
        f.setVisible(true);
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p = new JPanel();
        p.setBackground(Color.YELLOW);

        b1 = new JButton("Test");
        lab = new JLabel("This is a test label");
        p.add(b1);
        p.add(lab);

        f.add(p,BorderLayout.SOUTH );

    }

    public static void main(String[] args) {
        new GuiTest();
    }
}
