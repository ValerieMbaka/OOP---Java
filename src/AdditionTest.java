/* Write Java code that will generate a user interface whose title is Addition Test, with a textbox and below it two buttons
with the symbols + and =. When a number is typed in the textbox, and a user clicks the button with plus sign, the number is read
and then cleared from the text box. The user is then able to type another number which is added to the first one. If the user wishes
 to add another number, they click the add button, and the number is read and added to the previous ones and cleared from the text box.
 To view the cumulated sum, the user clicks the button with an equal sign. The program should be terminated by clicking the close button
 on the title bar. (12 marks)
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionTest extends JFrame {
        private JTextField inputField;
        private JButton btnAdd, btnEqual;
        private double sum = 0; // to store cumulative sum
        
        public AdditionTest() {
                // Frame setup
                super("Addition Test");
                setSize(350, 250);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setLayout(new FlowLayout());
                setVisible(true);
                
                // Create UI components
                inputField = new JTextField(10);
                btnAdd = new JButton("+");
                btnEqual = new JButton("=");
                
                // Add components
                add(inputField);
                add(btnAdd);
                add(btnEqual);
                
                
                // Add button action
                btnAdd.addActionListener(e -> {
                        try {
                                double num = Double.parseDouble(inputField.getText());
                                sum += num;
                                inputField.setText(""); // Clear field
                        } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(this, "Please enter a valid number.");
                        }
                });
                
                // Equal button action
                btnEqual.addActionListener(e -> {
                        JOptionPane.showMessageDialog(this, "Sum: " + sum);
                });
        }
        public static void main(String[] args) {
                new AdditionTest();
        }
        
}
