import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class slip28B extends JFrame implements ItemListener
{
    JComboBox comboBox;
    DefaultTableModel model;
    JTable table;
    JScrollPane scrollPane;

    String emp [] = {"Pratyush","Sahil","Margi"};
    String q,enteredEmp,url,uname,pwd;
    String col[]= {"Number","Name","Salary","Designation"};
    Object [][] data ;
    Connection c;
    PreparedStatement pst;
    ResultSet rs;
    slip28B()
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
            comboBox = new JComboBox(emp);
            comboBox.setBounds(200,50,100,50);
            add(comboBox);
            Class.forName("com.mysql.cj.jdbc.Driver");
            url = "jdbc:mysql://localhost:3307/mydatabase";
            uname = "root";
            pwd = "matsumoto";
            c = DriverManager.getConnection(url,uname,pwd);
            getData();
            model = new DefaultTableModel(data,col);
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
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            getData();
            model.setDataVector(data, col);
        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->{
            new slip28B();
        });
    }
    private void getData()
    {
        try
        {
            q = "select * from employee where ename = ?";
            pst = c.prepareStatement(q);
            enteredEmp = (String)comboBox.getSelectedItem();
            pst.setString(1,enteredEmp);
            rs = pst.executeQuery();
            rs.last();
            int rowCount = rs.getRow();
            rs.beforeFirst();
            data = new Object[rowCount][col.length];
            int row = 0;
            while(rs.next())
            {
                for(int c = 0;c< col.length;c++)
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

