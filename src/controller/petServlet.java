package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Agency;
import model.Pet;


/**
 * Servlet implementation class petServlet
 */
@WebServlet("/petServlet")
public class petServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public petServlet() {
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
		// TODO Auto-generated method stub
		AgencyHelper ah = new AgencyHelper();
		Agency a = new Agency();
		String species = request.getParameter("species");
		String breed = request.getParameter("breed");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");
		LocalDate ld;
		try {
			ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		} catch (NumberFormatException ex) {
			ld = LocalDate.now();
		}
		String agencyName = request.getParameter("agencyName");
		a.getAgencyID();
		Pet p = new Pet(species.toUpperCase(), breed.toUpperCase(), name.toUpperCase(), age, ld);
		petHelper ph = new petHelper();
		ph.insertPet(p);
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
