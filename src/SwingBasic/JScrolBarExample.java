package SwingBasic;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrolBarExample extends JFrame {
    JScrolBarExample(){
        setTitle("Title");
        setSize(500,400);
        setDefaultCloseOperation(JScrolBarExample.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        JScrollBar scrollBar = new JScrollBar();
        JLabel label = new JLabel();
        label.setBounds(0,0,100,40);
        scrollBar.setBounds(100,70,10,100);

        add(scrollBar);
        add(label);
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Scrolbar "+scrollBar.getValue());
            }
        });
        setVisible(true);
    }
    public static void main(String[] args){
        new JScrolBarExample();
    }
}
