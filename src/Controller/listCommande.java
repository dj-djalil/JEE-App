package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CommandeDAO;
import DAO.CommandeDAOImp;
import Model.Commande;

/**
 * Servlet implementation class listCommande
 */
@WebServlet("/list")
public class listCommande extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CommandeDAO commandeDAO = new CommandeDAOImp();
		ArrayList<Commande> listCommande = commandeDAO.getCommandes();
		request.setAttribute("listCommande", listCommande);
		System.out.println("servlet");
		request.getRequestDispatcher("WEB-INF/view/commandeTable.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CommandeDAO commandeDAO = new CommandeDAOImp();
		ArrayList<Commande> listCommande = commandeDAO.getCommandes();
		request.setAttribute("listCommande", listCommande);
		request.getRequestDispatcher("WEB-INF/view/listCommande.jsp").forward(request, response);
	}

}
