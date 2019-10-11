package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Agency;

/**
 * Servlet implementation class navigationServlet
 */
@WebServlet("/agencyNavigationServlet")
public class agencyNavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public agencyNavigationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AgencyHelper dao = new AgencyHelper();
		String act = request.getParameter("doThisToItem");
		
		if (act == null) {
		 //no button has been selected
		getServletContext().getRequestDispatcher("/viewAllAgencyItemsServlet").forward(request, response);
		} else if (act.equals("delete")) {
			try {
			Integer tempId = Integer.parseInt(request.getParameter("id"));
			Agency itemToDelete = dao.searchForItemById(tempId);
			dao.deleteItem(itemToDelete);
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
			} catch (NumberFormatException e) {
				getServletContext().getRequestDispatcher("/viewAllAgencyItemsServlet").forward(request, response);
			}
		} else if (act.equals("edit")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				Agency itemToEdit = dao.searchForItemById(tempId);
				request.setAttribute("itemToEdit", itemToEdit);
				getServletContext().getRequestDispatcher("/editAgencyItem.jsp").forward(request, response);
				 } catch (NumberFormatException e) {
				getServletContext().getRequestDispatcher("/viewAllAgencyItemsServlet").forward(request, response);
				}
		} else if (act.equals("add")) {
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
	}

}
