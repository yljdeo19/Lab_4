package com.urlrewrite;

import javax.servlet.http.HttpServlet;
import java.io.*;
import javax.servlet.http.*;

public class UrlRewrite1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n=request.getParameter("userName");
            out.print("Welcome "+n);

            //appending the username in the query string
            out.print("<a href='UrlRewrite2?uname="+n+"'> Visit</a>");

            out.close();

        }catch(Exception e){System.out.println(e);}
    }

}
