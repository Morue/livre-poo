package com;


import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
		

	/*Livre livre1 = new Livre ();
	livre1.setId (001);
	livre1.setTitre ("Le livre de l'auteur");
	livre1.setAuteur ("Jean-Michel Auteur");
	livre1.setPrix (15.50);
	System.out.print( livre1 );*/
	
	int nbrLivres = 0;
	System.out.println("Veuillez entrer le nbre de livres à gerer ");
	nbrLivres = sc.nextInt();
	
	Livre[] livres = new Livre[nbrLivres];
	
	for(int i =0; i<nbrLivres;i++) {
	sc.nextLine();

	System.out.print("Entrez le titre de votre livre" + (i+1));
	String titre = sc.nextLine();
	
	System.out.print("Entrez le nom de l'auteur" + (i+1));
	String auteur = sc.nextLine();
	
	System.out.print("Entrez le prix" + (i+1));
	int prix = sc.nextInt();
	
	Livre livre = new Livre ( titre, auteur, prix);
	livres [i] = livre;
	}
	
	for(int i =0; i<nbrLivres;i++) {
		System.out.println(livres[i].toString());		
	}
	
	System.out.println( "le nombre de livres est de: " + livres[0].getCompteur());
	sc.close();
	
	}
	
}
