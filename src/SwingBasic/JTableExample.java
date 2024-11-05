package SwingBasic;

import javax.swing.*;

public class JTableExample extends JFrame {
    JTableExample() {
        setTitle("JTable title");
        setSize(500,400);
        setDefaultCloseOperation(JTableExample.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Sample data and column names
        String data[][] = {
                {"101", "Amit", "670000"},
                {"102", "Jai", "780000"},
                {"103", "Sachin", "700000"},
                {"101", "Amit", "670000"},
                {"102", "Jai", "780000"},
                {"103", "Sachin", "700000"},
                {"101", "Amit", "670000"},
                {"102", "Jai", "780000"},
                {"103", "Sachin", "700000"},
                {"101", "Amit", "670000"},
                {"102", "Jai", "780000"},
                {"103", "Sachin", "700000"},
                {"101", "Amit", "670000"},
                {"102", "Jai", "780000"},
                {"103", "Sachin", "700000"},
                {"101", "Amit", "670000"},
                {"102", "Jai", "780000"},
                {"103", "Sachin", "700000"},
                {"101", "Amit", "670000"},
                {"102", "Jai", "780000"},
                {"103", "Sachin", "700000"},
                {"101", "Amit", "670000"},
                {"102", "Jai", "780000"},
                {"103", "Sachin", "700000"},
                {"101", "Amit", "670000"},
                {"102", "Jai", "780000"},
                {"103", "Sachin", "700000"}
        };
        String column[] = {"ID", "NAME", "SALARY"};
        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(0,0,300,400);
        add(sp);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JTableExample();
    }
}
