package de.schoenfinkeln.onlineshop;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import de.schoenfinkeln.onlineshop.model.Customer;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setStatus(HttpServletResponse.SC_ACCEPTED);
		
		final HttpSession session = request.getSession();
		final String email = request.getParameter("email");
		final String password = request.getParameter("password");
		final Customer customer = new Customer();
		customer.setEmail(email);
		customer.setPassword(password);
		
		final Cookie customer_email = new Cookie("email", email);
		response.addCookie(customer_email);
		final Cookie customer_password = new Cookie("password", password);
		response.addCookie(customer_password);
		
		// session.setAttribute("customer", customer);
		
		final RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
		dispatcher.forward(request, response);
//		
//		
//		final PrintWriter out = response.getWriter();
//		
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<br>Ihre eingegeben Daten");
//		out.println("<br>E-Mail: " + email);
//		out.println("<br>Password: " + password);
//		out.println("</body>");
//		out.println("</html>");
	}

}
