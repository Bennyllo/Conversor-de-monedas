package Ventanas;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class VentanaContinuar {

	public void DeseaContinuar() {
		int opcion = JOptionPane.showConfirmDialog(null, "Desea continuar)", "Continuar?",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

		if (opcion == 0) {
			SwingUtilities.invokeLater(() -> {
				PantallaMenu menu = new PantallaMenu();
				menu.setVisible(true);
				menu.ventana();
			});

		}else {
		if (opcion == 1 || opcion == 2) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
			System.exit(0);

		}

	}}
}
