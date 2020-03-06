import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "caculation" ,urlPatterns = "/caculation")
public class caculation extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           String decription = request.getParameter("decription") ;
           float price = Float.parseFloat(request.getParameter("price")) ;
        float discount = Float.parseFloat(request.getParameter("discount")) ;
        float amount = price*discount /10 ;
        PrintWriter writer = response.getWriter() ;
        writer.println("<html>");
        writer.println("<fieldset>");
        writer.println(" <label>Product Description:</label>");
        writer.println("<h3>Product: "+ decription);
        writer.println("<h3>Price: "+ price);
        writer.println("<h3>Discount: "+ discount);
        writer.println("<h3>Amount: "+ amount);
        writer.println("</fieldset>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
