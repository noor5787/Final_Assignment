import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Set the content type and get the writer
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Read the user's name from the request parameter
		String name = request.getParameter("name");

		// Generate the welcome message
		String message = "Welcome, " + name + "!";

		// Write the HTML response
		out.println("<html>");
		out.println("<head><title>Welcome</title></head>");
		out.println("<body>");
		out.println("<h1>" + message + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
