package LayoutManager;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample extends JFrame {
    JButton[] buttons = new JButton[5];

    BoxLayoutExample() {
        setTitle("BoxLayout Example");
        setSize(500, 400);
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        setIconImage(new ImageIcon("src/home.png").getImage());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(BoxLayoutExample.EXIT_ON_CLOSE);
        setResizable(true);
        BoxLayout boxLayout = new BoxLayout(getContentPane(), BoxLayout.X_AXIS);
        setLayout(boxLayout);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Button" + (i + 1));
            add(buttons[i]);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutExample();
    }
}
