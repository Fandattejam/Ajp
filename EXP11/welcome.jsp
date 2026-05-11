<%@ page import="javax.servlet.http.*" %>

<html>
<body>

<h2>Welcome Page</h2>

<%
    // SESSION
    HttpSession session1 = request.getSession(false);
    String user1 = (String) session1.getAttribute("user");
    out.println("Session User: " + user1 + "<br>");

    // COOKIE
    Cookie[] cookies = request.getCookies();
    if(cookies != null) {
        for(Cookie c : cookies) {
            if(c.getName().equals("username")) {
                out.println("Cookie User: " + c.getValue() + "<br>");
            }
        }
    }

    // URL REWRITING
    String user2 = request.getParameter("user");
    out.println("URL User: " + user2 + "<br>");
%>

<a href="logout">Logout</a>

</body>
</html>