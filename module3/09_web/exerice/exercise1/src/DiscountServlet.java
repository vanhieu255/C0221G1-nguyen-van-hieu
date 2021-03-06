import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet" ,urlPatterns ={ "/discount"})
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String productDescription=request.getParameter("Product Description");
        float listPrice=Float.parseFloat(request.getParameter("List Price"));
        float discountPercent=Float.parseFloat(request.getParameter("Discount Percent"));

        float discountAmount = (float) (listPrice * discountPercent* 0.01);
        float discountPrice =listPrice -discountAmount;


        request.setAttribute("DiscountAmount",discountAmount);
        request.setAttribute("DiscountPrice",discountPrice);
        request.setAttribute("ProductDescription",productDescription);
        request.setAttribute("ListPrice",listPrice);
        request.setAttribute("DiscountPercent",discountPercent);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("index2.jsp");
        requestDispatcher.forward(request,response);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }
}
