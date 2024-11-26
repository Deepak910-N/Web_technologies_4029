import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class UrlRewritingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        session.setAttribute("athleteName", "OlympicAthlete");
        
        String sessionId = session.getId();
        response.getWriter().println("Session ID: " + sessionId);
        response.getWriter().println("<a href='GetSessionByUrlServlet?id=" + sessionId + "'>Click here to get athlete session details</a>");
    }
}
