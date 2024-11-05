package LayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutExample extends JFrame implements ActionListener {
    JButton[] buttons = new JButton[10];
    FlowLayoutExample(){
        setTitle("FlowLayout Example");
        setSize(650,550);
        //setMinimumSize(new Dimension(500,400));
        setIconImage(new ImageIcon("src/home.png").getImage());
        setDefaultCloseOperation(FlowLayoutExample.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Button"+(i+1));
            buttons[i].setFont(new Font("Arial",Font.ITALIC,18));
            add(buttons[i]);
        }
        setVisible(true);
        buttons[0].addActionListener(this);
        buttons[1].addActionListener(this);
    }
    public static void main(String[] args){
        new FlowLayoutExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttons[0]){
            buttons[0].setText("Hello");
        } else if (e.getSource() == buttons[1]) {
            JOptionPane.showMessageDialog(null,"Button one is clicked");
        }
    }
}
