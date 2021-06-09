package controller;

import model.bean.Contract;
import model.bean.ContractDetail;
import model.bean.ServiceAttach;
import model.service.ContractDetailService;
import model.service.ContractDetailServiceImpl;
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

@WebServlet(name = "ContractDetailServlet", urlPatterns ={"/contractdetails"})
public class ContractDetailServlet extends HttpServlet {
    private ContractDetailService contractDetailService =new ContractDetailServiceImpl();
    private List<Contract> contracts =contractDetailService.findAllContract();
    private List<ServiceAttach> serviceAttaches =contractDetailService.findAllServiceAttach();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                try {
                    createContractDetail(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }

    private void createContractDetail(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int idHopDongChiTiet=Integer.parseInt(request.getParameter("idHopDongChiTiet"));
        int idHopDong=Integer.parseInt(request.getParameter("idHopDong"));
        int idDichVuDiKem=Integer.parseInt(request.getParameter("idDichVuDiKem"));
        int soLuong =Integer.parseInt(request.getParameter("soLuong"));


        ContractDetail newContractDetai = new ContractDetail(idHopDongChiTiet,idHopDong,idDichVuDiKem,soLuong);
        contractDetailService.save(newContractDetai);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/contractdetail/create.jsp");
        request.setAttribute("contracts",contracts);
        request.setAttribute("serviceAttaches",serviceAttaches);
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
                listContractDetail(request, response);
                break;
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/contractdetail/create.jsp");
        request.setAttribute("contracts",contracts);
        request.setAttribute("serviceAttaches",serviceAttaches);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listContractDetail(HttpServletRequest request, HttpServletResponse response) {
        List<ContractDetail> contractDetails = this.contractDetailService.findAll();
        request.setAttribute("contractDetails",contractDetails);
        request.setAttribute("contracts",contracts);
        request.setAttribute("serviceAttaches",serviceAttaches);


        RequestDispatcher dispatcher = request.getRequestDispatcher("view/contractdetail/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
