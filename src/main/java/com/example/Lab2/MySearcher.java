package com.example.Lab2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MySearcher extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("keyword");
        String search_engine = getServletConfig().getInitParameter("search_engine");
//        resp.sendRedirect("https://www.google.com/search?q=" + name);
        resp.sendRedirect(search_engine + name);
    }
}