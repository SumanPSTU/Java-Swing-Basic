package SwingBasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressExample extends JFrame {
    JProgressBar progressBar;
    Timer timer;
    JButton startButton;

    JProgressExample() {
        setTitle("Progress Bar with Button Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        // Create and configure the progress bar
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        progressBar.setBounds(150, 150, 200, 30);
        progressBar.setValue(0);
        progressBar.setForeground(new Color(13, 33, 255));
        add(progressBar);

        // Create the button to start the progress
        startButton = new JButton("Start Progress");
        startButton.setBounds(150, 200, 200, 30);
        add(startButton);

        // Timer to increment the progress bar
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = progressBar.getValue();
                if (value < 100) {
                    // Update the string message when progress is halfway
                    if (value == 50) {
                        progressBar.setString("Please wait...");
                    }
                    progressBar.setValue(value + 1);
                } else {
                    // Task complete
                    progressBar.setString("Complete!"); // Update final message
                    JOptionPane.showMessageDialog(null, "Task Complete");
                    timer.stop();
                }
            }
        });

        // Add action listener to the button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Start or restart the progress when the button is clicked
                if (!timer.isRunning()) {
                    progressBar.setValue(0);  // Reset progress bar value
                     // Update initial message
                    timer.start();  // Start the timer
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new JProgressExample();
    }
}
