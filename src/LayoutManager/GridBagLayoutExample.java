package LayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridBagLayoutExample extends JFrame {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;

    GridBagLayoutExample() {
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout bagLayout = new GridBagLayout();
        setTitle("GridBag Layout Example");
        setSize(500, 400);
        setIconImage(new ImageIcon("src/home.png").getImage());
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(bagLayout); // Set GridBagLayout for the JFrame

        button1 = new JButton("Page -1");
        button2 = new JButton("Page -2");
        button3 = new JButton("Page -3");
        button4 = new JButton("Page -4");
        button5 = new JButton("Page -5");
        JButton button = new JButton("Button New");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 5, 5);
        add(button1, gbc);

        gbc.gridx = -1;
        gbc.gridy = 0;
        add(button2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(button3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        add(button4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;

        add(button,gbc);
        add(button5, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.blue);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
}
