import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlCollectionDialog extends JFrame {
        
        private JTextField num1Field, num2Field, resultField;
        private JRadioButton sumButton, productButton, differenceButton;
        private JRadioButton femaleButton, maleButton;
        private JCheckBox readingBox, swimmingBox, travellingBox;
        private JComboBox<String> gamesCombo;
        
        public ControlCollectionDialog() {
                setTitle("Control Collection");
                setSize(650, 300);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLocationRelativeTo(null);
                
                // Input fields: num1, num2, result
                JPanel inputPanel = new JPanel(new FlowLayout());
                num1Field = new JTextField(5);
                num2Field = new JTextField(5);
                resultField = new JTextField(10);
                resultField.setEditable(false);
                
                inputPanel.add(new JLabel("Num1:"));
                inputPanel.add(num1Field);
                inputPanel.add(new JLabel("Num2:"));
                inputPanel.add(num2Field);
                inputPanel.add(new JLabel("Result:"));
                inputPanel.add(resultField);
                
                // Operation section: radio buttons
                JPanel operationPanel = new JPanel(new FlowLayout());
                operationPanel.setBorder(BorderFactory.createTitledBorder("Operation"));
                
                sumButton = new JRadioButton("Sum");
                productButton = new JRadioButton("Product");
                differenceButton = new JRadioButton("Difference");
                
                ButtonGroup opGroup = new ButtonGroup();
                opGroup.add(sumButton);
                opGroup.add(productButton);
                opGroup.add(differenceButton);
                
                operationPanel.add(sumButton);
                operationPanel.add(productButton);
                operationPanel.add(differenceButton);
                
                // Gender section: Female & Male
                JPanel genderPanel = new JPanel(new FlowLayout());
                genderPanel.setBorder(BorderFactory.createTitledBorder("Gender"));
                
                femaleButton = new JRadioButton("Female");
                maleButton = new JRadioButton("Male");
                
                ButtonGroup genderGroup = new ButtonGroup();
                genderGroup.add(femaleButton);
                genderGroup.add(maleButton);
                
                genderPanel.add(new JLabel("Gender:"));
                genderPanel.add(femaleButton);
                genderPanel.add(maleButton);
                
                // Hobbies section: checkboxes
                JPanel hobbiesPanel = new JPanel(new FlowLayout());
                hobbiesPanel.setBorder(BorderFactory.createTitledBorder("Hobbies"));
                
                readingBox = new JCheckBox("Reading");
                swimmingBox = new JCheckBox("Swimming");
                travellingBox = new JCheckBox("Travelling");
                
                hobbiesPanel.add(new JLabel("Hobbies:"));
                hobbiesPanel.add(readingBox);
                hobbiesPanel.add(swimmingBox);
                hobbiesPanel.add(travellingBox);
                
                // Games dropdown section
                JPanel gamesPanel = new JPanel(new FlowLayout());
                gamesPanel.setBorder(BorderFactory.createTitledBorder("Games"));
                
                gamesCombo = new JComboBox<>(new String[] { "Soccer", "Handball", "Basketball", "Athletics" });
                
                gamesPanel.add(new JLabel("Games:"));
                gamesPanel.add(gamesCombo);
                
                // Layout everything
                setLayout(new GridLayout(5, 1));
                add(inputPanel);
                add(operationPanel);
                add(genderPanel);
                add(hobbiesPanel);
                add(gamesPanel);
                
                // Add listeners for the operation buttons
                ActionListener operationListener = e -> calculate();
                sumButton.addActionListener(operationListener);
                productButton.addActionListener(operationListener);
                differenceButton.addActionListener(operationListener);
                
                setVisible(true);
        }
        
        private void calculate() {
                try {
                        double num1 = Double.parseDouble(num1Field.getText().trim());
                        double num2 = Double.parseDouble(num2Field.getText().trim());
                        double result = 0;
                        
                        if (sumButton.isSelected()) {
                                result = num1 + num2;
                        } else if (productButton.isSelected()) {
                                result = num1 * num2;
                        } else if (differenceButton.isSelected()) {
                                result = num1 - num2;
                        }
                        
                        resultField.setText(String.valueOf(result));
                } catch (NumberFormatException e) {
                        resultField.setText("Invalid input!");
                }
        }
        
        public static void main(String[] args) {
                SwingUtilities.invokeLater(ControlCollectionDialog::new);
        }
}
