package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Car;
import domain.Product;
import domain.User;
import repository.CarRepository;
import repository.ProductRepository;
import repository.impl.CarRepositoryImpl;
import repository.impl.ProductRepositoryImpl;

/**
 * Servlet implementation class AddCarServlet
 */
@WebServlet("/addCar.do")
public class AddCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CarRepository carRepository=new CarRepositoryImpl();
	private ProductRepository productRepository=new ProductRepositoryImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("addcar.............................");
		Product product=new Product();
		System.out.println(request.getParameter("pid"));
//		product.getPid(Integer.valueOf(request.getParameter("pid")));
		product.setPid(Integer.valueOf(request.getParameter("pid")));
//		User user=new User();
//		user.setUid(Integer.valueOf(request.getParameter("uid")));
		Car car=new Car();
		car.setNum(Integer.valueOf(1));
		car.setProduct(product);
//		car.setUser(user);
		System.out.println(car);
		carRepository.add(car); 
		response.sendRedirect("product.jsp");

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
