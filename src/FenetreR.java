import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

public class FenetreR extends JFrame implements ActionListener {
	private JPanel panel ;		
	private JLabel numC = new JLabel("Saisir le num�ros de compte");
	private JButton btnValid = new JButton("Valider");
	private Banque uneBanque;	
	//banque
	private JTextField jtfNumC = new JTextField("");

	public FenetreR (Banque laBanque){	
		
		// Cr�ation de la barre de menu
	      JMenuBar menu= new JMenuBar();

	// Cr�ation d'un "bouton" dans la barre de menu
	      JMenu menuCompte = new JMenu("les Comptes");
	// Cr�ation d'un �l�ment du menu � Produit �
	      JMenuItem ajouterCompte = new JMenuItem("Ajouter un compte");
	// Ajout d'un �l�ment (nomm� ajouterPdt) au menu nomm� menuPdt
	      menuCompte.add(ajouterCompte);
	      
	// Cr�ation d'un deuxi�me �l�ment du menu � Produit �
	      JMenuItem modifCpt = new JMenuItem("Modifier un compte");
	// Ajout d'un �l�ment (nomm� modifPdt) au menu nomm� menuPdt
	      menuCompte.add(modifCpt);
	// Ajout du "bouton" menuPdt � la barre de menu
	      menu.add(menuCompte);

	      JMenu menuF = new JMenu("Fichiers");
	      JMenuItem ouvrir = new JMenuItem("Ouvrir");
	      menuF.add(ouvrir);
	      JMenuItem Parcourir = new JMenuItem("Parcourir...");
	      menuF.add(Parcourir);
	// Ajout du "bouton" menuPg � la barre de menu
	      menu.add(menuF);
	      JMenu menuO = new JMenu("Outils");
	      JMenuItem outil = new JMenuItem("Preferences");
	      menuF.add(outil);
	      JMenuItem Fenetre = new JMenuItem("Fenetre");
	      menuF.add(Fenetre);
	      menu.add(menuO);
	      
	      JMenu menuPg = new JMenu("Programme");
	      JMenuItem quitter = new JMenuItem("Quitter");
	      menuPg.add(quitter);
	// Ajout d'un listener appelant la classe menuAction lorsque l'on clique sur Quitter
	      //quitter.addActionListener(new menuAction());
	      JMenuItem aPropos=  new JMenuItem("A propos");
	      menuPg.add(aPropos);
	// Ajout du "bouton" menuPg � la barre de menu
	      menu.add(menuPg);
	// Permet de d�finir le menu utilis� dans la JFrame
	      this.setJMenuBar(menu);
		
		
		this.setTitle("Banque");
		this.uneBanque = uneBanque;
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
		// Compte
		panel.add(numC);
		panel.add(jtfNumC);;
		panel.add(btnValid);
		btnValid.addActionListener(this);	
		this.setVisible(true);	
	}
	public void actionPerformed ( ActionEvent e ) {
		JOptionPane jop = new JOptionPane();
		
		String numC = jtfNumC.getText();
		int num = Integer.parseInt(numC);
		
		if(e.getSource() == btnValid){
			boolean trouve=false;
			int i=0;
			while (i < uneBanque.getNbListeCompte() && trouve ==false){
				if (uneBanque.getListeCompte().get(i).getNumCompte()== num){
					trouve = true;
				}
				i++;
			}
				
			if(trouve == false){
				jop.showMessageDialog(null, "Erreur le compte rechercher n'est pas dans la liste", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
			}else{
				jop.showMessageDialog(null, "Le compte se trouve � l'indice " + (i-1), "Message ", JOptionPane.INFORMATION_MESSAGE);
			}
		}else{
			jop.showMessageDialog(null, "Attention il n'y a pas de compte dans la banque", "Message pr�ventif", JOptionPane.WARNING_MESSAGE);
		}
		//if(e.getSource() == btnValid){
		//	this.setVisible(false);	
		//	this.dispose();
		//}

	}
}
