package dbAccess;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Feecalc
 */
public class Feecalc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Feecalc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double time = 0;
		double totalAmount = 0;
		double baseRate = 1.5;
		if(request.getParameter("time") != null) {
		time = Double.valueOf(request.getParameter("time"));
		String.valueOf(request.getParameter("car_number"));
		
		//System.out.println(time+"   --time");
		totalAmount= (time/60) * baseRate;
		//System.out.println(totalAmount+"   --totalAmount");
		}
		//System.out.println(totalAmount+"   -++++-totalAmount");
		response.getWriter().append(totalAmount+"");
	   
	   
	    
	    
		//request.setAttribute("time_limt",totalAmount);
			//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		//doGet(request, response);
		
		
		
		
	}

}
