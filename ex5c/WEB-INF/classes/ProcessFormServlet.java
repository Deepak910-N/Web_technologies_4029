import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class ProcessFormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String athleteName = request.getParameter("athleteName");
        response.getWriter().println("Athlete name received from hidden form field: " + athleteName);
    }
}
