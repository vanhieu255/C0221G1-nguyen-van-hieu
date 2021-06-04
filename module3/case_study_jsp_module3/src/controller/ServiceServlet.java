package controller;

import model.bean.Customer;
import model.bean.Service;
import model.service.CustomerService;
import model.service.CustomerServiceImpl;
import model.service.ServiceService;
import model.service.ServiceServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns ={"/services"})
public class ServiceServlet extends HttpServlet {
    private ServiceService serviceService= new ServiceServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "create":
//                try {
//                    createCustomer(request, response);
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//                break;
//            case "search":
//                searchCustomer(request, response);
//                break;
//            case "edit":
//                try {
//                    updateCustomer(request, response);
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
//            case "create":
////                showCreateForm(request, response);
////                break;
////            case "edit":
////                showEditForm(request, response);
////                break;
////            case "delete":
////                try {
////                    deleteCustomers(request, response);
////                } catch (SQLException e) {
////                    e.printStackTrace();
////                }
////                break;

            default:
                listService(request, response);
                break;
        }

    }

    private void listService(HttpServletRequest request, HttpServletResponse response) {
        List<Service> services = this.serviceService.findAll();
        request.setAttribute("servicess", services);

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/service/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
