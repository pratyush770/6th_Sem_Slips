package Slip11B;
import java.io.*;
import javax.servlet.*;
public class Slip11B extends GenericServlet
{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter p = res.getWriter();
        int num1 = Integer.parseInt(req.getParameter("n1"));
        int num2 = Integer.parseInt(req.getParameter("n2"));
        int num3 = num1 + num2;
        p.println("<H2>The addition of two numbers is : " + num3);
        p.close();
    }
}
