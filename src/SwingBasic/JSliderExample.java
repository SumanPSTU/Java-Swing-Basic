package SwingBasic;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderExample extends JFrame {
    JSlider slider1;
    JSlider slider2;
    JSlider slider3;
    int r = 0, g = 0, b = 0;
    JPanel panel;
    JSliderExample() {
        setTitle("JSlider Example");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JSliderExample.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src/home.png").getImage());

        // Use a JPanel with BoxLayout to vertically stack the sliders
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Stack sliders vertically

        // Slider for Red value
        slider1 = new JSlider(0, 255, 20);  // Red slider: 0 to 255, initial 20
        slider1.setMajorTickSpacing(20);
        slider1.setMinorTickSpacing(5);
        slider1.setPaintTrack(true);
        slider1.setPaintTicks(true);
        slider1.setPaintLabels(true);
        panel.add(slider1);

        // Slider for Green value
        slider2 = new JSlider(0, 255, 25);  // Green slider: 0 to 255, initial 25
        slider2.setMajorTickSpacing(20);
        slider2.setMinorTickSpacing(5);
        slider2.setPaintTrack(true);
        slider2.setPaintTicks(true);
        slider2.setPaintLabels(true);
        panel.add(slider2);

        // Slider for Blue value
        slider3 = new JSlider(0, 255, 25);  // Blue slider: 0 to 255, initial 25
        slider3.setMajorTickSpacing(20);
        slider3.setMinorTickSpacing(5);
        slider3.setPaintTrack(true);
        slider3.setPaintTicks(true);
        slider3.setPaintLabels(true);
        panel.add(slider3);

        // Add the panel containing all sliders to the frame
        add(panel, BorderLayout.SOUTH);

        setVisible(true);

        // Change listener for Red slider
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                r = slider1.getValue();  // Update red value
                updateBackgroundColor();  // Update background color
            }
        });

        // Change listener for Green slider
        slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                g = slider2.getValue();  // Update green value
                updateBackgroundColor();  // Update background color
            }
        });

        // Change listener for Blue slider
        slider3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                b = slider3.getValue();  // Update blue value
                updateBackgroundColor();  // Update background color
            }
        });
    }

    // Method to update the background color
    private void updateBackgroundColor() {
        Color newColor = new Color(r, g, b);
        getContentPane().setBackground(newColor);// Update background color
        repaint();  // Force the frame to repaint
    }

    public static void main(String[] args) {
        new JSliderExample();
    }
}
