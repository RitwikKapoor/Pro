import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame {
    private TextField num1Field;
    private TextField num2Field;
    private Label resultLabel;

    public SimpleCalculator() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(300, 150);
        setLayout(new FlowLayout());

        // Create the input fields
        num1Field = new TextField(10);
        num2Field = new TextField(10);

        // Create the buttons
        Button addButton = new Button("Add");
        Button subtractButton = new Button("Subtract");

        // Create the result label
        resultLabel = new Label("Result: ");

        // Add components to the frame
        add(new Label("Number 1:"));
        add(num1Field);
        add(new Label("Number 2:"));
        add(num2Field);
        add(addButton);
        add(subtractButton);
        add(resultLabel);

        // Add action listeners to the buttons
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performAddition();
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performSubtraction();
            }
        });

        // Set the frame visible
        setVisible(true);
    }

    private void performAddition() {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 + num2;
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid input");
        }
    }

    private void performSubtraction() {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 - num2;
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid input");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
