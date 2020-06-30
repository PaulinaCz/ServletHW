package userlogin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class ServletLogin extends HttpServlet {

    String username = "username";
    String password = "password";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");

        if(name.equals(username) && pwd.equals(password)){
            resp.sendRedirect(req.getContextPath() + "/home");
        }else{
            resp.getWriter().println("Wrong username or password");
        }
    }



}
