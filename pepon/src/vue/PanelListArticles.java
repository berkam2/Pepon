package vue;

import javax.swing.JPanel;
import java.awt.Color;

public class PanelListArticles extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelListArticles(int longueurM, int hauteurM) {
		setBackground(Color.RED);
		int longueurMenu = longueurM / 4;
		int longueur = longueurM * 3 / 4 ;
		int haut = hauteurM - 200;
		System.out.println("article : "+longueurMenu+ " "+longueur+ " "+ haut);
		setBounds(longueurMenu, 200, longueur, haut);
	}

}
