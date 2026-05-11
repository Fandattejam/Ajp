EXP 7

Create index.html

<html>
<head>
    <title>Login Form</title>
</head>
<body>

<form action="login" method="post">
    Username:
    <input type="text" name="user"><br><br>

    Password:
    <input type="password" name="pass"><br><br>

    <input type="submit" value="Login">
</form>

</body>
</html>

LoginServlet.java:
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

2. Web Deployment Descriptor (web.xml)

Inside:

WEB-INF/web.xml

Add:

<web-app>

    <servlet>
        <servlet-name>LoginServlet</servlet-name>
        <servlet-class>LoginServlet</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>LoginServlet</servlet-name>
        <url-pattern>/login</url-pattern>
    </servlet-mapping>

</web-app>
3. Folder Structure

Your project should look like:

ProjectFolder
│
├── index.html
│
└── WEB-INF
    ├── web.xml
    └── classes
        └── LoginServlet.class

 Compilation Command

Inside terminal:

javac -classpath "C:\Tomcat\lib\servlet-api.jar" LoginServlet.java


6. Deploy in Tomcat

Place project folder inside:

Tomcat/webapps/

7. Run in Browser

Start Tomcat and open:

http://localhost:8080/ProjectFolder/index.html