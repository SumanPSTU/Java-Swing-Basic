package SwingBasic;

import javax.swing.*;
import java.awt.*;

public class JSpennerExample extends JFrame {
    JSpennerExample(){
        setTitle("JSpennerExample");
        setSize(600,500);
        setDefaultCloseOperation(JSpennerExample.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        SpinnerModel value = new SpinnerNumberModel(5,0,10,1);
        JSpinner spinner = new JSpinner(value);
        spinner.setFont(new Font("Arial",Font.PLAIN,18));
        spinner.setBounds(20,20,50,40);
        add(spinner);

        setVisible(true);
    }
    public static void main(String[]args){
        new JSpennerExample();
    }
}
