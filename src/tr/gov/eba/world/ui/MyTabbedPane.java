/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.eba.world.ui;

import com.jidesoft.icons.IconsFactory;
import com.jidesoft.icons.JideIconsFactory;
import com.jidesoft.swing.JideTabbedPane;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;


/**
 *
 * @author LifeBook
 */
public class MyTabbedPane extends JideTabbedPane{
    
    private static boolean      SHOW_TAB_BUTTONS                        = true ;
    private static boolean      SHOW_TAB_AREA                           = true ;
    private static boolean      SHOW_TAB_CONTENT                        = true ;
    private static boolean      SHOW_CLOSE_BUTTON                       = false ;
    private static boolean      SHOW_CLOSE_BUTTON_ON_TAB                = true ; 
    private static boolean      SHOW_CLOSE_BUTTON_ON_SELECTED_TAB       = true ;
    private static boolean      USE_DEFAULT_SHOW_CLOSE_BUTTON_ON_TAB    = false ;
    private static boolean      FIRST_TAB_CLOSEABLE                     = true ;
    private static boolean      CLOSE_TAB_ON_MOUSE_MIDDLE_BUTTON        = true ;
    private static boolean      TAB_EDITING_ALLOWED                     = false ;
    private static boolean      BOLD_ACTIVE_TAB                         = true ;
    private static boolean      SCROLL_SELECTED_TAB_ON_WHEEL            = true ; 
    
    
     private static boolean     _allowDuplicateTabNames = false;

    public MyTabbedPane(int placement) {
        this.setTabPlacement(tabPlacement);
        setProperties();
    }
    
     
     
    
    public void setProperties(){
        
       this.setShowTabButtons( SHOW_TAB_BUTTONS );
       this.setShowTabArea(SHOW_TAB_AREA ) ;
       this.setShowTabContent( SHOW_TAB_CONTENT) ;
       this.setShowCloseButton( SHOW_CLOSE_BUTTON ) ;
       this.setShowCloseButtonOnTab(SHOW_CLOSE_BUTTON_ON_TAB);
       this.setUseDefaultShowCloseButtonOnTab( USE_DEFAULT_SHOW_CLOSE_BUTTON_ON_TAB ) ;
       this.setShowCloseButtonOnSelectedTab(SHOW_CLOSE_BUTTON_ON_SELECTED_TAB ) ;
       
       SwingUtilities.updateComponentTreeUI(this);
       this.setTabClosableAt( 0, FIRST_TAB_CLOSEABLE) ;
       this.setCloseTabOnMouseMiddleButton(CLOSE_TAB_ON_MOUSE_MIDDLE_BUTTON ) ;
       this.setTabEditingAllowed( TAB_EDITING_ALLOWED ) ;
       this.setBoldActiveTab(BOLD_ACTIVE_TAB );
       this.setScrollSelectedTabOnWheel(SCROLL_SELECTED_TAB_ON_WHEEL );
       Component leadingComponent = new LabelUIResource(IconsFactory.getImageIcon(ContentPane.class,"icons/eba-new_2.png"));
       this.setTabLeadingComponent(leadingComponent);
       this.setTabColorProvider(JideTabbedPane.ONENOTE_COLOR_PROVIDER);
        
    }

    
    
    
    class LabelUIResource extends JLabel implements UIResource {
        public LabelUIResource(String text) {
            super(text);
        }
        public LabelUIResource(Icon image) {
            super(image);
        }
    }
    
    
    
}
