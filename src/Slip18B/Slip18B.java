import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class Slip18B extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.print("<br> User Name : " + req.getRemoteHost());
        pw.print("<br> Port Number : " + req.getServerPort());
        pw.print("<br> Path : " + req.getPathInfo());
        pw.print("<br> Remote Address : " + req.getRemoteAddr());
        pw.print("<br> Method : " + req.getMethod());
        pw.print("<br> Protocol : " + req.getProtocol());
    }
}
