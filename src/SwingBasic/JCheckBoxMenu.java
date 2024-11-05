package SwingBasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxMenu extends JFrame {
    JCheckBoxMenu() {
        setTitle("JCheckBox Menu Example");
        setSize(500, 400);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JCheckBoxMenu.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu format = new JMenu("Format");
        JMenu edit = new JMenu("Edit");

        // Menu items for each menu
        JMenuItem New = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem paste = new JMenuItem("Paste");

        // Add menu items to Edit menu
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);

        // Add menu items to File menu
        file.add(New);
        file.add(open);
        file.add(exit);

        // Adding JCheckBox items to Format menu
        JCheckBoxMenuItem bold = new JCheckBoxMenuItem("Bold");
        JCheckBoxMenuItem italic = new JCheckBoxMenuItem("Italic");

        format.add(bold);
        format.add(italic);

        // Add menus to the menu bar
        menuBar.add(file);
        menuBar.add(format);
        menuBar.add(edit);
        add(menuBar, BorderLayout.PAGE_START);


        JCheckBoxMenuItem showToolbar = new JCheckBoxMenuItem("Show Toolbar", true);
        JCheckBoxMenuItem showStatusBar = new JCheckBoxMenuItem("Show Status Bar", true);

        menuBar.add(showToolbar);
        menuBar.add(showStatusBar);

        showToolbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to show/hide the toolbar
                if (showToolbar.isSelected()) {
                    // Show the toolbar
                } else {
                    // Hide the toolbar
                }
            }
        });

        showStatusBar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic to show/hide the status bar
                if (showStatusBar.isSelected()) {
                    // Show the status bar
                } else {
                    // Hide the status bar
                }
            }
        });


        setVisible(true);

        // Exit action listener
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Are you sure?");
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        // Action listeners for JCheckBoxMenuItems
        bold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bold.isSelected()) {
                    System.out.println("Bold selected");
                } else {
                    System.out.println("Bold deselected");
                }
            }
        });
        italic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (italic.isSelected()) {
                    System.out.println("Italic selected");
                } else {
                    System.out.println("Italic deselected");
                }
            }
        });
    }
    public static void main(String[] args) {
        new JCheckBoxMenu();
    }
}
