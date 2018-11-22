package com;


public class Livre {
	

	private int id;
	private String titre;
	private String auteur;
	private double prix;
	private static int nbrDinstance = 0;
	
	public Livre (String titre, String auteur, int prix) {
		nbrDinstance++;
		this.id = nbrDinstance;
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	
	public int getCompteur() {
		return nbrDinstance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public static int getNbrDinstance() {
		return nbrDinstance;
	}
	public static void setNbrDinstance(int nbrDinstance) {
		Livre.nbrDinstance = nbrDinstance;
	}

	@Override
	public String toString() {
		return "Livre id = " + id + ", titre = " + titre + ", auteur = " + auteur + ", prix = " + prix;
	}
	
	
	
}
