import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class GetSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            String athleteName = (String) session.getAttribute("athleteName");
            response.getWriter().println("Athlete Name from session: " + athleteName);
        } else {
            response.getWriter().println("No session found for athlete");
        }
    }
}
