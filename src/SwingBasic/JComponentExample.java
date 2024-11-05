package SwingBasic;

import javax.swing.*;
import java.awt.*;

public class JComponentExample extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 100);
        g.setColor(Color.RED);
        g.drawString("Custom Component", 60, 40);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom JComponent Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new JComponentExample());
        frame.setVisible(true);
    }
}
