package main;

import Ventanas.PantallaMenu;
import javax.swing.SwingUtilities;

class ClasePrincipal {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			PantallaMenu ventana = new PantallaMenu();
			ventana.setVisible(true);
			ventana.ventana();
		});

	}
}
