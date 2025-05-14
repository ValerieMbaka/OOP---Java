import javax.swing.*;
import java.awt.event.*;

public class VoterVerification extends JFrame {
        
        public VoterVerification() {
                // Create the frame
                super("Voter Check");
                setSize(300, 200);
                setVisible(true);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                
                // Create the button
                JButton btnVerify = new JButton("Voter Verification");
                add(btnVerify);
                btnVerify.setBounds(60, 70, 160, 30); // position the button
                
                // Add action listener to button
                btnVerify.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String nationality = JOptionPane.showInputDialog(null, "Enter your nationality:");
                                if (nationality == null) return; // Cancel pressed
                                
                                String yearInput = JOptionPane.showInputDialog(null, "Enter your year of birth:");
                                if (yearInput == null) return; // Cancel pressed
                                
                                int yearOfBirth = Integer.parseInt(yearInput);
                                // int currentYear = java.time.Year.now().getValue();
                                int currentYear = 2025;
                                int age = currentYear - yearOfBirth;
                                
                                if (nationality.equalsIgnoreCase("Kenyan")) {
                                        if (age >= 18) {
                                                JOptionPane.showMessageDialog(null, "You are a voter.");
                                        } else {
                                                int yearsToWait = 18 - age;
                                                JOptionPane.showMessageDialog(null, "You are underage. Wait " + yearsToWait
                                                    + " more year(s).");
                                        }
                                } else {
                                        JOptionPane.showMessageDialog(null, "Report to the immigration office.");
                                }
                        }
                });
        }
        
        public static void main(String[] args) {
                new VoterVerification();
        }
}
