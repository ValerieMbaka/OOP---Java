import java.awt.FlowLayout;
import javax.swing.*;

public class LoginForm extends JFrame {
        private JLabel nameLabel = new JLabel("Registered Name:");
        private JLabel passwordLabel = new JLabel("User Password:");
        private JTextField userName = new JTextField(20);
        private JPasswordField password = new JPasswordField(20);
        private JButton authenticate = new JButton("Authenticate");
        private JButton reset = new JButton("Reset");
        
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
                add(authenticate);
                add(reset);
        }
        
        
        public static void main(String[] args) {
                new LoginForm();
                
        }
}
