package SwingBasic;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogExample extends JFrame implements ActionListener {
    JButton button;

    JDialogExample() {
        setTitle("JDialog Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        button = new JButton("Click Me");
        button.setBounds(50, 100, 100, 50);
        add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JDialogExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JDialog dialog = new JDialog(this,"Dialog Title",true);
            dialog.setSize(400,300);
            dialog.setLocationRelativeTo(null);
            dialog.setLayout(null);



            JButton button1 = new JButton("Close");
            button1.setBounds(100,100,70,30);
            dialog.add(button1);

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null,"Closing Dialog");
                    dialog.dispose();
                }
            });
            dialog.setVisible(true);
        }
    }
}
