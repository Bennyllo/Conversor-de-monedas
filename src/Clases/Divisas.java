package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author godin 
 * vamos a crear la clase donde se crean las intancias de moneda
 *         para convertir
 * deprecated se iba a crear una clase que obtuviera las monedas predefinidas
 *             para usarse pero se opto por crear las instancias en la ventana
 *             de monedas
 *             
 *             repasando el codigo para comentarios y correciones si se va a utilizar esta clase
 *
 */
public class Divisas {

	public List< Unidades> Monedas() {
		List<Unidades> denominaciones = new ArrayList<>();
		denominaciones.add(new Unidades("Pesos", '$', 1));
		denominaciones.add(new Unidades("Dolares", '$', 16.99));
		denominaciones.add(new Unidades("Euros", 'e', 18.90));
		denominaciones.add(new Unidades("Libras esterlina", '£', 22.00));
		denominaciones.add(new Unidades("Yenes japones", '¥', 0.12));
		denominaciones.add(new Unidades("Won sul-coreano", '₩', 0.013));
		return denominaciones;

	}

}
