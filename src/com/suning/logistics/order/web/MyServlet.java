 package com.suning.logistics.order.web;

         import java.io.IOException;
  import java.io.PrintWriter;
 import java.security.Principal;
 import java.util.Map;

          import javax.servlet.ServletException;
  import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

         /**
   * Servlet implementation class MyServlet
   */
         public class MyServlet extends HttpServlet {
     private static final long serialVersionUID = 1L;

             /**
       * @see HttpServlet#HttpServlet()
      */
             public MyServlet() {
                 super();
                 // TODO Auto-generated constructor stub
             }

             /**
       * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
       */
             protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                 try{
                     //System.out.println("himily's servlet!");
                     //response.getWriter().write("aaaa");
                     request.setCharacterEncoding("utf-8");
                     response.setContentType("text/html;charset=utf-8");
                    String user = request.getParameter("user");
                    String pswd = request.getParameter("pswd");
                     response.setStatus(200);
                     PrintWriter pw=response.getWriter();
                    pw.write("<html><body><p>登录成功！\n你输入的用户名为："+user+"\n你输入的密码为："+pswd+"</p></body></html>");
                     pw.close();
                     }catch(Exception e){
                         response.getWriter().write(e.toString());
                     }


             }

             /**
       * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
       */
             protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                 // TODO Auto-generated method stub
                 //doGet(request,response);
                 Map<String,String[]> ps = request.getParameterMap();
                 request.setCharacterEncoding("utf-8");
                 response.setContentType("text/html;charset=utf-8");
             //    String user = request.getParameter("user");
             //    String pswd = request.getParameter("pswd");
                 response.setStatus(200);
                 PrintWriter pw=response.getWriter();
                 pw.write("<html><body><p>登录成功！\n你输入的用户名为："+ps.get("user")[0]+"\n你输入的密码为："+ps.get("pswd")[0]+"</p></body></html>");
                 pw.close();
             }


         }