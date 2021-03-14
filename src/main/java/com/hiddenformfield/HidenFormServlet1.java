package com.hiddenformfield;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class HidenFormServlet1 extends  HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n=request.getParameter("userName");
            out.print("Welcome "+n);

            //creating form that have invisible textfield
            out.print("<form action='HiddenForm2'>");
            out.print("<input type='hidden' name='uname' value='"+ n +"'>");
            out.print("<input type='submit' value='GoGo'>");
            out.print("</form>");
            out.close();

        }catch(Exception e){System.out.println(e);}
    }
}
