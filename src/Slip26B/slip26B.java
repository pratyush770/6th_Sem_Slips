package Slip26B;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class slip26B extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JTable table;
    DefaultTableModel model;
    JScrollPane scrollPane;
    String col[] = {"Product ID","Product Name","Amount"};
    Object data [][];
    Connection c;
    PreparedStatement pst;
    ResultSet rs;
    String url,uname,pwd,q;
    JTextField startDate,endDate;
    JButton b1;
    slip26B()
    {
        try
        {
            setTitle("Product Details");
            setSize(800,800);
            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);
            setLocation(500,120);

            l1 = new JLabel("Start Date");
            l1.setBounds(20,50,250,50);
            l1.setFont(new Font("Arial",Font.BOLD,20));
            add(l1);
            startDate = new JTextField();
            startDate.setBounds(130,50,200,50);
            startDate.setFont(new Font("Arial",Font.PLAIN,18));
            add(startDate);

            l2 = new JLabel("End Date");
            l2.setBounds(460,50,250,50);
            l2.setFont(new Font("Arial",Font.BOLD,20));
            add(l2);
            endDate = new JTextField();
            endDate.setBounds(560,50,200,50);
            endDate.setFont(new Font("Arial",Font.PLAIN,18));
            add(endDate);

            b1 = new JButton("Display");
            b1.setBounds(610,670,150,50);
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            b1.setFont(new Font("Arial",Font.BOLD,20));
            b1.addActionListener(this);
            add(b1);
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://localhost:3307/mydatabase";
            uname = "root";
            pwd = "matsumoto";
            c = DriverManager.getConnection(url,uname,pwd);
            model = new DefaultTableModel(data,col);
            table = new JTable(model);
            scrollPane = new JScrollPane(table);
            scrollPane.setBounds(20,140,740,500);
            add(scrollPane);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String start = startDate.getText();
            String end = endDate.getText();
            getData(start,end);
        }
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->{
            new slip26B();
        });
    }
    private void getData(String start,String end)
    {
        try
        {
            q = "select * from product where date between ? and ?";
            pst = c.prepareStatement(q);
            pst.setString(1,start);
            pst.setString(2,end);
            rs = pst.executeQuery();
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();
            data = new Object[rowCount][col.length];
            int row = 0;
            while(rs.next())
            {
                for(int c = 0;c<col.length;c++)
                {
                    data[row][c] = rs.getObject(c+1);
                }
                row++;
            }
            model.setDataVector(data,col);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
