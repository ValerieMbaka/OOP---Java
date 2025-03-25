import javax.swing.JOptionPane;

public class Admin {
        private String name;
        
        public Admin() {
                name = JOptionPane.showInputDialog("Enter the Admin's name: ");
                
                // Instantiate the Patient
                Patient P2 = new Patient();
                P2.viewDetails();
        }
        
        public static void main(String[] args) {
                Admin admin1 = new Admin();
                Patient.array1();
                
        }
}
