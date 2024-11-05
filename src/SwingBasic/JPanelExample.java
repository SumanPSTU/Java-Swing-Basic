package SwingBasic;

import javax.swing.*;
import java.awt.*;

public class JPanelExample extends JFrame {
    JPanel panel;

    JPanelExample() {
        setTitle("JPanel Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("src/home.png").getImage());
        panel = new JPanel();
        setLayout(null);
        panel.setBackground(Color.BLACK);
        Button buttonOne = new Button("click");
        Button buttonTwo = new Button("click");

        buttonOne.setBounds(20,20,100,40);
        buttonOne.setFont(new Font("Arial",Font.BOLD,19));
        panel.setBounds(0,0,250,200);
        panel.add(buttonOne);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JPanelExample();
    }
}
