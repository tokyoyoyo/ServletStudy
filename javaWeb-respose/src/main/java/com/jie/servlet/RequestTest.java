package com.jie.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestTest extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

//        System.out.println(username + ":"+password);

        if ( username.equals("w") &&  password.equals("123")){
            System.out.println("验证成功");
            resp.sendRedirect("/jw/success.jsp");
        }else{
            System.out.println("验证失败");
            resp.sendRedirect("/jw/fall.jsp");
        }
    }
}
