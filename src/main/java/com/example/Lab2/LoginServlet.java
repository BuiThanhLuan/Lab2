package com.example.Lab2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("userName");
        String password = req.getParameter("userPass");

        if (name.equals("java") && password.equals("java")) {
            RequestDispatcher rd = req.getRequestDispatcher("user");
            rd.forward(req, resp);
        } else {
            out.println("Sorry UserName or Password Error!");
            ServletContext context = getServletContext();
            String phone = context.getInitParameter("phone");
            String email = context.getInitParameter("email");
            out.println(", Contact phone/ email: " + phone + "/ " + email);
            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            rd.include(req, resp);
        }
    }
}
