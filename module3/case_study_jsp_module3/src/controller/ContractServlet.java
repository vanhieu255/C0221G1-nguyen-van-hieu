package controller;

import model.bean.*;
import model.service.ContractService;
import model.service.ContractServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns ={"/contracts"})
public class ContractServlet extends HttpServlet {
    private ContractService contractService=new ContractServiceImpl();
    private List<Customer> customers = contractService.findAllCustomer();
    private List<Employee> employees = contractService.findAllEmployee();
    private List<Service> services= contractService.findAllService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                try {
                    createContract(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }

    }

    private void createContract(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int idHopDong=Integer.parseInt(request.getParameter("idHopDong"));
        int idNhanVien=Integer.parseInt(request.getParameter("idNhanVien"));
        int idKhachHang=Integer.parseInt(request.getParameter("idKhachHang"));
        int idDichVu=Integer.parseInt(request.getParameter("idDichVu"));
        String ngayLamHopDong = request.getParameter("ngayLamHopDong ");
        String ngayKetThuc = request.getParameter("ngayKetThuc");
        int tienDatCoc=Integer.parseInt(request.getParameter("tienDatCoc"));
        int tongTien=Integer.parseInt(request.getParameter("tongTien"));

        Contract newContract = new Contract(idHopDong,idNhanVien,idKhachHang,idDichVu,ngayLamHopDong,ngayKetThuc,tienDatCoc,tongTien);
       contractService.save(newContract);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/contract/create.jsp");
        request.setAttribute("customers",customers);
        request.setAttribute("employees",employees);
        request.setAttribute("services",services);
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


            default:
                listContract(request, response);
                break;
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/contract/create.jsp");
        request.setAttribute("customers",customers);
        request.setAttribute("employees",employees);
        request.setAttribute("services",services);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listContract(HttpServletRequest request, HttpServletResponse response) {
        List<Contract> contracts = this.contractService.findAll();
        request.setAttribute("contracts",contracts);
        request.setAttribute("customers",customers);
        request.setAttribute("employees",employees);
        request.setAttribute("services",services);


        RequestDispatcher dispatcher = request.getRequestDispatcher("view/contract/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
