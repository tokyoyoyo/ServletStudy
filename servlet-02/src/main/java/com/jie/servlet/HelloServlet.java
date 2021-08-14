package com.jie.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //this.getInitParameter();	获取初始化参数
        //this.getServletConfig();	获取Servlet配置
        //this.getServletContext();	获取Servlet上下文
        ServletContext servletContext = this.getServletContext();
        String username = "jie";
        servletContext.setAttribute("username",username);//将一个数据保存到了ServletContext中
        //void setAttribute(String var1, Object var2);
       // resp.getWriter().print("名字"+username);
    }
}
