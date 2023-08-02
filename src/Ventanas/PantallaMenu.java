package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PantallaMenu extends JFrame {

	/**
	 * se investigo y resulta que hay que especificar obligatoriamente
	 * serialversionuid para evitar errores en el futuro
	 */
	private static final long serialVersionUID = 1L;

	// se crea la ventana principal que tendra las 2 pciones principales que sera
	// temperatura y monedas
	public void ventana() {

		setTitle("Menu principal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
//los botones
		JButton botonMoneda = new JButton("Monedas");
		JButton botontemperatura = new JButton("Temperatura");
		// las variables de las clases de monedas y de temperatura para acceder a sus
		// metodos principales
		VentanaMonedas divisas = new VentanaMonedas();
		VentanaTemperatura temperatura = new VentanaTemperatura();

		botonMoneda.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				divisas.opcionesMoneda();
			}
		});

		botontemperatura.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
					temperatura.Temperatura();
					
			}
		});

		panel.add(botonMoneda);
		panel.add(botontemperatura);

		add(panel);
	}
}
