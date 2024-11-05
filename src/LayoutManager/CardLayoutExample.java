package LayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    Container container;
    CardLayout cardLayout;
    CardLayoutExample(){
        setTitle("CardLayout Example");
        setSize(600,500);
        setDefaultCloseOperation(CardLayoutExample.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout(10,10);

        setIconImage(new ImageIcon("src/home.png").getImage());
        container = getContentPane();
        container.setLayout(cardLayout);

        button1 = new JButton("Page -1");
        button2 = new JButton("Page -2");
        button3 = new JButton("Page -3");
        button4 = new JButton("Page -4");
        button5 = new JButton("Page -5");

        container.add(button1,"1");
        container.add(button2,"2");
        container.add(button3,"3");
        container.add(button4,"4");
        container.add(button5,"5");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);


        setVisible(true);
    }
    public static void main(String[]args){
        new CardLayoutExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(container);


    }
}