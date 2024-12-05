package BookStore.constructor.src.BookStore.view;

import BookStore.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Set;

public class MainFrame extends JFrame {
    JMenuBar mnb;
    JMenu menu;
    JMenuItem mni;
    JPanel mainPanel,panelItem;
    JButton btn;
    Set book;
    
    public MainFrame() throws HeadlessException {
        super();
        setTitle("Book Store");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(null);
        
        setJMenuBar(setMenuBar());
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        panelItem = new JPanel();
        panelItem.setLayout(new GridLayout(15,1));
        
        btn = new JButton("Quản Lí Sách");
        panelItem.add(btn);
        btn.setBackground(Color.WHITE);
        btn = new JButton("Quản Lí Hóa Đơn");
        panelItem.add(btn);
        btn.setBackground(Color.WHITE);
        btn = new JButton("Quản Lí Khách Hàng");
        panelItem.add(btn);
        btn.setBackground(Color.WHITE);
        
        JLabel label = new JLabel("UNG DUNG QUAN LI BAN SACH",JLabel.CENTER);
        
        mainPanel.add(label,BorderLayout.CENTER);
        mainPanel.add(panelItem,BorderLayout.WEST);
        add(mainPanel);
        
        setVisible(true);
    }
    
    public JMenuBar setMenuBar() {
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
        mni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    book = new FileLoader().loadBook();
                    System.out.println(book);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        menu.add(mni);
        mnb.add(menu, JMenuBar.getDefaultLocale());
        
        return mnb;
    }
    
    public static void main(String[] args) {
        new MainFrame();
    }
}