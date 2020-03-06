import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter() ;
        String username = request.getParameter("username") ;
        String password = request.getParameter("password") ;
        if ( username.equals("adim") && password.equals("admin")  ) {
            writer.println("<h1>ok fen</h1>");
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp") ;
            rd.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter writer = response.getWriter() ;
//        String username = request.getParameter("username") ;
//        String password = request.getParameter("password") ;
//        if ( username.equals("adim") && password.equals("admin")  ) {
//            writer.println("<h1>ok fen</h1>");
//        } else {
//            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp") ;
//            rd.forward(request,response);
//        }
 }
}
