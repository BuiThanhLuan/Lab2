package com.example.Lab2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

public class Add extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<title>Math</title>");
        int result;
        int num1 = parseInt(req.getParameter("num1"));
        int num2 = parseInt(req.getParameter("num2"));
        result = num1+num2;
        writer.println("Kết quả: " + result);
    }
}
