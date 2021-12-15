package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private final int LONGUEURMAX = 1000;
	private final int HAUTEURMAX = 800;

	PanelMenuClient pmc;
	PanelMenuGeneral pmg;
	PanelMenuPanier pmp;
	PanelListArticles pla;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		//instanciantion des panels
		pmc = new PanelMenuClient(LONGUEURMAX);
		pmg = new PanelMenuGeneral(LONGUEURMAX);
		pmp = new PanelMenuPanier(LONGUEURMAX, HAUTEURMAX);
		pla = new PanelListArticles(LONGUEURMAX, HAUTEURMAX);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, LONGUEURMAX, HAUTEURMAX);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(pla);
		contentPane.add(pmc);
		contentPane.add(pmg);
		contentPane.add(pmp);
		pmc.setVisible(true);
		pmg.setVisible(true);
		pmp.setVisible(true);
		pla.setVisible(true);
	}

}
