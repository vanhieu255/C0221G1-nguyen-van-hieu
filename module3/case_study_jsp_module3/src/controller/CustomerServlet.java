package controller;

import model.bean.Customer;
import model.service.CustomerService;
import model.service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns ={"/customers"})
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                try {
                    createCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                searchCustomer(request, response);
                break;
            case "edit":
                try {
                    updateCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

//
//                break;
//            case "delete":
//                deleteCustomer(request, response);
//                break;

            default:
                break;
        }

    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int idKhachHang=Integer.parseInt(request.getParameter("idkhachhang"));
        int idLoaiKhach = Integer.parseInt(request.getParameter("idloaikhach"));
        String hoTen = request.getParameter("hoten");
        String ngaySinh = request.getParameter("ngaysinh");
        String soCmnd = request.getParameter("socmnd");
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("sdt");
        String diaChi = request.getParameter("diachi");

        Customer book = new Customer(idKhachHang,idLoaiKhach,hoTen, ngaySinh,soCmnd,sdt,email,diaChi);
        customerService.updateCutomer(book);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/edit.jsp");
        dispatcher.forward(request, response);
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("key");
        List<Customer> listCustomer = customerService.selectCustomerByName(name);
        request.setAttribute("customers", listCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

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
                    deleteCustomers(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

            default:
                listCustomers(request, response);
                break;
        }

    }

    private void deleteCustomers(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        customerService.deleteCustomer(id);
        List<Customer> listCustomer = customerService.findAll();
        request.setAttribute("customers", listCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showEditForm(HttpServletRequest request, HttpServletResponse response)  {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer existingCustomer = customerService.selectCustomer(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/edit.jsp");
        request.setAttribute("customer", existingCustomer);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int idKhachHang=Integer.parseInt(request.getParameter("idkhachhang"));
        int idLoaiKhach=Integer.parseInt(request.getParameter("idloaikhach"));
        String hoTen = request.getParameter("hoten");
        String ngaySinh= request.getParameter("ngaysinh");
        String soCmnd= request.getParameter("socmnd");
        String sdt= request.getParameter("sdt");
        String email= request.getParameter("email");
        String diaChi= request.getParameter("diachi");
        Customer newCustomer = new Customer(idKhachHang, idLoaiKhach, hoTen,ngaySinh,soCmnd,sdt,email,diaChi);
        customerService.save(newCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/create.jsp");
        dispatcher.forward(request, response);
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customers = this.customerService.findAll();
        request.setAttribute("customers", customers);

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        Customer customer = this.customerService.findById(id);
//        RequestDispatcher dispatcher;
//        if(customer == null){
//            dispatcher = request.getRequestDispatcher("error-404.jsp");
//        } else {
//            this.customerService.remove(id);
//            try {
//                response.sendRedirect("/customers");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//
//    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
//        int id = Integer.parseInt(request.getParameter("id"));
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//        String address = request.getParameter("address");
//        Customer customer = this.customerService.findById(id);
//        RequestDispatcher dispatcher;
//        if(customer == null){
//            dispatcher = request.getRequestDispatcher("error-404.jsp");
//        } else {
////            customer.setName(name);
//            customer.setEmail(email);
////            customer.setAddress(address);
//            this.customerService.update(id, customer);
//            request.setAttribute("customer", customer);
//            request.setAttribute("message", "Customer information was updated");
//            dispatcher = request.getRequestDispatcher("view/customer/edit.jsp");
//        }
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
