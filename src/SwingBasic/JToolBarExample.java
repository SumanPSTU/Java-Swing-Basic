package SwingBasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToolBarExample extends JFrame {
    JButton toolButton;
    JComboBox<String> comboBox;
    JButton button;
    JTextField textField;
    JToolBarExample(){
        setTitle("JToolBar Example");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JToolBarExample.EXIT_ON_CLOSE);
        JToolBar toolBar = new JToolBar();
        String[] string = {"item-1","item-2","item-3"};
        comboBox = new JComboBox<>(string);
        button = new JButton("ToolBar");
        toolBar.add(comboBox);
        toolButton = new JButton(new ImageIcon("src/home.png"));
        textField = new JTextField();
        textField.setSize(100,50);
        toolBar.add(textField);
        toolBar.add(toolButton);
        toolBar.add(button);


        add(toolBar, BorderLayout.NORTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.blue);
            }
        });
        setVisible(true);
        toolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.YELLOW);
            }
        });
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getSelectedIndex() == 0){
                    getContentPane().setBackground(new Color(200, 31, 45));
                }
                if (comboBox.getSelectedIndex() == 1){
                    getContentPane().setBackground(new Color(80, 24, 177));
                }
                if (comboBox.getSelectedIndex() == 2){
                    getContentPane().setBackground(new Color(123, 50, 205));
                }
            }
        });
    }

    public static void main(String[] args) {
        new JToolBarExample();
    }
}
