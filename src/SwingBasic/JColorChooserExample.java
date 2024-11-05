package SwingBasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JColorChooserExample extends JFrame {
    JDialog dialog;
    JColorChooserExample() {
        setTitle("JColorChooser Example");
        setSize(500, 400);
        setDefaultCloseOperation(JColorChooserExample.EXIT_ON_CLOSE);
        setResizable(true);
        setIconImage(new ImageIcon("src/home.png").getImage());
        setLocationRelativeTo(null);
        JButton button = new JButton("Click");
        add(button, BorderLayout.NORTH);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog = new JDialog();
                JColorChooser colorChooser = new JColorChooser();
                dialog.setSize(500, 400);
                dialog.setLocationRelativeTo(null);
                dialog.add(colorChooser);
                dialog.setVisible(true);

                // Add a ChangeListener to update the background when the color is selected
                colorChooser.getSelectionModel().addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        getContentPane().setBackground(colorChooser.getColor());
                    }
                });
            }
        });
    }

    public static void main(String[] args) {
        new JColorChooserExample();
    }
}
