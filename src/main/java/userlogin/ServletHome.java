package userlogin;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/hello {username}")
public class ServletHome extends HttpServlet {
}
