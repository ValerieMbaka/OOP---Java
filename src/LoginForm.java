import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {
        private JLabel nameLabel = new JLabel("Registered Name:");
        private JLabel passwordLabel = new JLabel("User Password:");
        private JTextField userName = new JTextField(20);
        private JPasswordField password = new JPasswordField(20);
        private JButton btnAuthenticate = new JButton("Authenticate");
        private JButton btnReset = new JButton("Reset");
        private JButton btnExit = new JButton("Exit");
        
        public LoginForm() {
                super("User Authentication");
                setSize(350, 250);
                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(new FlowLayout());
                
                add(nameLabel);
                add(userName);
                add(passwordLabel);
                add(password);
                add(btnAuthenticate);
                add(btnReset);
                add(btnExit);
                
                // Implementing listener using an anonymous class
                btnReset.addActionListener(e -> {
                        userName.setText("");      // Clear the typed username
                        password.setText("");       // Clear the typed password
                });
                
                // Register the listeners to controls
                btnAuthenticate.addActionListener(new EventHandler());
                btnExit.addActionListener(this);
                
        }
        
        public static void main(String[] args) {
                
                new LoginForm();
                
        }
        
        // Implementing listener using a helper class
        private class EventHandler implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                        String user = userName.getText();           // Returns the string typed by the user on the Username text field
                        String pword = password.getText();         // Returns the string typed by the user on the Password text field
                        
                        if (user.equalsIgnoreCase("Student") && pword.equals("ValeriE")) {
                                JOptionPane.showMessageDialog(null, "Login Successful. \nWelcome to Control Collection");
                                new ControlCollection();      // Instantiate the ControlCollection class
                                setVisible(false);                // Set the visible of the Login Form to false
                        }
                        else {
                                JOptionPane.showMessageDialog(null, "Type mismatch! \nTry again");
                                password.setText("");         // Clear the password field if the password is wrong
                        }
                }
        }
        
        // Implementing listener using the outer/main class
        @Override
        public void actionPerformed(ActionEvent e) {
                int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?");
                if (x == 0) {
                        System.exit(0);
                }
        }
        
}
