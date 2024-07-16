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
import javax.swing.text.Document;



@WebServlet("/delete")
public class Delete extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory e = Persistence.createEntityManagerFactory("student");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();
		
		Student s = new Student();
		int id = Integer.parseInt(req.getParameter("id"));
		
		s = m.find(Student.class, id);
		
		t.begin();
		m.remove(s);
		t.commit();
		
		resp.getWriter().print("<h1>DATA DELETED</h1>");
		
	}
	

}
