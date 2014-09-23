import java.util.ArrayList;
public class Compte {
	private int numCompte;
	private String nomCompte;
	private int solde;
	private Client unClient;
	private static int cpt;
	//jfjebfczjekfbzjekfbjkb
	public Compte(){
		
	}
	public Compte(int unNumCompte,String unNomCompte, int unSolde, int cpt){
		this.numCompte = unNumCompte;
		this.nomCompte = unNomCompte;
		this.solde = unSolde;
		cpt++;
		
	}
	public Compte(int unNumCompte,String unNomCompte, int unSolde){
		this.numCompte = unNumCompte;
		this.nomCompte = unNomCompte;
		this.solde = unSolde;
		
	}
	
	public static int getcpt(){
		cpt=cpt+1;
		   return (cpt);
	}
	
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public String getNomCompte() {
		return nomCompte;
	}
		
	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	public String infoCompte(){
		return ("N°de compte : "+this.numCompte+"\n nom du compte : "+this.nomCompte+"\n le solde : "+this.solde);
	}

	//public void addClient(Client unClient){
	//	this.listeCompte.add(unClient);
	//}
	
}
