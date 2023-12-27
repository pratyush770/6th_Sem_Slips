import java.io.*;
import javax.servlet.*;
public class Slip15B extends GenericServlet
{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        int s1 = Integer.parseInt(req.getParameter("n1"));
        String s2 = req.getParameter("n2");
        String s3 = req.getParameter("n3");
        int t = Integer.parseInt(req.getParameter("n4"));
        float p = (t*100)/500;
        String grade;
        if(p<=40)
        {
            grade = "Fail";
        }
        else if(p>40 && p<=60)
        {
            grade = "Pass";
        }
        else if(p>60 && p<=80)
        {
            grade = "First Class";
        }
        else
        {
            grade="Distinction";
        }
        pw.println("<h2>The seat number of the student is : " + s1);
        pw.println("<h2>The name of the student is : " + s2);
        pw.println("<h2>The class of the student is : " + s3);
        pw.println("<h2>The total marks of the student are : " + t);
        pw.println("<h2>The percentage of the student is : " + p);
        pw.println("<h2>The grade of the student is : " + grade);
        pw.close();
    }
}
