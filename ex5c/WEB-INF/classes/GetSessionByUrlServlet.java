import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class GetSessionByUrlServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sessionId = request.getParameter("id");
        
        if (sessionId != null) {
            HttpSession session = request.getSession(false);
            String athleteName = (String) session.getAttribute("athleteName");
            response.getWriter().println("Athlete Name from session: " + athleteName);
        } else {
            response.getWriter().println("No session found for athlete");
        }
    }
}
