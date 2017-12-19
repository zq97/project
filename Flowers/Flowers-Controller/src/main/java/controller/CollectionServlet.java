package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Collection;
import domain.Product;
import domain.User;
import repository.CollectionRepository;
import repository.impl.CollectionRepositoryImpl;

/**
 * Servlet implementation class CollectionServlet
 */
@WebServlet("/collection.do")
public class CollectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CollectionRepository collectionRepository=new CollectionRepositoryImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollectionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("type");
		switch (parameter) {
		case "find":
			find(request, response);
			break;
		case "add":
			add(request, response);
			break;
		case "del":
			del(request, response);
			break;
		default:
			break;
		}
	}

	private void del(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product=new Product();
		product.setPid(Integer.valueOf(request.getParameter("pid")));
		User user=new User();
		user.setUid(Integer.valueOf(request.getParameter("uid")));
		Collection collection=new Collection();
		collection.setProduct(product);
		collection.setUser(user);
		collectionRepository.add(user, product);
		response.sendRedirect("showAllProduct.do?type=all");
//		request.getRequestDispatcher("showAllProduct.do?type=all").forward(request, response);
		
	}

	private void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		List<Collection> list=collectionRepository.findAll(uname);
		request.setAttribute("list", list);
		request.getRequestDispatcher("collections.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
