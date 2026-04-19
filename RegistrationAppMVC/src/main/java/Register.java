import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Register")
public class Register extends HttpServlet {
	
    @Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
	  String email = request.getParameter("email");
		String upassword = request.getParameter("upassword");
		String city = request.getParameter("city");
		
		Model model = new Model();
		model.setName(name);
		model.setEmail(email);
		model.setUpassword(upassword);
		model.setCity(city);
		
		int row = model.register();
		
		HttpSession session = request.getSession();
		
		session.setAttribute("name",name);
		session.setAttribute("email",email);
		 session.setAttribute("upassword",upassword);
		 session.setAttribute("city",city);
		 System.out.println(name + " " + email + " " + upassword + " " + city);
		if(row == 0)
		{
			response.sendRedirect("/RegistrationAppMVC/failure.jsp");
		}
		else
		{
			response.sendRedirect("/RegistrationAppMVC/Success.jsp");
		}
	    
	}

}
