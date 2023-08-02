package Test;
import Ventanas.PantallaMenu;
import javax.swing.SwingUtilities;

public class TestVentanaprincipal {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
		PantallaMenu ventana = new PantallaMenu();
		ventana.setVisible(true);
		ventana.ventana();
	});

}
}
