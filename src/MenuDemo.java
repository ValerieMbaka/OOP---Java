// Menus
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo extends JFrame implements ActionListener {
        private JMenuBar mnuBar = new JMenuBar();
        private JMenu mnuFile, mnuView, mnuHelp, mnuZoom;
        private JMenuItem mniNew, mniExisting, mniExit, mniView20, mniView50, mniView100, mniOnline;
        
        public MenuDemo() {
                mnuFile = new JMenu("File");
                mnuView = new JMenu("View");
                mnuHelp = new JMenu("Help");
                mnuZoom = new JMenu("Zoom");
                mniNew = new JMenuItem("New");
                mniExisting = new JMenuItem("Existing");
                mniExit = new JMenuItem("Exit");
                mniView20 = new JMenuItem("20% View");
                mniView50 = new JMenuItem("50% View");
                mniView100 = new JMenuItem("100% View");
                mniOnline = new JMenuItem("Online");
                
                setVisible(true);
                setSize(400,300);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setJMenuBar(mnuBar);
                
                mnuBar.add(mnuFile);
                mnuBar.add(mnuView);
                mnuBar.add(mnuHelp);
                
                mnuFile.add(mniNew);
                mnuFile.add(mniExisting);
                mnuFile.add(mniExit);
                
                mnuView.add(mnuZoom);
                mnuZoom.add(mniView20);
                mnuZoom.add(mniView50);
                mnuZoom.add(mniView100);
                
                mnuHelp.add(mniOnline);
                
                mniExit.addActionListener(this);
                
                // mniExit.addActionListener(e -> {
                //    int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?");
                //    if (x == 0) {
                //        System.exit(0);
                //    }
                // });
                
        }
        
        public static void main(String[] args) {
                new MenuDemo();
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
                int x = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?");
                if (x == 0) {
                        System.exit(0);
                }
        }
        
        
        
}
