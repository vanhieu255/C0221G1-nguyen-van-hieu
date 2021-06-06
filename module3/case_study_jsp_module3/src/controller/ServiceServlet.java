package controller;

import model.bean.*;
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
    private List<ServiceType> serviceTypes = serviceService.findAllServiceType();
    private List<ServiceTypeRent> serviceTypeRents = serviceService.findAllServiceTypeRent();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "create":
//                try {
//                    createService(request, response);
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
            default:
                break;
        }
    }

//    private void createService(HttpServletRequest request, HttpServletResponse response) throws SQLException {
//        int idDichVu=Integer.parseInt(request.getParameter("idDichVu"));
//        String tenDichVu=request.getParameter("tenDichVu");
//        int dienTich = Integer.parseInt(request.getParameter("dienTich"));
//        int soTang = Integer.parseInt(request.getParameter("soTang"));
//        String soNguoiToiDa= request.getParameter("soNguoiToiDa");
//        String chiPhiThue= request.getParameter("chiPhiThue");
//        int idKieuThue= Integer.parseInt(request.getParameter("idKieuThue"));
//        int idLoaiDichVu= Integer.parseInt(request.getParameter("idLoaiDichVu"));
//        String trangThai= request.getParameter("trangThai");
//        Service newService = new Service(idDichVu,tenDichVu,dienTich,soTang,soNguoiToiDa,chiPhiThue,idKieuThue,idLoaiDichVu,trangThai);
//        serviceService.save(newService);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/create.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
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

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/service/create.jsp");
        request.setAttribute("serviceTypes",serviceTypes);
        request.setAttribute("serviceTypeRents",serviceTypeRents);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listService(HttpServletRequest request, HttpServletResponse response) {
        List<Service> services = this.serviceService.findAll();
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/service/list.jsp");
        request.setAttribute("servicess", services);
        request.setAttribute("serviceTypes",serviceTypes);
        request.setAttribute("serviceTypeRents",serviceTypeRents);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
