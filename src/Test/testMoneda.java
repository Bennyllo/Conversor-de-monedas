package Test;
import java.util.ArrayList;  
import java.util.List;

import Clases.Moneda;

public class testMoneda {

	public static void main(String[] args) {
		// Nombre de la moneda-simbolo de la moneda-valor en pesos de la moneda
		List<Moneda> denominaciones = new ArrayList<>();
		Moneda peso = new Moneda("peso", '$', 1);
		Moneda dolar = new Moneda("Dolar", '$', 16.99);
		Moneda euro = new Moneda("Euro", 'e', 18.90);
		denominaciones.add(peso);
		denominaciones.add(dolar);
		denominaciones.add(euro);

		for (Moneda denominacion : denominaciones) {
			System.out.println(denominacion.getDenominacion());
		}

	}
}
