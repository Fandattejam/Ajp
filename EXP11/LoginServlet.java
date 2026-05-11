import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        response.setContentType("text/html");

        if(user.equals("admin") && pass.equals("1234")) {

            // 1. SESSION
            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            // 2. COOKIE
            Cookie ck = new Cookie("username", user);
            response.addCookie(ck);

            // 3. URL REWRITING
            response.sendRedirect("welcome.jsp?user=" + user);

        } else {
            PrintWriter out = response.getWriter();
            out.println("Invalid Login!");
        }
    }
}