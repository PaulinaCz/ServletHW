package userlogin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/home")
public class ServletHome extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object sessionAttribute = session.getAttribute("name");

        if(sessionAttribute == null){
            resp.getWriter().println("Content available only for logged in users");
        }else {
            resp.getWriter().println("Hello " + sessionAttribute + "!");
        }

    }

}
