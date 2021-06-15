package controller;

import model.bean.Product;
import model.bean.ProductCategory;
import model.service.ProductService;
import model.service.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns ={"/products"})
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();
    private List<ProductCategory> productCategories = productService.findAllProductCategory();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                try {
                    createProduct(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
//            case "search":
//                searchCustomer(request, response);
//                break;
//            case "edit":
//                try {
//                    updateCustomer(request, response);
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//
//                break;


            default:
                break;
        }

    }
        private void createProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String nameProduct = request.getParameter("nameProduct");
        int price = Integer.parseInt(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color= request.getParameter("color");
        String describe= request.getParameter("decribe");
        int category= Integer.parseInt(request.getParameter("idCategory"));

        Product newProduct = new Product(nameProduct,price,quantity,color,describe,category);
        productService.save(newProduct);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/create.jsp");
        request.setAttribute("message","New Product was created");
            request.setAttribute("productCategories", productCategories);
        dispatcher.forward(request, response);
    }

//    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
//        int idKhachHang=Integer.parseInt(request.getParameter("idKhachHang"));
//        int idLoaiKhach = Integer.parseInt(request.getParameter("idLoaiKhach"));
//        String hoTen = request.getParameter("hoTen");
//        String gioiTinh = request.getParameter("gioiTinh");
//        String ngaySinh = request.getParameter("ngaySinh");
//        String soCmnd = request.getParameter("soCmnd");
//        String sdt = request.getParameter("sdt");
//        String email = request.getParameter("email");
//        String diaChi = request.getParameter("diaChi");
//
//        Product book = new Product(idKhachHang,idLoaiKhach,hoTen,gioiTinh, ngaySinh,soCmnd,sdt,email,diaChi);
//        customerService.updateCutomer(book);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("view/edit.jsp");
//        request.setAttribute("message","Customer was Edited");
//        dispatcher.forward(request, response);
//    }
//
//    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) {
//        String name=request.getParameter("key");
//        List<Product> listCustomer = customerService.selectCustomerByName(name);
//        request.setAttribute("customers", listCustomer);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("view/list.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                try {
                    deleteProduct(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

            default:
                listProducts(request, response);
                break;
        }
    }
    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        productService.deleteProduct(id);
        try {
            response.sendRedirect("/products");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private void showEditForm(HttpServletRequest request, HttpServletResponse response)  {
        int id = Integer.parseInt(request.getParameter("id"));
        Product existingCustomer = productService.selectProduct(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/edit.jsp");
        request.setAttribute("product", existingCustomer);
        request.setAttribute("productCategories", productCategories);

        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/create.jsp");
        request.setAttribute("productCategories", productCategories);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        private void listProducts(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = this.productService.findAll();
        request.setAttribute("products", products);
        request.setAttribute("productCategories", productCategories);

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
