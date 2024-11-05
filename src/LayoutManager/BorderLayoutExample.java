package LayoutManager;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {
    private JButton upButton,downButton,leftButton,rightButton,middleButton;
    BorderLayoutExample(){
        Font font = new Font("Arial",Font.BOLD,19);
        setTitle("BorderLayout Example");
        setSize(500,400);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(500,400));
        setDefaultCloseOperation(BorderLayoutExample.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src/home.png").getImage());


        upButton = new JButton("Up Button");
        upButton.setFont(font);
        add(upButton,BorderLayout.NORTH);

        downButton = new JButton("Down Button");
        downButton.setFont(font);
        add(downButton,BorderLayout.SOUTH);

        leftButton = new JButton("LeftButton");
        leftButton.setFont(font);
        add(leftButton,BorderLayout.LINE_END);

        rightButton = new JButton("RightButton");
        rightButton.setFont(font);
        add(rightButton,BorderLayout.LINE_START);

        middleButton = new JButton("MiddleButton");
        middleButton.setFont(font);
        add(middleButton,BorderLayout.CENTER);


        setVisible(true);
    }
    public static void main(String[] args){
        new BorderLayoutExample();
    }
}
