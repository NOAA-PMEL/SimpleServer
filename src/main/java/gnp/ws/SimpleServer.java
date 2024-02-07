package gnp.ws;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.*;
import jakarta.servlet.http.*;


/**
 * Servlet implementation class SimpleServer
 */
public class SimpleServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SimpleServer() {
		System.out.println("SimpleServerlet constructor.");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("SimpleServerlet starting up.");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer msgOut = new StringBuffer().append(new Date())
												.append(" SimpleServerlet getted at: ")
												.append(request.getContextPath())
												.append("\n\t")
												.append(request.getRequestURL());
		String msg = msgOut.toString();
		System.out.println(msg);
		response.getWriter().append(msg);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer msgOut = new StringBuffer().append(new Date())
												.append(" SimpleServerlet posted at: ")
												.append(request.getContextPath())
												.append("\n\t")
												.append(request.getRequestURL());
		String msg = msgOut.toString();
		System.out.println(msg);
		response.getWriter().append(msg);
	}

}
