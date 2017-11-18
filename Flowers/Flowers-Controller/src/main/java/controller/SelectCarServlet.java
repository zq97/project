package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Car;
import repository.CarRepository;
import repository.impl.CarRepositoryImpl;

/**
 * Servlet implementation class SelectCarServlet
 */
@WebServlet("/selectCar.do")
public class SelectCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CarRepository carRepository=new CarRepositoryImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Car car=new Car();
//		car.getProduct().getPname();
//		car.getProduct().getPcost();
//		car.getNum();
//		request.setAttribute("car", car);
//		request.getRequestDispatcher("car.jsp").forward(request, response);
		List<Car> findAll = carRepository.findAll();
		request.setAttribute("car", findAll);
		request.getRequestDispatcher("car.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
