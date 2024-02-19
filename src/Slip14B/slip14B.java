import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class slip14B extends JFrame implements ItemListener
{
    Object [][] data;
    String column [] = {"SalesID","Date","Amount"};
    JComboBox comboBox;
    DefaultTableModel model;
    JTable table;
    JScrollPane scrollPane;
    String month [] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    String enteredMonth,q,url,uname,pwd;
    Connection c;
    PreparedStatement pst;
    ResultSet rs;
    slip14B()
    {
        try
        {
            setTitle("Slip14B");
            setVisible(true);
            setSize(500,500);
            setLocation(750,250);
            setLayout(null);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            getContentPane().setBackground(Color.WHITE);
            comboBox = new JComboBox(month);
            comboBox.setBounds(170,50,150,40);
            add(comboBox);
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://localhost:3307/mydatabase";
            uname = "root";
            pwd = "matsumoto";
            c = DriverManager.getConnection(url,uname,pwd);
            getData();
            model = new DefaultTableModel(data,column);
            table = new JTable(model);
            scrollPane = new JScrollPane(table);
            scrollPane.setBounds(20,140,440,250);
            add(scrollPane);
            comboBox.addItemListener(this);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getStateChange() == ItemEvent.SELECTED)
        {
            getData();
            model.setDataVector(data,column);
        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->{
            new slip14B();
        });
    }
    private void getData()
    {
        try
        {
            q = "select sid,sdate,samount from sales where month = ?";
            pst = c.prepareStatement(q);
            enteredMonth = (String)comboBox.getSelectedItem();
            pst.setString(1,enteredMonth);
            rs = pst.executeQuery();
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();
            data = new Object[rowCount][column.length];
            int row = 0;
            while(rs.next())
            {
                for(int c=0;c<column.length;c++)
                {
                    data[row][c] = rs.getObject(c+1);
                }
                row++;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
