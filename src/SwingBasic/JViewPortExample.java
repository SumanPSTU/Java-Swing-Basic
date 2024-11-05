package SwingBasic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JViewPortExample extends JFrame {
    private JLabel label;
    public JViewPortExample() {
        setTitle("JViewPort Example");
        setSize(500, 400);
        setDefaultCloseOperation(JViewPortExample.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src/home.png").getImage());
        setResizable(true);
        setLocationRelativeTo(null);

        ImageIcon image = new ImageIcon("src/2494.jpg");
        label = new JLabel(image);
        JScrollPane scrollPane = new JScrollPane(label);

        // Corrected: Use HORIZONTAL_SCROLLBAR_AS_NEEDED constant directly
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setViewportBorder(BorderFactory.createLineBorder(Color.BLUE));
        JViewport viewport = scrollPane.getViewport();
        JButton up = new JButton("up");
        JButton down = new JButton("down");
        JButton left = new JButton("left");
        JButton right = new JButton("right");
        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point point = viewport.getViewPosition();
                if (point.y>0){
                    Point origin = new Point(point.x,point.y-100);
                    viewport.setViewPosition(origin);
                }
            }
        });
        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point point = viewport.getViewPosition();
                if (point.y>=0){
                    Point origin = new Point(point.x,point.y+100);
                    viewport.setViewPosition(origin);
                }
            }
        });
        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point point = viewport.getViewPosition();
                if (point.x>=0){
                    Point origin = new Point(point.x+100,point.y);
                    viewport.setViewPosition(origin);
                }
            }
        });
        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point point = viewport.getViewPosition();
                if (point.x>0){
                    Point origin = new Point(point.x-100,point.y);
                    viewport.setViewPosition(origin);
                }
            }
        });
        JPanel panel = new JPanel();
        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);
        add(panel,BorderLayout.NORTH);
        add(scrollPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JViewPortExample();
    }
}
