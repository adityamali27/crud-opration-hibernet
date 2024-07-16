package crud.dataoptation;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class Update extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		int id =  Integer.parseInt(req.getParameter("id"));
		
		String add= req.getParameter("address");
		
		Hiber h1  = new Hiber();
		
		h1.update(id, add);
		
		resp.getWriter().print("<h1> Data updated </h1>");		

		
		
	}
	
}
