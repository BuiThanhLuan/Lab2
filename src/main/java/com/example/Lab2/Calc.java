package com.example.Lab2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;

public class Calc extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<title>Calc</title>");
        double num1 = parseInt(req.getParameter("num1"));
        double num2 = parseInt(req.getParameter("num2"));
        String operator = req.getParameter("operator");
        double result = 0;
        if(operator.equals("/") && num2 == 0) {
            writer.println("Không xác định");
        }else {
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            writer.println("Kết quả: " + result);
        }
    }
}
