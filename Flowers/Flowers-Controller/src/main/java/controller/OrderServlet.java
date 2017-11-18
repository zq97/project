package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Order;
import repository.OrderRepository;
import repository.impl.OrderRepositoryImpl;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/order.do")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	OrderRepository orderRepository = new OrderRepositoryImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parameter = request.getParameter("select");
		switch (parameter) {
		case "find":
			find(request, response);
			break;
		default:
			break;
		}
	}

	private void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Order> list = orderRepository.findAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("orders.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
