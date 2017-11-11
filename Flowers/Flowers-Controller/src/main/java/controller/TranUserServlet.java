package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import repository.UserRepository;
import repository.impl.UserRepositoryImpl;

/**
 * Servlet implementation class TranUserServlet
 */
@WebServlet("/TranUserServlet")
public class TranUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserRepository userRepository=new UserRepositoryImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TranUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=userRepository.findById(Integer.valueOf(request.getParameter("uid")));
		request.setAttribute("user",user);
		request.getRequestDispatcher("update.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
