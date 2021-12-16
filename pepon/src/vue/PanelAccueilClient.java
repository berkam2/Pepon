package vue;

import javax.swing.JPanel;

import model.ColorPanel;

public class PanelGeneralClient extends JPanel{

	public PanelGeneralClient(int longueurM, int hauteurM) {
		ColorPanel color = new ColorPanel();
		setBackground(color.vertClair());
		int longueurMenu = longueurM / 4;
		int longueur = longueurM * 3 / 4 ;
		int haut = hauteurM - 200;
		System.out.println("panel general "+longueurMenu + " "+ longueur +" "+haut);
		setBounds(longueurMenu, 200, longueur, haut);
	}
	
}