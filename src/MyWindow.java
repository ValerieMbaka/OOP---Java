import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow extends JFrame {
        
        public MyWindow() {
                // JFrame demo = new JFrame("Window Demo");
                // demo.setVisible(true);
                // demo.setSize(500, 400);
                // demo.setDefaultCloseOperation(demo.EXIT_ON_CLOSE);
                super("My Frame Demo");
                setVisible(true);
                setSize(400, 300);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        
        public static void main(String[] s) {
                new MyWindow();
                MyWindow win = new MyWindow();
                JOptionPane.showMessageDialog(win, "Frame Demo worked well");
        }
        
}
