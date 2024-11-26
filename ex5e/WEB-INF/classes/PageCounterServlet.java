import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PageCounterServlet extends HttpServlet {
    
    private int visitCount;

    @Override
    public void init() throws ServletException {
        visitCount = 0; 
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        visitCount++; 

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Olympics Visitor Counter</title></head><body>");
        out.println("<h1>Welcome to the Olympics Visitor Tracker!</h1>");
        out.println("<p>The Olympics page has been visited <strong>" + visitCount + "</strong> times.</p>");
        out.println("<p>Thank you for celebrating the Olympic spirit with us!</p>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
       
    }
}
