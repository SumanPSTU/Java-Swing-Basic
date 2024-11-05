package SwingBasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JSeparatorExample extends JFrame {
    JSeparatorExample(){
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
        edit.add(new JSeparator());
        edit.add(cut);
        edit.add(new JSeparator());
        edit.add(paste);

        // Add menu items to File menu
        file.add(New);
        file.add(new JSeparator());
        file.add(open);
        file.add(new JSeparator());
        file.add(exit);


        // Add menus to the menu bar
        menuBar.add(file);
        menuBar.add(format);
        menuBar.add(edit);
        add(menuBar, BorderLayout.PAGE_START);


        setVisible(true);


        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Are you sure?");
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });


    }
    public static void main(String[]args){
        new JSeparatorExample();
    }
}
