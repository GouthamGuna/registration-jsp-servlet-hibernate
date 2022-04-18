package learn.ggs.jsp.servlet.java.hibernate.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import learn.ggs.jsp.servlet.java.hibernate.dao.UserDao;
import learn.ggs.jsp.servlet.java.hibernate.model.User;

@WebServlet("/")
public class UserController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserDao userDao;
	
	public void init() {
		userDao = new UserDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		register(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("register.jsp");
	}
	
	private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String rollno = request.getParameter("rollno");
		String mailId = request.getParameter("mailId");
		String phoneno = request.getParameter("phoneno");
		String studingyear = request.getParameter("studingyear");
		String passoutyear = request.getParameter("passoutyear");
		String address = request.getParameter("address");

		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setRollno(rollno);
		user.setMailId(mailId);
		user.setPhoneno(phoneno);
		user.setStudingyear(studingyear);
		user.setPassoutyear(passoutyear);
		user.setAddress(address);

		userDao.saveUser(user);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("register-success.jsp");
		dispatcher.forward(request, response);
	}
}
