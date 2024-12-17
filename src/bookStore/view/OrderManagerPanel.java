package bookStore.view;

import javax.swing.*;
import java.awt.*;

public class OrderManagerPanel extends JPanel {
    
    public OrderManagerPanel(){
        setLayout(new BorderLayout());
        JPanel orderInformationPanel = new OrderInformationPanel();
        JPanel listInOrderPanel = new ListInOrderPanel();
        
        add(listInOrderPanel,BorderLayout.CENTER);
        add(orderInformationPanel,BorderLayout.NORTH);
    }
    public static class OrderInformationPanel extends JPanel{
        public OrderInformationPanel(){
            setLayout(new BorderLayout());
            JPanel titlePanel = new JPanel();
            JLabel label = new JLabel("Hóa Đơn Bán Hàng");
            label.setFont(new Font("Arial",Font.BOLD,20));
            titlePanel.add(label);
            add(titlePanel,BorderLayout.NORTH);
            
            JPanel infoPanel = new JPanel();
            infoPanel.setLayout(new GridLayout(3,2));
            
            JPanel line1InfoPanel = new JPanel(new FlowLayout(FlowLayout.LEADING));
            JLabel idLabel = new JLabel("       Mã Hóa Đơn:",JLabel.RIGHT);
            JTextField textID = new JTextField("\t\t");
            line1InfoPanel.add(idLabel);
            line1InfoPanel.add(textID);
            
            JPanel line2InfoPanel = new JPanel();
            line2InfoPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
            
            JLabel nameCusLabel = new JLabel("Tên Khách Hàng:");
            JTextField textNameCus = new JTextField("\t\t");
            line2InfoPanel.add(nameCusLabel);
            line2InfoPanel.add(textNameCus);
            
            JLabel idCusLabel = new JLabel("Mã Khách Hàng: ");
            JTextField textIDC = new JTextField("\t");
            line2InfoPanel.add(idCusLabel);
            line2InfoPanel.add(textIDC);
            
            JPanel line3InfoPanel = new JPanel();
            line3InfoPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
            
            JLabel orderDateLabel = new JLabel("    Ngày đặt hàng:");
            JTextField textDateOrder = new JTextField("\t\t");
            line3InfoPanel.add(orderDateLabel);line3InfoPanel.add(textDateOrder);
            
            JLabel deliveryDateLabel = new JLabel("Ngày giao hàng: ");
            JTextField textDelivery = new JTextField("\t\t");
            line3InfoPanel.add(deliveryDateLabel);line3InfoPanel.add(textDelivery);
            
            infoPanel.add(line1InfoPanel);
            infoPanel.add(line2InfoPanel);
            infoPanel.add(line3InfoPanel);
            add(infoPanel,BorderLayout.CENTER);
            
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            JButton btnCreateOrder = new JButton("Tạo Hóa đơn");
            JButton btnSearchOrder = new JButton("Tìm Hóa Đơn");
            
            buttonPanel.add(btnCreateOrder);
            buttonPanel.add(btnSearchOrder);
            
            add(buttonPanel,BorderLayout.SOUTH);
        }
    }
    
    public static class ListInOrderPanel extends JPanel{
        public ListInOrderPanel(){
            setBorder(BorderFactory.createMatteBorder(1,0,1,0,new Color(0,0,0)));
        }
    }
}
