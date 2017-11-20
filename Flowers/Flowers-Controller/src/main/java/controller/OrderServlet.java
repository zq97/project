package controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Address;
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
		String parameter = request.getParameter("type");
		switch (parameter) {
		case "find":
			find(request, response);
			break;
		case "add":
			add(request, response);
			break;
		default:
			break;
		}
	}

	private void add(HttpServletRequest request, HttpServletResponse response) {
		
		int num=(int) ((Math.random()*9+1)*100000);
		String s=String.valueOf(System.currentTimeMillis());
		Order order=new Order();
		order.setOnum(num);
		order.setOtotal(Double.valueOf(request.getParameter("pcost")));
		order.setOstate(1);
		order.setOtime(Timestamp.valueOf(s));
		
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
