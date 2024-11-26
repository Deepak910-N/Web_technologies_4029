import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class FormServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<form method='post' action='ProcessFormServlet'>");
        response.getWriter().println("<input type='hidden' name='athleteName' value='OlympicAthlete'>");
        response.getWriter().println("<input type='submit' value='Submit'>");
        response.getWriter().println("</form>");
    }
}
