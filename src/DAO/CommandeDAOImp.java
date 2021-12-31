package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Commande;

public class CommandeDAOImp extends CommandeDAO {

	
	private String url = "jdbc:mysql://localhost:3306/coda";
	private String user = "root";
	private String password = "";

	@Override
	public void addCommande(Commande commande) {
		try {
			 
				Class.forName("com.mysql.jdbc.Driver");
			 
			System.out.println("Driver OK");
			Connection connex = DriverManager.getConnection(url, user, password);

			PreparedStatement preparedStatement = connex.prepareStatement("insert into bdcoda values (?,?,?,?)");
			preparedStatement.setInt(1, commande.getNumCommande());
			preparedStatement.setDate(2, commande.getDateCommande());
			preparedStatement.setInt(3, commande.getQuantite());
			preparedStatement.setString(4, commande.getNomFournisseur());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Commande getCommande(int numCommande) {

		return null;
	}

	@Override
	public ArrayList<Commande> getCommandes() {
		  ArrayList <Commande>commandeList = new ArrayList <Commande>();
		try {
			 
			Class.forName("com.mysql.jdbc.Driver");
		 
		System.out.println("Driver OK");
		Connection connex = DriverManager.getConnection(url, user, password);
        Statement statement = connex.createStatement();
        ResultSet result = statement.executeQuery("select * from bdcoda");
        Commande commande ;
        
        while (result.next()) {
        	commande = new Commande(result.getInt(1),result.getDate(2),result.getInt(3),result.getString(4));
            commandeList.add(commande);
        }
        
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 return commandeList;
	}

}
