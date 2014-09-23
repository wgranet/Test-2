import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Fenetre extends JFrame implements ActionListener {
	private JPanel panel ;		
	private JLabel nomC = new JLabel("Saisir le nom du compte :");
	private JLabel numC = new JLabel("Saisir le numéros de compte");
	private JLabel solde = new JLabel("Saisir le solde de votre compte :");	
	private JButton btnValid = new JButton("Valider");
	//banque
	private JTextField jtfNomC = new JTextField("");
	private JTextField jtfNumC = new JTextField("");
	private JTextField jtfSolde = new JTextField("");

	public Fenetre (Banque laBanque){	
		
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
		// Compte
		panel.add(numC);
		panel.add(jtfNumC);
		panel.add(nomC);
		panel.add(jtfNomC);
		panel.add(solde);
		panel.add(jtfSolde);
		panel.add(btnValid);
		btnValid.addActionListener(this);	
		this.setVisible(true);	
	}
	public void actionPerformed ( ActionEvent e ) {
		JOptionPane jop = new JOptionPane();
		
		String numC = jtfNumC.getText();
		int num = Integer.parseInt(numC);
		String nomC = jtfNomC.getText();
		String Solde = jtfSolde.getText();
		int solde = Integer.parseInt(Solde);
		
		Compte unCompte = new Compte (num,nomC,solde);
		Banque uneBanque = new Banque();
		uneBanque.addCompte(unCompte);
		
		if(e.getSource() == btnValid){
			IHM unIHM = new IHM(uneBanque);
			this.setVisible(false);	
			this.dispose();
		}
	}
}
