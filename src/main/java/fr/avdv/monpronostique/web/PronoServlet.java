package fr.avdv.monpronostique.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PronoServlet extends HttpServlet {

	/**
	 * serialize deserialize à régler plus tard
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final PrintWriter writer = resp.getWriter();
		//corps de la réponse HTTP
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>Hello World</h1>");
		writer.append("</body>");
		writer.append("</html>");
		writer.flush();//vide le buffer
	}

}
