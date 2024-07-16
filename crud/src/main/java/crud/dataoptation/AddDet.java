package crud.dataoptation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/add")
public class AddDet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Student s=new Student();
		 s.setName(req.getParameter("name"));
		 s.setAddress(req.getParameter("address"));
		 s.setGender(req.getParameter("gender"));
		 s.setPer(Double.parseDouble(req.getParameter("per")));
	
		Hiber h1 = new Hiber();

		h1.addDetail(s);

	}

}
