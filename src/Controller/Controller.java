package Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CommandeDAO;
import DAO.CommandeDAOImp;
import Model.Commande;

 
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Controller() {
        
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 // recuperation les chemps de formulaire
	 int numCommande =Integer.parseInt(request.getParameter("num-commande"));
	 Date dateCommande =Date.valueOf(request.getParameter("date-commande"));
	 int quantiteCommande =  Integer.parseInt(request.getParameter("quantite-commande"));
	 String nomFournisseur = request.getParameter("fournisseur");
	 // creation de lobjet commande 
	 Commande commande = new Commande(numCommande, dateCommande, quantiteCommande, nomFournisseur);
	 // creation de model DAO 
	  CommandeDAO commandeDAO = new CommandeDAOImp();
	 //l"ajout dune commande 
	 commandeDAO.addCommande(commande);
	 request.getRequestDispatcher("WEB-INF/view/commandeForm.jsp").forward(request, response);
	}

}
