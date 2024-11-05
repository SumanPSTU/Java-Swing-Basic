package LayoutManager;

import javax.swing.*;
import java.awt.*;

public class GroupLayoutExample extends JFrame {
    GroupLayoutExample() {
        setTitle("Advanced GroupLayout Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel label = new JLabel("Name:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");

        // Create a container for the layout
        Container container = getContentPane();
        GroupLayout layout = new GroupLayout(container);
        container.setLayout(layout);

        // Enable automatic gaps between components
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Horizontal group with custom gaps and alignment
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(label)
                        .addGap(10)  // Custom gap of 10 pixels between label and text field
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING) // Align trailing (right)
                                .addComponent(textField)
                                .addComponent(button)
                        )
        );

        // Vertical group with alignment
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label)
                                .addComponent(textField)
                        )
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED) // Custom gap between rows
                        .addComponent(button)
        );

        setVisible(true);
    }

    public static void main(String[] args) {
        new GroupLayoutExample();
    }
}
