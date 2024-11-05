package SwingBasic;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class JFileChooseExample extends JFrame {
    JFileChooser fileChooser;

    JFileChooseExample() {
        setTitle("JFileChooser Example");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLayout(null);
        fileChooser = new JFileChooser();
        fileChooser.setBounds(10,10,450,350);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("pfd","pdf");
        fileChooser.setFileFilter(filter);
        int returnFile = fileChooser.showOpenDialog(null);
        if (returnFile == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            if (file!=null){
                try {
                    if (Desktop.isDesktopSupported()){
                        Desktop desktop = Desktop.getDesktop();
                        if (file.exists()){
                            desktop.open(file);
                        }else {
                            JOptionPane.showMessageDialog(null,"File doesn't exist");
                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"File doesn't supported");
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }else {
                JOptionPane.showMessageDialog(null,"File is null");
            }
        }
        add(fileChooser);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFileChooseExample();
    }
}
