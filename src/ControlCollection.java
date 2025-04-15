import javax.swing.*;
import java.awt.FlowLayout;

public class ControlCollection extends JFrame {
        private JLabel operationLabel = new JLabel("Operation");
        private JLabel num1Label = new JLabel("Num 1");
        private JLabel num2Label = new JLabel("Num 2");
        private JLabel resultLabel = new JLabel("Result");
        private JTextField num1Field = new JTextField(5);
        private JTextField num2Field = new JTextField(5);
        private JTextField resultField = new JTextField(10);
        private JRadioButton sumButton, productButton, differenceButton;
        private JLabel genderLabel = new JLabel("Gender");
        private JRadioButton  femaleButton, maleButton;
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
                
                sumButton = new JRadioButton("Sum");
                productButton = new JRadioButton("Product");
                differenceButton = new JRadioButton("Difference");
                
                ButtonGroup opr = new ButtonGroup();
                opr.add(sumButton);
                opr.add(productButton);
                opr.add(differenceButton);
                
                add(operationLabel);
                add(sumButton);
                add(productButton);
                add(differenceButton);
                
                femaleButton = new JRadioButton("Female");
                maleButton = new JRadioButton("Male");
                
                ButtonGroup gender = new ButtonGroup();
                gender.add(femaleButton);
                gender.add(maleButton);
                
                add(genderLabel);
                add(femaleButton);
                add(maleButton);
                
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
        }
        
        public static void main(String[] args) {
                new ControlCollection();
        }
}

