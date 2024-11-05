package SwingBasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToggleButtonExample extends JFrame {
    JToggleButton button;
    JToggleButtonExample(){
        setTitle("Toggle Button Example");
        setSize(500,400);
        setDefaultCloseOperation(JToggleButtonExample.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        button = new JToggleButton("ON");
        button.setFont(new Font("Arial",Font.BOLD,19));
        button.setBounds(200,120,100,45);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button.isSelected()){
                    button.setText("OFF");
                    getContentPane().setBackground(new Color(25, 131, 195));
                }else {
                    button.setText("ON");
                    getContentPane().setBackground(Color.WHITE);
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[] args){
        new JToggleButtonExample();
    }

}
