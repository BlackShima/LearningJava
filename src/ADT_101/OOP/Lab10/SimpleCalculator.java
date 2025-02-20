import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {

    public static void main(String[] args) {
        // frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // panel with GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));

        // labels and text fields
        JLabel num1Label = new JLabel("Enter first number:");
        JTextField num1Field = new JTextField();
        JLabel num2Label = new JLabel("Enter second number:");
        JTextField num2Field = new JTextField();

        // Buttons
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");

        // Label to display result
        JLabel resultLabel = new JLabel("Result: ");

        // ActionListener for addition
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        // ActionListener for subtraction
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double difference = num1 - num2;
                    resultLabel.setText("Result: " + difference);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        // Add components to panel
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(resultLabel);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
