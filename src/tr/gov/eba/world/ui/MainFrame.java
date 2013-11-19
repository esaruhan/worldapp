/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.eba.world.ui;

import com.jidesoft.plaf.LookAndFeelFactory;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author LifeBook
 */
public final class MainFrame extends JFrame implements WindowListener {
    
     private static int WIDTH  = 800;
     private static int HEIGHT = 500;
     private static int SCREEN_WIDTH = 400;
     private static int SCREEN_HEIGHT = 400;
     
    public MainFrame(){
        
      //Set Coordinates in Screen
      setFrameCoordinates();
        
      com.jidesoft.utils.Lm.verifyLicense("Visual Paradigm International Ltd.", "Visual Paradigm for UML", "f5uKXT9Z.kM3cm.EbmYQEbwmkfQ8xK52");  
      LookAndFeelFactory.setDefaultStyle(LookAndFeelFactory.OFFICE2007_STYLE);
      LookAndFeelFactory.installDefaultLookAndFeel();
      this.setTitle("EBA Dünya");
      this.getContentPane().add(new ContentPane());
      this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(true);
      this.setVisible(true);
      
      
      this.pack();
    }
    
    public void setFrameCoordinates(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize  = tk.getScreenSize();
        
        SCREEN_WIDTH = screenSize.width;
        SCREEN_HEIGHT = screenSize.height;
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(SCREEN_WIDTH/7, SCREEN_HEIGHT/7);   
    }


    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
       
        System.exit(0);
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    public static void main (String []aa){
          SwingUtilities.invokeLater(new Runnable() {
        public void run() {
      // Here, we can safely update the GUI
                new MainFrame();
        }
      });       
    }
    
    
}
