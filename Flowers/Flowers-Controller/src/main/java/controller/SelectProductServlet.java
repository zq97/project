package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Product;
import repository.ProductRepository;
import repository.impl.ProductRepositoryImpl;

/**
 * Servlet implementation class SelectProductServlet
 */
@WebServlet("/selectProduct.do")
public class SelectProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductRepository productRepository=new ProductRepositoryImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		List<Product> findBypname = productRepository.findBypname(name);
		request.setAttribute("list", findBypname);
		switch (name) {
		case "玫瑰":
			request.getRequestDispatcher("product.jsp").forward(request, response);
			break;
		case "百合":
			request.getRequestDispatcher("car.jsp").forward(request, response);
			break;

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
