import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
	public class IHM extends JFrame implements ActionListener{
		
		private JPanel panel ;		
		private JButton btnAjouter = new JButton("Ajouter un compte?");
		private JButton btnSupprimer = new JButton("Supprimer un compte");
		private JButton btnListe = new JButton("Liste des comptes ");
		private JButton btnRecherche = new JButton("Rechercher un compte");
		private JButton btnValid = new JButton("Valider");
		private JButton btnQuitter = new JButton("Quitter");
		private JButton btnRetour = new JButton("Retour");
		private JLabel labelList;		
		private Banque banque;		

			
	// Constructeur de la classe Fenetre
		public IHM(Banque laBanque){	
			
		// Création de la barre de menu
		      JMenuBar menu= new JMenuBar();

		// Création d'un "bouton" dans la barre de menu
		      JMenu menuCompte = new JMenu("les Comptes");
		// Création d'un élément du menu « Produit »
		      JMenuItem ajouterCompte = new JMenuItem("Ajouter un compte");
		// Ajout d'un élément (nommé ajouterPdt) au menu nommé menuPdt
		      menuCompte.add(ajouterCompte);
		      
		// Création d'un deuxième élément du menu « Produit »
		      JMenuItem modifCpt = new JMenuItem("Modifier un compte");
		// Ajout d'un élément (nommé modifPdt) au menu nommé menuPdt
		      menuCompte.add(modifCpt);
		// Ajout du "bouton" menuPdt à la barre de menu
		      menu.add(menuCompte);

		      JMenu menuF = new JMenu("Fichiers");
		      JMenuItem ouvrir = new JMenuItem("Ouvrir");
		      menuF.add(ouvrir);
		      JMenuItem Parcourir = new JMenuItem("Parcourir...");
		      menuF.add(Parcourir);
		// Ajout du "bouton" menuPg à la barre de menu
		      menu.add(menuF);
		      
		      
		      JMenu menuPg = new JMenu("Programme");
		      JMenuItem quitter = new JMenuItem("Quitter");
		      menuPg.add(quitter);
		// Ajout d'un listener appelant la classe menuAction lorsque l'on clique sur Quitter
		      //quitter.addActionListener(new menuAction());
		      JMenuItem aPropos=  new JMenuItem("A propos");
		      menuPg.add(aPropos);
		// Ajout du "bouton" menuPg à la barre de menu
		      menu.add(menuPg);
		// Permet de définir le menu utilisé dans la JFrame
		      this.setJMenuBar(menu);

			
			
			this.setTitle("Banque");
			this.setLocationRelativeTo(null);//Permet de placer la fenetre, si c'est null elle est placer automatiquement au milieu		
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//Permet de fermer la fenetre avec la croix		
			this.setSize(550, 450); 	//Permet de redimensionner la fenetre
			this.setResizable(true);	//On interdit iou autorise la redimension de la fenetre			
	// On instancie l'objet JPanel
			panel = new JPanel ( ) ;			
			panel.setBackground(Color.white);
			this.getContentPane().add(panel);	// On ajoute le JPanel au conteneur principal :	
	//On dit ou placer le panel
			panel.setLayout(new FlowLayout());			
			panel.setLayout(new GridLayout(3, 2));
			panel.add(btnAjouter);
			panel.add(btnSupprimer);
			panel.add(btnListe);
			panel.add(btnRecherche);
			panel.add(btnQuitter);
			panel.setLayout(new GridLayout(3, 2,5,5));
	//Permet l'interaction avec l'utilisateur
			btnAjouter.addActionListener(this);
			panel.add(btnAjouter);	
			btnSupprimer.addActionListener(this);
			panel.add(btnSupprimer);
			btnListe.addActionListener(this);
			panel.add(btnListe);
			btnRecherche.addActionListener(this);
			panel.add(btnRecherche);
			btnQuitter.addActionListener(this);
			panel.add(btnQuitter);
			btnRetour.addActionListener(this);
			panel.add(btnRetour);					
			panel.add(btnValid);
			btnValid.addActionListener(this);	
			
			this.banque = laBanque;
			btnRetour.setVisible(false);
			btnValid.setVisible(false);
			this.setVisible(true);			
		}
	//Permet d'aficher ce que font les boutons
		public void actionPerformed ( ActionEvent e ) {
			JOptionPane jop = new JOptionPane();		
			int i;			
				if (e.getSource() == btnAjouter){
					Fenetre fenetre = new Fenetre(banque);
					this.setVisible(false);	
					this.dispose();
				}else if (e.getSource() == btnSupprimer){
					
					if(this.banque.getNbListeCompte()!=0){
						
						//int numC = ;			
						
						boolean trouve = false ;
						i=0;
					   // while (i < this.banque.getNbListeCompte() && trouve==false){
						// if (this.banque.getListeCompte().get(i).getNumCompte()== num){
						//	this.banque.suppCompte(this.banque.getListeCompte().get(i));
						//	trouve = true;
						// }
						//	i++;
						//}
						
						if(trouve == false){
							//afficher message erreur
						}else{
							//afficher la supression reussite
						}
					}else{
						//affiche si c'est vide
					}
					
				}else if (e.getSource() == btnListe){
					
					if(this.banque.getNbListeCompte()!=0){
						
						for(i=0; i < this.banque.getNbListeCompte();i++){
							panel.add(labelList = new JLabel(this.banque.getListeCompte().get(i).infoCompte())).setVisible(true);
						}
						
					}else{
						jop.showMessageDialog(null, "Attention il n'y a pas de compte dans la banque", "Message préventif", JOptionPane.WARNING_MESSAGE);
					}
					
				}else if (e.getSource() == btnRecherche){						FenetreR fenetre = new FenetreR(banque);				
					
				}else if (e.getSource() == btnRetour){
					
					btnAjouter.setVisible(true);
					btnSupprimer.setVisible(true);
					btnListe.setVisible(true);
					btnRecherche.setVisible(true);
					btnQuitter.setVisible(true);

					btnRetour.setVisible(false);
					btnValid.setVisible(false);
					
				}
					else if (e.getSource() == btnQuitter){
					
						System.exit(0); 
	
					}
			}
	}

