package controller;

import model.Product;
import services.ProductServiceImplement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet" ,urlPatterns = "product")
public class ProductServlet extends HttpServlet {
    private ProductServiceImplement ProductServices = new ProductServiceImplement();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          String action  = request.getParameter("action") ;
          if(action == null){
              action = "" ;
          }
              switch (action) {
                  case "create":
                      break;
                  case "edit":

                      break;
                  case "delete":
                      break;
                  case "view":
                      break;
                  case "search":
                      break;
                  default:
                      displayListProduct(request, response);
                      break;
          }
    }

    private void displayListProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = this.ProductServices.findAll();
        request.setAttribute("products",products);
        RequestDispatcher rp = request.getRequestDispatcher("view_product/displayListProduct.jsp") ;
        rp.forward(request,response);
    }
}
