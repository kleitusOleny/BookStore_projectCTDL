package bookStore.view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CustomerManagerPanel extends JPanel {
    CustomerManagerPanel(){
        setLayout(new BorderLayout());

        add(ButtonManagerPanel(), BorderLayout.NORTH);
        add(moreButtonPlease(), BorderLayout.CENTER);
        add(ListCustomerPanel(), BorderLayout.SOUTH);
    }

    JPanel ButtonManagerPanel() {
        JPanel informationPanel = new JPanel(new BorderLayout());
        TitledBorder titledBorder = BorderFactory.createTitledBorder("Nhập thông tin khách hàng");
        titledBorder.setTitleFont(new Font("Arial", Font.BOLD, 20));
        informationPanel.setBorder(titledBorder);

        // Panel bên trái
        JPanel leftPanel = new JPanel(new GridLayout(4, 2, 5, 5)); // 4 hàng, 2 cột, khoảng cách 5px
        JLabel customerId = new JLabel("Mã khách hàng:");
        JPanel idInputPanel = new JPanel(new BorderLayout());
        JTextField textSmallId = new JTextField(5); // Ô nhỏ
        textSmallId.setEditable(false);
        JTextField textLargeId = new JTextField(); // Ô lớn
        idInputPanel.add(textSmallId, BorderLayout.WEST);
        idInputPanel.add(textLargeId, BorderLayout.CENTER);
        JLabel customerName = new JLabel("Tên khách hàng:");
        JTextField textCustomerName = new JTextField();
        JLabel customerBirth = new JLabel("Ngày sinh khách hàng:");
        JTextField textCustomerBirth = new JTextField();
        JLabel typeCustomer = new JLabel("Loại khách hàng:");
        JTextField textTypeCustomer = new JTextField();
        leftPanel.add(customerId);
        leftPanel.add(idInputPanel);
        leftPanel.add(customerName);
        leftPanel.add(textCustomerName);
        leftPanel.add(customerBirth);
        leftPanel.add(textCustomerBirth);
        leftPanel.add(typeCustomer);
        leftPanel.add(textTypeCustomer);

        // Panel bên phải
        JPanel rightPanel = new JPanel(new GridLayout(2, 1, 10, 10)); // 2 hàng, 1 cột, khoảng cách 10px
        JButton addBtn = new JButton("Thêm Khách Hàng");
        JButton deleteBtn = new JButton("Xóa Khách Hàng");
        rightPanel.add(addBtn);
        rightPanel.add(deleteBtn);

        // Thêm leftPanel và rightPanel vào informationPanel
        informationPanel.add(leftPanel, BorderLayout.CENTER);
        informationPanel.add(rightPanel, BorderLayout.EAST);

        return informationPanel;
    }

    JPanel moreButtonPlease(){
        // bruh
        JPanel groupPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        JButton restartButton = new JButton("Làm mới danh sách");
        restartButton.setPreferredSize(new Dimension(150,50));
        JButton resetButton = new JButton("Xoá danh sách");
        resetButton.setPreferredSize(new Dimension(150,50));
        JButton checkButton = new JButton("Kiểm tra khách hàng"); // Kiểm tra xem khách hàng có tồn tại không
        checkButton.setPreferredSize(new Dimension(150,50));
        JButton findButton = new JButton("Tìm kiếm");
        findButton.setPreferredSize(new Dimension(150,50));
        buttonPanel.add(findButton);
        buttonPanel.add(restartButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(checkButton);
        groupPanel.add(buttonPanel);

        return groupPanel;
    }

    JPanel ListCustomerPanel(){
            // Table khách hàng
            JPanel tablePanel = new JPanel(new BorderLayout());
            TitledBorder titledBorder = BorderFactory.createTitledBorder("Bảng thông tin khách hàng");
            titledBorder.setTitleFont(new Font("Arial", Font.BOLD, 20));
            tablePanel.setBorder(titledBorder);
            String[] columns = {"STT", "Mã Khách Hàng", "Tên Khách Hàng", "Ngày Sinh", "Loại"};
            DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
            JTable table = new JTable(tableModel);
            table.getTableHeader().setReorderingAllowed(false);
            JScrollPane scrollPane = new JScrollPane(table);
            tablePanel.add(scrollPane);

            return tablePanel;
        }
}
