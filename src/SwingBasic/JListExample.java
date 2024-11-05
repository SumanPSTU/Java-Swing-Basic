package SwingBasic;

import javax.swing.*;

public class JListExample extends JFrame {
    JListExample() {
        setTitle("JList Title");
        setSize(500, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Creating a DefaultListModel and adding items to it
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("List-1");
        listModel.addElement("List-2");
        listModel.addElement("List-3");
        listModel.addElement("List-4");
        JList<String> list = new JList<>(listModel);
        list.setBounds(50, 50, 200, 20); // Setting bounds for the JList

        // Adding the JList to the JFrame
        add(list);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JListExample();
    }
}
