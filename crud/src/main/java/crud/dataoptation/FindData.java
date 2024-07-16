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

@WebServlet("/finddata")
public class FindData extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		EntityManagerFactory e = Persistence.createEntityManagerFactory("student");
		EntityManager m = e.createEntityManager();
		EntityTransaction t = m.getTransaction();
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		Student s  = m.find(Student.class, id);
		
		
		
		
		
		
		resp.getWriter().print("<h1>Student ID : " +s.getSid()+"</h1>");
		resp.getWriter().print("<h1>Student Name : " +s.getName()+"</h1>");
		resp.getWriter().print("<h1>Student Address : " +s.getAddress()+"</h1>");
		resp.getWriter().print("<h1>Student Gender : " +s.getGender()+"</h1>");
		resp.getWriter().print("<h1>Student Persanteg" +s.getPer()+"</h1>");
		
	
	}
	
	

}
