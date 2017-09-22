package dbAccess;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dbAccess.DBConnection;

/**
 * Servlet implementation class LoginCheck
 */

public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBConnection newConnection;   
    /**
     * @see HttpServlet#HttpServlet()
     */
	//private RequestDispatcher jsp;
    public LoginCheck() {
        //super();
        // TODO Auto-generated constructor stub
    }
    /*public void init(ServletConfig config) throws ServletException
    {
        ServletContext context = config.getServletContext();
        jsp = context.getRequestDispatcher("/WEB-INF/Login.jsp");
    }*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String passwrd = request.getParameter("passwrd");
		try {
			newConnection = new DBConnection();
			try {
				boolean result = newConnection.searchUser(username, passwrd);
				if (result == true) {
					response.sendRedirect("cardetails.jsp");
				}
				else{
					response.sendRedirect("error.jsp");
				}
			}
			catch (SQLException e)
			{ 
				e.printStackTrace();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
