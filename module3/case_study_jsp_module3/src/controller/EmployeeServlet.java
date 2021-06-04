package controller;

import model.bean.Customer;
import model.bean.Employee;
import model.service.CustomerService;
import model.service.CustomerServiceImpl;
import model.service.EmployeeService;
import model.service.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

    @WebServlet(name = "EmployeeServlet", urlPatterns ={"/employees"})
public class EmployeeServlet extends HttpServlet {
    private EmployeeService employeeService = new EmployeeServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    createEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                searchEmployee(request, response);
                break;
            case "edit":
                try {
                    updateEmployees(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

        }
    }

        private void updateEmployees(HttpServletRequest request, HttpServletResponse response) throws SQLException {
            int idNhanVien=Integer.parseInt(request.getParameter("idNhanVien"));
            String hoTen = request.getParameter("hoTen");
            int idViTri = Integer.parseInt(request.getParameter("idViTri"));
            int idTrinhDo= Integer.parseInt(request.getParameter("idTrinhDo"));
            int idBoPhan = Integer.parseInt(request.getParameter("idBoPhan"));
            String ngaySinh = request.getParameter("ngaySinh");
            String soCmnd = request.getParameter("soCmnd");
            String luong = request.getParameter("luong");
            String sdt = request.getParameter("sdt");
            String email = request.getParameter("email");
            String diaChi = request.getParameter("diaChi");

            Employee book = new Employee(idNhanVien,hoTen,idViTri,idTrinhDo,idBoPhan,ngaySinh,soCmnd,luong,sdt,email,diaChi);
            employeeService.updateEmployee(book);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/edit.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        private void searchEmployee(HttpServletRequest request, HttpServletResponse response) {
            String name=request.getParameter("key");
            List<Employee> listEmployee = employeeService.selectEmployeeByName(name);
            request.setAttribute("employees", listEmployee);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/list.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void createEmployee(HttpServletRequest request, HttpServletResponse response) throws SQLException {
            int idNhanVien=Integer.parseInt(request.getParameter("idNhanVien"));
            String hoTen = request.getParameter("hoTen");
            int idViTri=Integer.parseInt(request.getParameter("idViTri"));
            int idTrinhDo=Integer.parseInt(request.getParameter("idTrinhDo"));
            int idBoPhan=Integer.parseInt(request.getParameter("idBoPhan"));
            String ngaySinh= request.getParameter("ngaySinh");
            String soCmnd= request.getParameter("soCmnd");
            String luong= request.getParameter("luong");
            String sdt= request.getParameter("sdt");
            String email= request.getParameter("email");
            String diaChi= request.getParameter("diaChi");
            Employee newEmployee = new Employee(idNhanVien,hoTen,idViTri,idTrinhDo,idBoPhan,ngaySinh,soCmnd,luong,sdt,email,diaChi);
            employeeService.save(newEmployee);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/create.jsp");
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
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                try {
                    deleteEmployees(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;

            default:
                listEmployee(request, response);
                break;
        }
    }

        private void deleteEmployees(HttpServletRequest request, HttpServletResponse response) throws SQLException {
            int id = Integer.parseInt(request.getParameter("id"));
            employeeService.deleteEmployee(id);
            List<Employee> employeeList = employeeService.findAll();
            request.setAttribute("employees", employeeList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/list.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
            int id = Integer.parseInt(request.getParameter("id"));
           Employee existingEmployee= employeeService.selectEmployee(id);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/edit.jsp");
            request.setAttribute("employee", existingEmployee);
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/create.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void listEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employees = this.employeeService.findAll();
        request.setAttribute("employees", employees);

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
