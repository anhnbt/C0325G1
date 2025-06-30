package vn.codegym.webservletdemolifecycle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@WebServlet(name = "HeaderInfoServlet", urlPatterns = "/info")
public class HeaderInfoServlet extends HttpServlet {

    List<String> contacts = new ArrayList<>();


    @Override
    public void init() throws ServletException {
        // Doc du lieu tu file CSV
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h2>Thông tin Header:</h2>");
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            out.println(header + ": " + request.getHeader(header) + "<br>");
        }
        out.println("<hr>");
        String classes = request.getParameter("classes");
        if (classes == null) {
            out.println("404");
        } else {
            out.println("Lop hoc: " + classes);
            switch (classes) {
                case "C0325G1":
                    contacts.add("Thien");
                    contacts.add("Yen Nhi");
                    contacts.add("An");
                    contacts.add("Hai Anh");
                    contacts.add("Toan");
                    for (String student : contacts) {
                        out.println(student + "<br>");
                    }
                    break;
            }
        }
    }
}