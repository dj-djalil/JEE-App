package Model;

import java.sql.Date;

public class Commande {

	private int  numCommande ;
	private Date dateCommande;
	private int quantite;
	private String nomFournisseur;
	
	public Commande() {
		
	}
 
		
	public Commande(int numCommande, Date dateCommande, int quantite, String nomFournisseur) {
		super();
		this.numCommande = numCommande;
		this.dateCommande = dateCommande;
		this.quantite = quantite;
		this.nomFournisseur = nomFournisseur;
	}


	public int getNumCommande() {
		return numCommande;
	}
	public void setNumCommande(int numCommande) {
		this.numCommande = numCommande;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getNomFournisseur() {
		return nomFournisseur;
	}
	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}
	
	@Override
	public String toString() {
		 return "num co :"+this.numCommande+" quantite :"+this.quantite;
	}
}
