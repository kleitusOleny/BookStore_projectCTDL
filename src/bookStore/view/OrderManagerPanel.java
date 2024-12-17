package bookStore.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
            setLayout(new BorderLayout());
            setBorder(BorderFactory.createMatteBorder(1,0,1,0,new Color(0,0,0)));
            
            JPanel insertBookPanel = new JPanel();
            insertBookPanel.setLayout(new GridLayout(12,2));
            
            JPanel line1 = new JPanel(new FlowLayout());
            JLabel idBookLabel = new JLabel("ID Sách:",JLabel.LEFT);
            JTextField textIDB = new JTextField("");
            textIDB.setPreferredSize(new Dimension(150,20));
            
            JPanel line2 = new JPanel(new FlowLayout());
            JLabel titleLabel = new JLabel("Tên Sách");
            JTextField textTitle = new JTextField("\t\t");
            textTitle.setPreferredSize(new Dimension(150,20));
            
            JPanel line3 = new JPanel(new FlowLayout());
            JLabel authorLabel = new JLabel("Tác Giả:");
            JTextField textAuthor = new JTextField("");
            textAuthor.setPreferredSize(new Dimension(150,20));
            
            JPanel line4 = new JPanel(new FlowLayout());
            JLabel publishLabel = new JLabel("Nhà Xuất Bản");
            JTextField textPulish = new JTextField("");
            textPulish.setPreferredSize(new Dimension(120,20));
            
            JPanel line5 = new JPanel(new FlowLayout());
            JLabel priceLabel = new JLabel("Giá Sách");
            JTextField textPrice = new JTextField("");
            textPrice.setPreferredSize(new Dimension(150,20));

            JPanel line6 = new JPanel(new FlowLayout());
            JLabel yearPubLabel = new JLabel("Năm Xuất Bản");
            JTextField textYearPub = new JTextField();
            textYearPub.setPreferredSize(new Dimension(130,20));
            
            JPanel line7 = new JPanel(new FlowLayout());
            JButton buttonAddBook = new JButton("Thêm");
            JButton buttonFind = new JButton("Tìm");
            
            
            
            line1.add(idBookLabel);line1.add(textIDB);
            line2.add(titleLabel);line2.add(textTitle);
            line3.add(authorLabel);line3.add(textAuthor);
            line4.add(publishLabel);line4.add(textPulish);
            line5.add(priceLabel);line5.add(textPrice);
            line6.add(yearPubLabel);line6.add(textYearPub);
            line7.add(buttonAddBook);line7.add(buttonFind);
            insertBookPanel.add(line1);insertBookPanel.add(line2);
            insertBookPanel.add(line3);insertBookPanel.add(line4);
            insertBookPanel.add(line5);insertBookPanel.add(line6);
            insertBookPanel.add(line7);
            add(insertBookPanel,BorderLayout.WEST);
            
            
            JPanel tablePanel = new JPanel();
            tablePanel.setLayout(new BorderLayout());
            String[]columns = {"STT","Mã Sách","Tên Sách","Tác Giả","Đơn Giá","Số Lượng","Thành Tiền"};
            DefaultTableModel model = new DefaultTableModel(columns,0);
            JTable table = new JTable(model);
            table.getTableHeader().setReorderingAllowed(false);
            JScrollPane scrollPane = new JScrollPane(table);
            
            
            tablePanel.add(scrollPane);
            add(tablePanel);
            
        }
    }
}
