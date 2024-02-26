import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Slip21B extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String val = req.getParameter("val");
        Cookie c = new Cookie("hobby",val);
        res.addCookie(c);
        String value = c.getValue();
        pw.println("<h2>The selected hobby is : " + value  );
    }
}
