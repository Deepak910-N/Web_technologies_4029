import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OlympicsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Olympic Events</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome to Olympic Event Details</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Event Name</th><th>Venue</th><th>Participants</th></tr>");
        out.println("<tr><td>100m Sprint</td><td>Olympic Stadium</td><td>8</td></tr>");
        out.println("<tr><td>Swimming - 200m Freestyle</td><td>Aquatics Center</td><td>16</td></tr>");
        out.println("<tr><td>Gymnastics - Team Final</td><td>Gymnastics Arena</td><td>12</td></tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
