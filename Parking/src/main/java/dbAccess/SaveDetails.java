package dbAccess;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String car_number = (String) request.getParameter("car_number");
		String parking_area = (String) request.getParameter("parking_area");
		String time = (String) request.getParameter("time");
		String cost = (String) request.getParameter("cost");
		
		System.out.println(car_number+"save car");
		System.out.println(parking_area+"save parking_area");
		System.out.println(time+"save time");
		System.out.println(cost+"save cost");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Parking Details</h1>");
		out.println("<div>Car No : "+car_number+"</div>");
		out.println("<div>Parking Area : "+parking_area+"</div>");
		out.println("<div>Time : "+time+"</div>");
		out.println("<div>Cost : "+cost+"</div>");
		out.println("<div>Current Time : "+new Date()+"</div>");
		out.println("</body></html>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String car_number = (String) request.getParameter("car_number");
		String parking_area = (String) request.getParameter("parking_area");
		String time = (String) request.getParameter("time");
		String cost = (String) request.getParameter("cost");
		
		System.out.println(car_number+"save car");
		System.out.println(parking_area+"save parking_area");
		System.out.println(time+"save time");
		System.out.println(cost+"save cost");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Parking Details</h1>");
		out.println("<div>Car No : "+car_number+"</div>");
		out.println("<div>Parking Area : "+parking_area+"</div>");
		out.println("<div>Time : "+time+"</div>");
		out.println("<div>Cost : "+cost+"</div>");
		out.println("<div>Current Time : "+new Date()+"</div>");
		out.println("</body></html>");
	/*	RequestDispatcher view = request.getRequestDispatcher("html/mypage.html");
		view.forward(request, response);*/
		
	}

}
