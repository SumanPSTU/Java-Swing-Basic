package SwingBasic;

import javax.swing.*;
import java.awt.*;

public class JTabbetPaneExample extends JFrame {
    JTabbetPaneExample() {
        setTitle("JTabbedPane Example");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JTabbetPaneExample.EXIT_ON_CLOSE);

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();


        JPanel panel1 = new JPanel();
        JTextArea area1 = new JTextArea(10,30);
        JScrollPane scrollPane = new JScrollPane(area1);
        panel1.add(scrollPane);
        tabbedPane.add("tab-1",panel1);

        JPanel panel2 = new JPanel();
        JTextArea area2 = new JTextArea(30,40);
        JScrollPane scrollPane1 = new JScrollPane(area2);
        panel2.add(scrollPane1);
        tabbedPane.add("tab-2",panel2);
        // Add the JTabbedPane to the frame
        add(tabbedPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JTabbetPaneExample();
    }
}
