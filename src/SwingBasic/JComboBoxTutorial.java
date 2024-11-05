package SwingBasic;
import javax.swing.*;

public class JComboBoxTutorial extends JFrame {
    String[] com = {"Item-1","Item-2","Item-3"};
    JComboBoxTutorial(){
        setTitle("J ComboBox Tutorial");
        setSize(500,400);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JComboBoxTutorial.EXIT_ON_CLOSE);
        JComboBox comboBox = new JComboBox(com);
        comboBox.setBounds(0,0,100,20);
        add(comboBox);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JComboBoxTutorial();
    }
}
