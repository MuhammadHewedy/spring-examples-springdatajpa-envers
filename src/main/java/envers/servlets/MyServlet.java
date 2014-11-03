package envers.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import envers.service.TVSetService;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(getServletContext());

		TVSetService tvSetService = context.getBean("tvSetService",
				TVSetService.class);

		String id = request.getParameter("id");
		if (id == null) {
			tvSetService.addTVSet();
		} else {
			long _id = Long.parseLong(id);
			tvSetService.updateTVSet(_id);
		}

	}

}
