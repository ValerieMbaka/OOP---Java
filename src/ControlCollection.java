import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlCollection extends JFrame implements ActionListener {
        private JLabel operationLabel = new JLabel("Operation");
        private JLabel num1Label = new JLabel("Num 1");
        private JLabel num2Label = new JLabel("Num 2");
        private JLabel resultLabel = new JLabel("Result");
        private JTextField num1Field = new JTextField(5);
        private JTextField num2Field = new JTextField(5);
        private JTextField resultField = new JTextField(10);
        private JRadioButton btnSum, btnProduct, btnDifference;
        private JLabel genderLabel = new JLabel("Gender");
        private JRadioButton  btnFemale, btnMale;
        private JCheckBox readingBox, swimmingBox, travellingBox;
        
        public ControlCollection() {
                super("Control Collection");
                setSize(400, 300);
                setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setLayout(new FlowLayout());
                
                add(num1Label);
                add(num1Field);
                add(num2Label);
                add(num2Field);
                add(resultLabel);
                add(resultField);
                resultField.setEditable(false);
                
                btnSum = new JRadioButton("Sum");
                btnProduct = new JRadioButton("Product");
                btnDifference = new JRadioButton("Difference");
                
                ButtonGroup opr = new ButtonGroup();
                opr.add(btnSum);
                opr.add(btnProduct);
                opr.add(btnDifference);
                
                add(operationLabel);
                add(btnSum);
                add(btnProduct);
                add(btnDifference);
                
                btnFemale = new JRadioButton("Female");
                btnMale = new JRadioButton("Male");
                
                ButtonGroup gender = new ButtonGroup();
                gender.add(btnFemale);
                gender.add(btnMale);
                
                add(genderLabel);
                add(btnFemale);
                add(btnMale);
                
                readingBox = new JCheckBox("Reading");
                swimmingBox = new JCheckBox("Swimming");
                travellingBox = new JCheckBox("Travelling");
                
                ButtonGroup hobbies = new ButtonGroup();
                hobbies.add(readingBox);
                hobbies.add(swimmingBox);
                hobbies.add(travellingBox);
                
                add(new JLabel("Hobbies: "));
                add(readingBox);
                add(swimmingBox);
                add(travellingBox);
                
                String[] games = {"Soccer", "Handball", "Basketball", "Athletics"};
                add(new JLabel("Games"));
                JComboBox cboGames = new JComboBox(games);
                add(cboGames);
                
                // Register the listener to the Operation radio buttons
                btnSum.addActionListener(this);
                btnProduct.addActionListener(this);
                btnDifference.addActionListener(this);
                
        }
        
        public static void main(String[] args) {
                
                new ControlCollection();
                
        }
        
        // Implementing listeners on the Operation radio buttons
        @Override
        public void actionPerformed(ActionEvent e) {
                int val1 = Integer.parseInt(num1Field.getText().trim());
                int val2 = Integer.parseInt(num2Field.getText().trim());
                int result;
                if (e.getSource() == btnSum) {
                        result = val1 + val2;
                        resultField.setText(Integer.toString(result));         // Write the result to the result field
                }
                
                if (e.getActionCommand().equals("Product")) {
                        result = val1 * val2;
                        resultField.setText(Integer.toString(result));         // Write the result to the result field
                }
                
                if (e.getActionCommand().equals("Difference")) {
                        result = val1 - val2;
                        resultField.setText(Integer.toString(result));         // Write the result to the result field
                }
        }
        
}

