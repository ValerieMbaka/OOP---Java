// Input and output using the Graphical User Interface Dialog Boxes
import javax.swing.JOptionPane;

public class InputOutput {
        // Data members - Variables with class scope i.e. Instance and Class Variables
        private static String campus; // Class Variable - only one instance of campus
        private String course; // Instance variable - each object of the class has it own reference of course
        
        // Main method
        public static void main(String[] args) {
                String name, temp;
                byte num1;
                short num2;
                float num3;
                double result;
                name = JOptionPane.showInputDialog("What is your name? ");
                temp = JOptionPane.showInputDialog(name + " Enter a  number less than 128");
                num1 = Byte.parseByte(temp);
                num2 = Short.parseShort(JOptionPane.showInputDialog("Enter a number greater than 128 but less than 32767 "));
                num3 = Float.parseFloat(JOptionPane.showInputDialog("Enter a number with decimal place "));
                result = num1 + num2 + num3;
                JOptionPane.showMessageDialog(null, name + " the sum of your numbers is " + result);
                
                staticMethod();
                
                // Initialize the object by initializing the constructor
                InputOutput obj1 = new InputOutput();
                InputOutput obj2 = new InputOutput();
                obj1.instanceMethod();
                obj1.showDetails(); // Display the campus and course
                
                staticMethod();
                obj2.instanceMethod();
                obj2.showDetails();
                
                obj1.showDetails();
                
              
        }
        
        // Methods
        // Static method - can access a static member but cannot access a non-static member
        public static void staticMethod() {
                campus = JOptionPane.showInputDialog("Enter your campus name: ");
        }
        
        // Instance method - can access both static and non-static members
        public void instanceMethod() {
                // campus = JOptionPane.showInputDialog("Enter your campus name: ");
                course = JOptionPane.showInputDialog("Which course are you taking at " + campus + " ?");
        }
        
        // Method to display the campus and course
        public void showDetails() {
                JOptionPane.showMessageDialog(null, "You are in " + campus + " studying " + course );
        }
}
