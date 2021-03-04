package com.example.Lab2;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.print("Welcome "+req.getParameter("userName"));
    }
}
