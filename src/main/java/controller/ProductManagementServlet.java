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

@WebServlet(name = "ProductManagement",urlPatterns = "/products")
public class ProductManagementServlet extends javax.servlet.http.HttpServlet {
    ProductManagement productService=new ProductManagement();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action=request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "view":{
                break;
            }
            default:{
                showAllProduct(request,response);
            }
        }
    }



    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action=request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case "view":{
                break;
            }
            default:{
                showAllProduct(request,response);
            }
        }
    }
    private void showAllProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> listProduct=this.productService.findAll();
        request.setAttribute("products",listProduct);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("productList/productList.jsp");

        try {
            requestDispatcher.forward(request,response);
        }
        catch (ServletException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
