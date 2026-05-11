import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String user = req.getParameter("user");
        String pass = req.getParameter("pass");

        out.println("<h2>Welcome " + user + "</h2>");
        out.println("<h3>Password: " + pass + "</h3>");
    }
}