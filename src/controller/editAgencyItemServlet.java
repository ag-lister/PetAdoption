package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Agency;

/**
 * Servlet implementation class editAgencyItemServlet
 */
@WebServlet("/editAgencyItemServlet")
public class editAgencyItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editAgencyItemServlet() {
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
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		
		Agency itemToUpdate = dao.searchForItemById(tempId);
		itemToUpdate.setAgencyName(name);
		itemToUpdate.setAgencyAddress(address);
		itemToUpdate.setAgencyPhone(phone);
		itemToUpdate.setAgencyEmail(email);
		dao.updateItem(itemToUpdate);
		
		getServletContext().getRequestDispatcher("/viewAllAgencyItemsServlet").forward(request, response);
	}

}
