import java.util.ArrayList;

import java.util.ArrayList;

public class Client {
	private String nom;
	private String prenom;
	private String civilite ;
	private String adresse;
	private int telephone;
	private ArrayList <Compte>listeCompte = new ArrayList();
	
	public Client(){
		
	}
	public Client(String unNom, String unPrenom, String uneCivilite, String uneAdresse, int unTelephone){
		this.nom = unNom;
		this.prenom = unPrenom;
		this.civilite = uneCivilite;
		this.adresse = uneAdresse;
		this.telephone = unTelephone;
	}
	public Client(String unNom, String unPrenom, String uneCivilite, String uneAdresse, int unTelephone, ArrayList<Compte> uneListeCompte){
		this.nom = unNom;
		this.prenom = unPrenom;
		this.civilite = uneCivilite;
		this.adresse = uneAdresse;
		this.telephone = unTelephone;
		this.listeCompte= uneListeCompte;
	}

		public String toString(){
		String txt=("Nom : "+this.nom + "\n Prénom : "+this.prenom+
				"\n Civilité : "+this.civilite+"\n Adresse : "+this.adresse+
				"\n Telephone : "+this.telephone);
		return(txt);
	}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getCivilite() {
			return civilite;
		}
		public void setCivilite(String civilite) {
			this.civilite = civilite;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public int getTelephone() {
			return telephone;
		}
		public void setTelephone(int telephone) {
			this.telephone = telephone;
		}
		
}
