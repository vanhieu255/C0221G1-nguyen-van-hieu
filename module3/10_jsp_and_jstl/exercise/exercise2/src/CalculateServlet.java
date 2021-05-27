import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculateServlet",urlPatterns = {"cacul"})
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float number1=Float.parseFloat(request.getParameter("number1"));
        float number2=Float.parseFloat(request.getParameter("number2"));
        String operator=request.getParameter("operator");
        float result=Calculator.calculator(number1,number2,operator);

//        request.setAttribute("result_1",result);
//        request.setAttribute("number1_1",number1);
//        request.setAttribute("number2_1",number2);
        request.setAttribute("operator_1",operator);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("index2.jsp");
        requestDispatcher.forward(request,response);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
