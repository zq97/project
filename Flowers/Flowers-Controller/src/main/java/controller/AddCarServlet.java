package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Car;
import domain.Product;
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
		Car car=new Car();
		car.setNum(Integer.valueOf(request.getParameter("num")));
		Product product=new Product();
		product.setPid(Integer.valueOf(request.getParameter("pid")));
		car.setProduct(product);
		carRepository.add(car); 

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
