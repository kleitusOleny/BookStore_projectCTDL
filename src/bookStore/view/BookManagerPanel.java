package bookStore.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class BookManagerPanel extends JPanel {
    JTextField textIDBook,textTitle,textAuthor, textPulish, textPrice, textYearPub;
    public BookManagerPanel(){
        setLayout(new BorderLayout());
        
        JPanel infoPanel = new InfoPanel();
        
        add(infoPanel,BorderLayout.NORTH);
        
        
    }
   
    public class InfoPanel extends JPanel{
        public InfoPanel(){
            setLayout(new BorderLayout());
            TitledBorder titledBorder = new TitledBorder("Quản Lí Sách");
            titledBorder.setTitleFont(new Font("Arial",Font.BOLD,20));
            setBorder(titledBorder);
            
            JPanel insertInfoPanel = new JPanel(new GridLayout(6,2));
            JLabel idBookLabel = new JLabel("Mã Sách");
            textIDBook = new JTextField();
            
            insertInfoPanel.add(idBookLabel);
            insertInfoPanel.add(textIDBook);
            
            JLabel titleLabel = new JLabel("Tên Sách");
            textTitle = new JTextField();
            insertInfoPanel.add(titleLabel);
            insertInfoPanel.add(textTitle);
            
            JLabel authorLabel = new JLabel("Tên Tác Giả");
            textAuthor = new JTextField();
            insertInfoPanel.add(authorLabel);
            insertInfoPanel.add(textAuthor);
            
            JLabel publishLabel = new JLabel("Nhà Xuất Bản");
            textPulish = new JTextField("");
            insertInfoPanel.add(publishLabel);
            insertInfoPanel.add(textPulish);
            
            JLabel priceLabel = new JLabel("Giá Sách");
            textPrice = new JTextField("");
            insertInfoPanel.add(priceLabel);
            insertInfoPanel.add(textPrice);
            
            JLabel yearPubLabel = new JLabel("Năm Xuất Bản:");
            textYearPub = new JTextField();
            insertInfoPanel.add(yearPubLabel);
            insertInfoPanel.add(textYearPub);
            
            add(insertInfoPanel);
        }
    }
    
}
