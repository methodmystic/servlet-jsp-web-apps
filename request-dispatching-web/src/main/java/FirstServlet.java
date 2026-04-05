
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  System.out.println("Control in first Servlet");
	 String name = request.getParameter("name");
	  String city = request.getParameter("city");
	  RequestDispatcher reqDispatch = request.getRequestDispatcher("/SecondServlet");
	  
	  HttpSession session = request.getSession();	
	  session.setAttribute("name", name);
	  session.setAttribute("city", city);
	  reqDispatch.forward(request, response);
	 
	 PrintWriter writer = response.getWriter();
	 writer.println("<h1>Response from first Servlet</h1>");
	 writer.close();
	}

}
