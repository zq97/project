package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.CarRepository;
import repository.impl.CarRepositoryImpl;

/**
 * Servlet implementation class deleteCarServlet
 */
@WebServlet("/deleteCar.do")
public class DeleteCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CarRepository carRepository=new CarRepositoryImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		carRepository.delete(Integer.valueOf(request.getParameter("id")));
		response.sendRedirect("selectCar.do");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
