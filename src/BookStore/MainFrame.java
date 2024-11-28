package BookStore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    JMenuBar mnb;
    JMenu menu;
    JMenuItem mni;
    
    public MainFrame() throws HeadlessException{
        super();
        setTitle("Book Store");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);
        setLocationRelativeTo(null);
        setResizable(false);
        
        setJMenuBar(setMenuBar());
        
        
        setVisible(true);
        
        
    }
    
    public JMenuBar setMenuBar(){
        mnb = new JMenuBar();
        
        menu = new JMenu("Options");
        mni = new JMenuItem("Exit");
        mni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(mni);
        
        mni = new JMenuItem("Update Book");
        menu.add(mni);
        mnb.add(menu,JMenuBar.getDefaultLocale());
        
        return mnb;
    }
    
    public static void main(String[] args) {
        new MainFrame();
    }
}