import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/listOfNumbers")
public class ListOfNumbers extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String input = req.getParameter("input");
        int i;

        try {
            i = Integer.parseInt(input);
        }catch (NumberFormatException e){
            resp.getWriter().println("Wrong input");
            return;
        }
        if(i<1){
            resp.getWriter().println("Number is less than 1");

        }else {
            for (int j = 1; j <= i; j++) {
                resp.getWriter().println(j);
            }
        }


    }
}
