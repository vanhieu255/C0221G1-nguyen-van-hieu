import com.sun.org.apache.bcel.internal.generic.SimpleElementValueGen;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CustomerServlet" ,urlPatterns = {""})
public class CustomerServlet extends HttpServlet {
    ArrayList<Customer> list=new ArrayList<>();
    @Override
      public void init() throws ServletException{
        list.add(new Customer("Mai Văn Hoàng","1983-08-20","Hà Nội","img/anh2.jpg" ));
        list.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","img/anh3.jpg" ));
        list.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","img/anh4.jpg" ));
        list.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây","img/anh5.jpg" ));
        list.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","img/anh6.jpg" ));
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("Customer1",list);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("index2.jsp");
        requestDispatcher.forward(request,response);
    }
}
