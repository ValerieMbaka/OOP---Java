import javax.swing.*;
import java.awt.event.*;

public class PINAuthentication extends JFrame {
        private static final String CORRECT_PIN = "1234";
        private int attempts = 0;
        
        public PINAuthentication() {
                // Frame setup
                super("PIN Authentication");
                setSize(300, 150);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setVisible(true);
                setLayout(null);
                
                // Label
                JLabel pinLabel = new JLabel("Enter PIN:");
                pinLabel.setBounds(30, 20, 100, 25);
                add(pinLabel);
                
                // Text field
                JTextField pinField = new JTextField();
                pinField.setBounds(100, 20, 150, 25);
                add(pinField);
                
                // Button
                JButton loginBtn = new JButton("Login");
                loginBtn.setBounds(100, 60, 80, 30);
                add(loginBtn);
                
                // Action Listener
                loginBtn.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String enteredPin = pinField.getText();
                                
                                if (enteredPin.equals(CORRECT_PIN)) {
                                        // Correct PIN
                                        dispose(); // Close current form
                                        showMainMenu(); // Open Main Menu
                                } else {
                                        attempts++;
                                        if (attempts >= 3) {
                                                JOptionPane.showMessageDialog(null, "You have exhausted all attempts. Exiting.");
                                                System.exit(0);
                                        } else {
                                                JOptionPane.showMessageDialog(null, "Incorrect PIN. Try again.");
                                                pinField.setText(""); // Clear text field
                                        }
                                }
                        }
                });
               
        }
        
        private void showMainMenu() {
                JFrame menuFrame = new JFrame("Main Menu");
                menuFrame.setSize(300, 150);
                menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel label = new JLabel("Welcome to the Main Menu!", SwingConstants.CENTER);
                menuFrame.add(label);
                menuFrame.setVisible(true);
        }
        
        public static void main(String[] args) {
                new PINAuthentication();
        }
}
