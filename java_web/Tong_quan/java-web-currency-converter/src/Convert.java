import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( urlPatterns = "/convert")
public class Convert extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           int rate = Integer.parseInt(request.getParameter("rate")) ;
           int usd = Integer.parseInt(request.getParameter("usd")) ;
           int vnd = rate*usd ;
        PrintWriter writer = response.getWriter() ;
        writer.println("<h1>Rate : " + rate);
        writer.println("<h1>Usd : " + usd);
        writer.println("<h1>VND : " + vnd);
    }
}
