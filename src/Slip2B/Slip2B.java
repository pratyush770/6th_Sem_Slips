import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Slip2B extends HttpServlet
{
    static int i=1;
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String c = String.valueOf(i);
        Cookie cookie = new Cookie("visit",c);
        res.addCookie(cookie);
        int j = Integer.parseInt(cookie.getValue());
        if(j==1)
        {
            pw.println("Welcome to web page");
        }
        else
        {
            pw.println("You visited the web page " + j + " times");
        }
        i++;
    }
}
