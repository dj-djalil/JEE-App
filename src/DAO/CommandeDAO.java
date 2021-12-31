package DAO;

import java.util.ArrayList;

import Model.Commande;

public abstract class CommandeDAO {

	 

	public abstract void addCommande(Commande commande);

	public abstract Commande getCommande(int numCommande);

	public abstract ArrayList<Commande> getCommandes();

}
