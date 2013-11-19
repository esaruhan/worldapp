/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.eba.world.ui;

import com.jidesoft.action.DockableBarDockableHolderPanel;
import com.jidesoft.dialog.JideOptionPane;
import com.jidesoft.docking.DockContext;
import com.jidesoft.docking.DockableFrame;
import com.jidesoft.docking.DockingManager;
import com.jidesoft.icons.IconsFactory;
import com.jidesoft.icons.JideIconsFactory;
import com.jidesoft.plaf.LookAndFeelFactory;
import com.jidesoft.plaf.UIDefaultsLookup;
import com.jidesoft.swing.JideBoxLayout;
import com.jidesoft.swing.JideTabbedPane;
import com.jidesoft.swing.TabEditingValidator;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.plaf.UIResource;

/**
 *
 * @author LifeBook
 */
public class ContentPane extends DockableBarDockableHolderPanel{

    private final String WIN2K_COLOR_THEME = "Win2K";
    private final String OFFICE2003_COLOR_THEME = "Office2003";
    private final String VSNET_COLOR_THEME = "Vsnet";
    private final String WINXP_COLOR_THEME = "WinXP";
    
    private static MyTabbedPane _tabbedPane;
    private static boolean _allowDuplicateTabNames = false;
      JPanel  _panel ;
    public ContentPane() {
        
        	this.getDockingManager().setProfileKey("Ana Ekran");
                
		this.getDockingManager().setInitDelay(100);
		this.getDockingManager().setSteps(1);
		this.getDockingManager().setStepDelay(0);

		this.getDockingManager().setUndoLimit(100);

		this.getDockingManager().beginLoadLayoutData();
                
		this.getDockingManager().setInitSplitPriority(DockingManager.SPLIT_EAST_WEST_SOUTH_NORTH);
              
                
                this.getDockingManager().addFrame(createSemalarFrame());
		this.getDockingManager().addFrame(createTablolarFrame());
                this.getDockingManager().getWorkspace().add(createTabbedPanel());
                
		this.getDockableBarManager().loadLayoutData();
                this.getDockingManager().loadLayoutData();
    }
    
    public JPanel createTabbedPanel(){
        
             _panel = new JPanel(new BorderLayout());
             _panel.setOpaque(true);
             _panel.setBackground(UIDefaultsLookup.getColor("control"));
             _panel.setBorder(BorderFactory.createEmptyBorder(6, 6, 6, 6));

            _tabbedPane = createTabbedPane();

            _panel.add(_tabbedPane, BorderLayout.CENTER);
             return _panel;
    }
    
    
    
    
    
    	public DockableFrame createSemalarFrame(){
		DockableFrame semalar_frame = new DockableFrame("İşlemler",JideIconsFactory.getImageIcon(JideIconsFactory.DockableFrame.FRAME3));
		semalar_frame.setTitle("İşlemler");
		semalar_frame.setPreferredSize(new Dimension(200,300));
		semalar_frame.getContext().setInitMode(DockContext.STATE_FRAMEDOCKED);
		semalar_frame.getContext().setInitSide(DockContext.DOCK_SIDE_WEST);
		semalar_frame.getContext().setInitIndex(0);		
//		semalar_frame.getContentPane().add();
		return semalar_frame;
	}
        
        	public DockableFrame createTablolarFrame(){
		DockableFrame tablolar_frame = new DockableFrame("Modüller",JideIconsFactory.getImageIcon(JideIconsFactory.DockableFrame.FRAME4));
		tablolar_frame.setTitle("Modüller");
		tablolar_frame.setPreferredSize(new Dimension(200,300));
		tablolar_frame.getContext().setInitMode(DockContext.STATE_FRAMEDOCKED);
		tablolar_frame.getContext().setInitSide(DockContext.DOCK_SIDE_WEST);
		tablolar_frame.getContext().setInitIndex(1);
//		tablolar_frame.getContentPane().add();
		return tablolar_frame;
	}
                
                
 private  MyTabbedPane createTabbedPane() {
        final MyTabbedPane tabbedPane = new MyTabbedPane(JideTabbedPane.TOP);
        tabbedPane.setOpaque(true);

        final String[] titles = new String[]{
                "Dünya 1",
                "Dünya 2",
                "Dünya 3",
                "Dünya 4"
        };

        final int[] mnemonics = new int[]{
                KeyEvent.VK_M,
                KeyEvent.VK_C,
                KeyEvent.VK_O,
                KeyEvent.VK_F
        };

        final ImageIcon[] icons = new ImageIcon[]{
                IconsFactory.getImageIcon(ContentPane.class, "icons/mail.png"),
                IconsFactory.getImageIcon(ContentPane.class, "icons/calendar.png"),
                IconsFactory.getImageIcon(ContentPane.class, "icons/contacts.png"),
                IconsFactory.getImageIcon(ContentPane.class, "icons/folder.png")
        };

        for (int i = 0; i < titles.length; i++) {
            JScrollPane scrollPane = new JScrollPane(new JTextArea());
            scrollPane.setPreferredSize(new Dimension(530, 530));
            tabbedPane.addTab(titles[i], icons[i], scrollPane);
            tabbedPane.setMnemonicAt(i, mnemonics[i]);
        }

        

        tabbedPane.setTabEditingValidator(new TabEditingValidator() {
            public boolean alertIfInvalid(int tabIndex, String tabText) {
                if (tabText.trim().length() == 0) {
                    JideOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(tabbedPane), "'" + tabText + "' is an invalid name for a tab title.", "Invalid Tab Title", JideOptionPane.ERROR_MESSAGE, null);
                    return false;
                }

                if (_allowDuplicateTabNames)
                    return true;

                for (int i = 0; i < tabbedPane.getTabCount(); i++) {
                    if (tabText.trim().equalsIgnoreCase(tabbedPane.getDisplayTitleAt(i)) && i != tabbedPane.getSelectedIndex()) {
                        JideOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(tabbedPane), "There is already a tab with the title of '" + tabText + "'.", "Invalid Tab Title", JideOptionPane.ERROR_MESSAGE, null);
                        return false;
                    }
                }
                return true;
            }

            public boolean isValid(int tabIndex, String tabText) {
                if (tabText.trim().length() == 0)
                    return false;

                if (_allowDuplicateTabNames)
                    return true;
                for (int i = 0; i < tabbedPane.getTabCount(); i++) {
                    if (tabText.trim().equalsIgnoreCase(tabbedPane.getDisplayTitleAt(i)) && i != tabbedPane.getSelectedIndex()) {
                        return false;
                    }
                }
                return true;
            }

            public boolean shouldStartEdit(int tabIndex, MouseEvent event) {
                return true;
            }
        });
        return tabbedPane;
    }
       
     

}
