import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie athleteCookie = new Cookie("athleteName", "OlympicAthlete");
        athleteCookie.setMaxAge(60 * 60); // Expires in 1 hour
        response.addCookie(athleteCookie);
        
        response.getWriter().println("Athlete cookie set successfully!");
    }
}
