package vue;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SpringLayout;

public class PanelMenuPanier extends JPanel {

	//attributs
	private JLabel labelPanier, labelPrixTotal;
	private JTextArea areaPanier;
	private JButton btnCommande;
	
	//constructor
	public PanelMenuPanier(int longueurM, int hauteurM) {
		setBackground(new Color(128, 128, 255));
		int longueur = longueurM / 4;
		int haut = hauteurM - 200;

		setBounds(0, 200, longueur, haut);
		//setLayout(new SpringLayout());
		
		labelPanier = new JLabel("Panier");
		add(labelPanier);
		
		//permet de visualiser le prix total du panier
		labelPrixTotal = new JLabel("PrixTotal �");
		add(labelPrixTotal);
		
		/*
		 * permet de visualiser tous les articles commander de facon
		 * simplifier avec juste NomArticle + Quantite
		 */
		areaPanier = new JTextArea("Panier");
		add(areaPanier);
		
		btnCommande = new JButton("Voir commande");
		btnCommande.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//envoie vers la pageGeneralPanier
			}
		});
		add(btnCommande);
	}

	//getter & setter
	public JLabel getLabelPrixTotal() {
		return labelPrixTotal;
	}

	public void setLabelPrixTotal(JLabel labelPrixTotal) {
		this.labelPrixTotal = labelPrixTotal;
	}

	public JTextArea getAreaPanier() {
		return areaPanier;
	}

	public void setAreaPanier(JTextArea areaPanier) {
		this.areaPanier = areaPanier;
	}

}
