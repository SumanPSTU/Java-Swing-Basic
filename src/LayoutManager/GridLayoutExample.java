package LayoutManager;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    JButton[] buttons = new JButton[15];
    GridLayoutExample(){
        setTitle("GridLayout Example");
        setSize(500,400);
        setMinimumSize(new Dimension(500,400));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(GridLayoutExample.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(5,5);
        layout.setHgap(10);
        layout.setVgap(10);
        setLayout(layout);

        for (int i = 0;i<buttons.length;i++){
            buttons[i] = new JButton("Button "+(i+1));
            add(buttons[i]);
        }


        setVisible(true);
    }
    public static void main(String[] args){
        new GridLayoutExample();
    }
}
