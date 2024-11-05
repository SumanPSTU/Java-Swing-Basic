package SwingBasic;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JMenuExample extends JFrame {

    private JTextArea textArea;

    JMenuExample() {
        setTitle("Clipboard Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu editMenu = new JMenu("Edit");

        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copyText();
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasteText();
            }
        });

        setVisible(true);
    }

    private void copyText() {
        String selectedText = textArea.getSelectedText();
        if (selectedText != null && !selectedText.isEmpty()) {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(new StringSelection(selectedText), null);
        }
    }

    private void pasteText() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(this);
        if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                String text = (String) contents.getTransferData(DataFlavor.stringFlavor);
                textArea.insert(text, textArea.getCaretPosition());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new JMenuExample();
    }
}
