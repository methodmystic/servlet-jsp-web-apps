import java.io.PrintWriter;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Control in second Servlet");
		HttpSession session = request.getSession(false);
		String name = (String) session.getAttribute("name");
		String city = (String) session.getAttribute("city");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>response from second Servlet</h1>" + "<h1>" + name + "<h1/>" + "<h1>" + city + "<h1/>");
		writer.close();
	}

}

