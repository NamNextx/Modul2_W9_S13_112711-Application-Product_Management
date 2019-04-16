package controller;

import model.Product;
import service.ProductManagement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductManagement", urlPatterns = "/products")
public class ProductManagementServlet extends javax.servlet.http.HttpServlet {
    ProductManagement productService = new ProductManagement();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "view": {
                break;
            }
            case "create":{
                createProduct(request,response);
                break;
            }

            default: {
                showAllProduct(request, response);
                break;
            }
        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "view": {
                break;
            }
            case "create": {
                showCreateProduct(request,response);
                break;
            }
            case "edit":{
                showEditProduct(request,response);
                break;
            }
            default: {
                showAllProduct(request, response);
                break;
            }
        }
    }

    private void showEditProduct(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        RequestDispatcher requestDispatcher;
        Product product=productService.findByID(id);
        if (product==null){
            request.setAttribute("message","Done have that id");
            requestDispatcher=request.getRequestDispatcher("error-404.jsp");
        }
        else {
            request.setAttribute("product",product);
            requestDispatcher=request.getRequestDispatcher("productList/edit.jsp");
        }
        try {
            requestDispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {

        int id=Integer.parseInt(request.getParameter("id"));
        Product product=productService.findByID(id);

        if (product==null){
            String nameProduct=request.getParameter("name");
            int priceProduct=Integer.parseInt(request.getParameter("price"));
            String descripntionProduct=request.getParameter("description");
            String supplierProduct=request.getParameter("supplier");

            Product product1=new Product(id,nameProduct,priceProduct,descripntionProduct,supplierProduct);
            productService.save(product1);

            request.setAttribute("message"," Done");
        }
        else {
            request.setAttribute("message","Customer already");
        }

        RequestDispatcher requestDispatcher =request.getRequestDispatcher("productList/createProduct.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showCreateProduct(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher =request.getRequestDispatcher("productList/createProduct.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAllProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> listProduct = this.productService.findAll();
        request.setAttribute("products", listProduct);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("productList/productList.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
