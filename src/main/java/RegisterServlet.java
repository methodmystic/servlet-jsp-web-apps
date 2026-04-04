import java.sql.Connection;
import java.sql.DriverManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.io.PrintWriter;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	System.out.println("Control in Register Servlet");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String upassword = request.getParameter("upassword");
        String city = request.getParameter("city");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/registrationapp";
            String user = "root";
            String password = "methodmystic@9906";

            Connection connect = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = connect.prepareStatement(
                "INSERT INTO users(name, email, upassword, city) VALUES (?, ?, ?, ?)"
            );

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, upassword);
            ps.setString(4, city);

            int rowAffected = ps.executeUpdate();

            PrintWriter writer = response.getWriter();

            if (rowAffected != 0) {
                writer.println("<h1>Registration Successful</h1>");
            } else {
                writer.println("<h1>Registration Failed</h1>");
            }

            ps.close();
            connect.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
