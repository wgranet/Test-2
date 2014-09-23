import java.util.Scanner;

public class Main {

		private static Scanner clavier;

		public static void main(String[] args) {
			clavier = new Scanner(System.in);
			Banque uneBanque = new Banque();
			IHM maFenetre = new IHM(uneBanque);
			
			//Déclarations des variables
			String banque,nomC,nomClt,prenomClt,civilite, adresse;
			int telephone, numC, solde;
			boolean trouve = false;
							
			//Saisie donnée sur la banque et compte
			System.out.println("Saisir le nom de votre banque : ");
			banque=clavier.nextLine();
			System.out.println("Saisir le nom du compte : ");
			nomC=clavier.nextLine();
			System.out.println("Saisir le numéro du compte : ");
			numC=clavier.nextInt();
			System.out.println("Saisir le solde de votre compte :");
			solde=clavier.nextInt();
			
			//instacie unCompte
			Compte unCompte = new Compte(numC, nomC,solde);
			clavier.nextLine();
			
			//Saisie donnée sur l'utilisateur
			System.out.println("Quel est votre nom ?");
			nomClt=clavier.nextLine();
			System.out.println("Votre prenom : ");
			prenomClt=clavier.nextLine();
			System.out.println("Votre civilité :");
			civilite=clavier.nextLine();
			System.out.println("Votre adresse :");
			adresse=clavier.nextLine();
			System.out.println("Votre numéros de telephone :");
			telephone=clavier.nextInt();
			
			Client unClient = new Client(nomClt, prenomClt, civilite, adresse,telephone);
			uneBanque.addCompte(unCompte);

				System.out.println("Liste des comptes");
				uneBanque.lesComptes();
				System.out.println("Actuellement il y a "+Compte.getcpt()+" compte(s)");

		
			
			System.out.println("\n-------------------------- Recherche d'un compte --------------------------");
			System.out.println();
			
			System.out.println("Quelle est le numéros du compte ?");
			numC = clavier.nextInt();
			clavier.nextLine();
			System.out.println("Quelle est le nom de votre compte ?");
			nomC = clavier.nextLine();
			String indices = "";
			
			int i=0;
			while (i < uneBanque.getNbListeCompte() && trouve ==false){
				if (uneBanque.getListeCompte().get(i).getNumCompte()== numC){
					trouve = true;
					indices = indices + (i+1) + " ";
				}
			}
			
			if (trouve == false){
				System.out.println("Ce compte n'existe pas !");
			}
			else{
				System.out.println("Le compte " + numC + " " + nomC + " se trouve aux indices : " + indices); 
			}
		
		
		}

}
