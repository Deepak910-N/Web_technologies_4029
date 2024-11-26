import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class GetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String athleteName = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("athleteName".equals(cookie.getName())) {
                    athleteName = cookie.getValue();
                    break;
                }
            }
        }
        
        if (athleteName != null) {
            response.getWriter().println("Athlete Name from cookie: " + athleteName);
        } else {
            response.getWriter().println("No cookie found for athlete");
        }
    }
}
