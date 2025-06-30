package vn.codegym.demojsp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/30
 * Time: 17:01
 */
@WebServlet(name = "AdminServlet", urlPatterns = "/admin")
public class AdminServlet extends HttpServlet {

    List<Customer> customers;

    @Override
    public void init() throws ServletException {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Hai Anh", "haianh@gmail.com"));
        customers.add(new Customer(2, "Thien", "thien@gmail.com"));
        customers.add(new Customer(3, "Toan", "toan@gmail.com", new Date(1999, 1, 1)));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        RequestDispatcher rd;
        if (username == null || username.equals("") || password == null || password.equals("")) {
            rd = req.getRequestDispatcher("/error.jsp");
            req.setAttribute("error", "Username and password is required!");
        } else if (username.equals("admin") && password.equals("admin")) {
            rd = req.getRequestDispatcher("/dashboard.jsp");
            req.setAttribute("username", username);
            req.setAttribute("customers", customers);
        } else {
            rd = req.getRequestDispatcher("/error.jsp");
            req.setAttribute("error", "Some went wrong!");
        }
        rd.forward(req, resp);
    }
}
