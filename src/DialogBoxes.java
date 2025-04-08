import javax.swing.JOptionPane;

public class DialogBoxes {
        public static void main(String[] args) {
                String user, favourite;
                int x, y;
                
                // Input Dialog
                user = JOptionPane.showInputDialog(null,"Enter your name: ", "Username",
                    JOptionPane.WARNING_MESSAGE);
                
                // Message Dialog
                JOptionPane.showMessageDialog(null, user + " Welcome to GUI", "Welcome Message",
                    JOptionPane.ERROR_MESSAGE);
                
                // Confirm Dialog
                x = JOptionPane.showConfirmDialog(null, "Is your name " + user + " ?", "Name Confirmation",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (x == 0) {
                        JOptionPane.showMessageDialog(null, "Name well captured");
                }
                else if (x == 1) {
                        JOptionPane.showMessageDialog(null, "Sorry your name was missed");
                }
                else {
                        JOptionPane.showMessageDialog(null, "You neither affirmed nor denied your name");
                }
                
                Object[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
                favourite = (String) JOptionPane.showInputDialog(null, "Choose your favourite day of the week",
                    "Days of the week", JOptionPane.INFORMATION_MESSAGE, null, days, days[5]);
                JOptionPane.showMessageDialog(null, user + " you love " + favourite + " among days of the week");
                
                // Option Dialog
                Object[] mood = {"Happy", "Sad", "Moodless", "Cocktail mood"};
                y = JOptionPane.showOptionDialog(null, "What is your mood today?", "User Mood Check",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mood, mood[0]);
                if (y == 0) {
                        JOptionPane.showMessageDialog(null, "Keep being Happy");
                }
                else if (y == 1) {
                        JOptionPane.showMessageDialog(null, "Sorry for being Sad");
                }
                else {
                        JOptionPane.showMessageDialog(null, "Moodless is risky");
                }
                
                
        }
}
