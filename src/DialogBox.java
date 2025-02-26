import javax.swing.JOptionPane;

public class DialogBox {
        public static void main(String[] args) {
                String name;
                short birthYear;
                int currentYear;
                name = JOptionPane.showInputDialog("Enter your name: ");
                String yob;
                yob = JOptionPane.showInputDialog(name + " when were you born? ");
                birthYear = Short.parseShort(yob);
                currentYear = Integer.parseInt(JOptionPane.showInputDialog("Enter current year: "));
                JOptionPane.showMessageDialog(null, name + " you are " + (currentYear - birthYear) + " years old");
        }
}
