ackage com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/test")
public class TestServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
        //out.print("<h4>In test servlet</h4>");
		//response.sendRedirect("http://google.com");
		Enumeration<String> names=request.getHeaderNames();
		while(names.hasMoreElements()) {
			String s=names.nextElement();
			out.println(s+"---->"+request.getHeader(s)+"<br>");
		}
		
		response.setStatus(200);
		response.setHeader("refresh","10;URL=http://google.com");
		Date d=new Date();
		out.println(d);
		
		
	 }

}
