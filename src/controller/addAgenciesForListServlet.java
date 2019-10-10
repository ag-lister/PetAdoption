package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addAgenciesForListServlet
 */
@WebServlet("/addAgenciesForListServlet")
public class addAgenciesForListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addAgenciesForListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request,
    		HttpServletResponse response) throws ServletException,
    		IOException {
    		// TODO Auto-generated method stub
    		AgencyHelper ah = new AgencyHelper();
    		request.setAttribute("allItems", ah.showAllItems());
    		if(ah.showAllItems().isEmpty()){
    		request.setAttribute("allItems", " ");
    		}
    		getServletContext().getRequestDispatcher("/newlist.jsp").forward(request, response);
    		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
