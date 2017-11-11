package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import repository.UserRepository;
import repository.impl.UserRepositoryImpl;

/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/addUser.do")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserRepository userRepository=new UserRepositoryImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		user.setUname(request.getParameter("uname"));
		user.setUpwd(request.getParameter("upwd"));
		user.setUsex(request.getParameter("usex"));
		user.setUbirthday(Date.valueOf(request.getParameter("ubirthday")));
		user.setUtype(Integer.valueOf(request.getParameter("utype")));
		userRepository.add(user);
		response.sendRedirect("user.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
