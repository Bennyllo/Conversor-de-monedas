package Ventanas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import Clases.Divisas;
import Clases.Unidades;

public class VentanaMonedas {

	private double valor;
	private double resultado;
	private List<Unidades> denominaciones;

	// se crea el metodo leer para asignar valor a this.valor
	private void Leer() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Cuanto quieres convertir"));
		this.valor = valor;
	}

	public Unidades buscarpornombre(String nombre) {
		for (Unidades moneda : this.denominaciones) {
			if (moneda.getDenominacion().equalsIgnoreCase(nombre)) {
				return moneda;
			}
		}
		return null;
	}

	public void opcionesMoneda() {

		/*
		 * 1 facilmente se pudo ahorrar codigo creando la lista para mas estetica se
		 * habia planeado utilizar un switch case pero requeria mucho codigo y era el
		 * mismo procedimiento para todo
		 * 
		 * // se podria utilizar la clase divisas // funcionno utilizar la clase divisas
		 * el codigo se mira mas limpio
		 */

		denominaciones = new ArrayList<>();
		Divisas valoresMonedas = new Divisas();
		denominaciones = valoresMonedas.Monedas();

		List<String> opcionesMonedas = new ArrayList<>();
		for (Unidades unidad : denominaciones) {
			opcionesMonedas.add(unidad.getDenominacion());
		}
		String[] opciones = opcionesMonedas.toArray(new String[0]);

		String monedaInicial = (String) JOptionPane.showInputDialog(null, "Convertir de: ", "Opciones",
				JOptionPane.PLAIN_MESSAGE, null, opciones, null);
		try {
			Leer();
			Unidades moneda1 = buscarpornombre(monedaInicial);
			String monedaSegunda = (String) JOptionPane.showInputDialog(null, "Convertir a: ", "Opciones",
					JOptionPane.PLAIN_MESSAGE, null, opciones, null);

			Unidades moneda2 = buscarpornombre(monedaSegunda);
			resultado = moneda1.convertir(this.valor) / moneda2.convertir(1);
			JOptionPane.showMessageDialog(null,
					"Tienes: " + moneda2.getCaracter() + " " + resultado + " " + moneda2.getDenominacion());
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,
					"Debes ingresar un numero entero o con punto decimal para realizar la convercion");
			opcionesMoneda();
		}

		VentanaContinuar op = new VentanaContinuar();
		op.DeseaContinuar();

	}
}
