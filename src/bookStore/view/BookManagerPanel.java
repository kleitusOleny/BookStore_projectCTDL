package bookStore.view;

import javax.swing.*;
import java.awt.*;

public class BookManagerPanel extends JPanel {
    public BookManagerPanel(){
        setLayout(new BorderLayout());
        
        JPanel infoPanel = new InfoPanel();
        
        add(infoPanel,BorderLayout.NORTH);
        
        
    }
   
    public static class InfoPanel extends JPanel{
        public InfoPanel(){
            setLayout(new BorderLayout());
            JLabel titleLabel = new JLabel("Quản Lí Sách",JLabel.CENTER);
            titleLabel.setFont(new Font("Arial",Font.BOLD,20));
            add(titleLabel,BorderLayout.NORTH);
            
            JPanel insertInfoPanel = new JPanel();
            insertInfoPanel.setLayout(new GridLayout(8,2));
            
        }
    }
    
}
