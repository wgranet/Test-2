import java.util.ArrayList;


public class Banque {
	private String nom;
	private ArrayList <Compte>listeCompte = new ArrayList();	
	
	public Banque (){
		
	}
	public Banque (String unNom, ArrayList<Compte> uneListeCompte){
		this.nom=unNom;
		this.listeCompte= uneListeCompte;
	}

	public void setNom(String unNom){
		this.nom= unNom;
	}
	public String getNom(){
		return this.nom;
	}
	
	public void addCompte(Compte unCompte){
		this.listeCompte.add(unCompte);
	}
	
	public ArrayList<Compte> getListeCompte(){
		return this.listeCompte;
	}
	
	public void suppCompte (Compte unCompte){
		this.listeCompte.remove(unCompte);
	}
	
	public int getNbListeCompte(){
		return this.listeCompte.size();
	}
	
	public void lesComptes(){
		System.out.println("***** PRESENTATION DES COMPTES *****");
		if (this.listeCompte.size() == 0){
			System.out.println("La banque n'a aucun compte !");
		}
		else{
			for (int i = 0; i < this.listeCompte.size(); i++){
				System.out.println(this.listeCompte.get(i).infoCompte());
			}
		}
		
	}
}
