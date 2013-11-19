/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.eba.world.main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import tr.gov.eba.world.login.Login;

/**
 *
 * @author LifeBook
 */
public class EbaWorld {
    
    
    public static void main (String a[]){
        
        SwingUtilities.invokeLater(new Runnable(){ 
            @Override
            public void run() {
                
                     JFrame f = new JFrame("A JFrame");
                    f.setSize(250, 250);
                    f.setLocation(300,200);
                    f.getContentPane().add(new Login());
                    f.setVisible(true);        
            }
        });
    }
}
