import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JTextField num1Field, num2Field, resultField;
    private JTextField sciField, sciResultField;

    public Calculator() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu modeMenu = new JMenu("Mode");
        JMenuItem normalItem = new JMenuItem("Normal");
        JMenuItem scientificItem = new JMenuItem("Scientific");
        normalItem.addActionListener(e -> cardLayout.show(cardPanel, "Normal"));
        scientificItem.addActionListener(e -> cardLayout.show(cardPanel, "Scientific"));

        modeMenu.add(normalItem);
        modeMenu.add(scientificItem);
        menuBar.add(modeMenu);
        setJMenuBar(menuBar);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        JPanel normalPanel = createNormalPanel();
        JPanel scientificPanel = createScientificPanel();

        cardPanel.add(normalPanel, "Normal");
        cardPanel.add(scientificPanel, "Scientific");

        add(cardPanel);

        cardLayout.show(cardPanel, "Normal");
    }


// Normal Panel //
    private JPanel createNormalPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        JLabel num1Label = new JLabel("Number 1:");
        JLabel num2Label = new JLabel("Number 2:");
        JLabel resultLabel = new JLabel("Result:");

        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(resultLabel);
        panel.add(resultField);

        return panel;
    }

    // Scientific Panel //
    private JPanel createScientificPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel sciLabel = new JLabel("Number:");
        JLabel sciResultLabel = new JLabel("Result:");

        sciField = new JTextField();
        sciResultField = new JTextField();
        sciResultField.setEditable(false);

        JButton sinButton = new JButton("Sin");
        JButton cosButton = new JButton("Cos");
        JButton tanButton = new JButton("Tan");
        JButton logButton = new JButton("Log");

        sinButton.addActionListener(this);
        cosButton.addActionListener(this);
        tanButton.addActionListener(this);
        logButton.addActionListener(this);

        panel.add(sciLabel);
        panel.add(sciField);
        panel.add(sinButton);
        panel.add(cosButton);
        panel.add(tanButton);
        panel.add(logButton);
        panel.add(sciResultLabel);
        panel.add(sciResultField);

        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("Add")) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                resultField.setText(String.valueOf(num1 + num2));
            } else if (e.getActionCommand().equals("Subtract")) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                resultField.setText(String.valueOf(num1 - num2));
            } else if (e.getActionCommand().equals("Multiply")) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                resultField.setText(String.valueOf(num1 * num2));
            } else if (e.getActionCommand().equals("Divide")) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                resultField.setText(String.valueOf(num1 / num2));
            } else if (e.getActionCommand().equals("Sin")) {
                double num = Double.parseDouble(sciField.getText());
                sciResultField.setText(String.valueOf(Math.sin(num)));
            } else if (e.getActionCommand().equals("Cos")) {
                double num = Double.parseDouble(sciField.getText());
                sciResultField.setText(String.valueOf(Math.cos(num)));
            } else if (e.getActionCommand().equals("Tan")) {
                double num = Double.parseDouble(sciField.getText());
                sciResultField.setText(String.valueOf(Math.tan(num)));
            } else if (e.getActionCommand().equals("Log")) {
                double num = Double.parseDouble(sciField.getText());
                sciResultField.setText(String.valueOf(Math.log10(num)));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input Your Number!!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
