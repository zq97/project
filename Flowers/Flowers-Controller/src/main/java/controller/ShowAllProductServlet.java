package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Product;
import repository.ProductRepository;
import repository.impl.ProductRepositoryImpl;

/**
 * Servlet implementation class ShowAllProductServlet
 */
@WebServlet("/showAllProduct.do")
public class ShowAllProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductRepository productRepository = new ProductRepositoryImpl();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowAllProductServlet() {
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
		case "a":
			findAll(request, response);
			break;
		case "b":
			find(request, response);
			break;
		default:
			break;
		}
	}

	private void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> list = productRepository.find();
		request.setAttribute("list", list);
		request.getRequestDispatcher("product1.jsp").forward(request, response);

	}

	private void findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Product> list = productRepository.findAll();
		request.setAttribute("p", list);
		request.getRequestDispatcher("product.jsp").forward(request, response);

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
