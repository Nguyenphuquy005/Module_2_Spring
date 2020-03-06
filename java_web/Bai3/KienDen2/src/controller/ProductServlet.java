package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImplement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/products")
public class ProductServlet extends javax.servlet.http.HttpServlet {

    private ProductService productService = new ProductServiceImplement();


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);

                break;
            case "edit":

                break;
            case "delete":

                break;
            case "search":

                break;
            default:
                break;
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = (int) (Math.random() * 100000);
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String desc = request.getParameter("description");
        String supplier = request.getParameter("suppliers");
        Product product = new Product(id, name, price, desc, supplier);
        this.productService.save(product);
        RequestDispatcher rp = request.getRequestDispatcher("view_product/create.jsp");
        request.setAttribute("message", "New Product Was Created");
        rp.forward(request, response);
    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
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



    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rp = request.getRequestDispatcher("view_product/create.jsp");
        rp.forward(request, response);
    }

    private void displayListProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = this.productService.findAll();
        request.setAttribute("products", products);
        RequestDispatcher rp = request.getRequestDispatcher("view_product/displayListProduct.jsp");
        rp.forward(request, response);
    }
}


