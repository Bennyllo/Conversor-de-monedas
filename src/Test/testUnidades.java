package Test;
import java.util.ArrayList;  
import java.util.List;

import Clases.Unidades;

public class testUnidades {

	public  List<Unidades> Pruebadelista() {
		// Nombre de la moneda-simbolo de la moneda-valor en pesos de la moneda
		List<Unidades> denominaciones = new ArrayList<>();
		Unidades peso = new Unidades("peso", '$', 1);
		Unidades dolar = new Unidades("Dolar", '$', 16.99);
		Unidades euro = new Unidades("Euro", 'e', 18.90);
		Unidades libra= new Unidades("Libra esterlina",'£',22.00);
		Unidades yen=new Unidades ("Yen japones",'¥',0.12);
		Unidades won=new Unidades("Won sul-coreano",'₩',0.013);
		denominaciones.add(peso);
		denominaciones.add(dolar);
		denominaciones.add(euro);
		denominaciones.add(libra);
		denominaciones.add(yen);
		denominaciones.add(won);
		return denominaciones;
	/*	for (Unidades denominacion : denominaciones) {
			System.out.println(denominacion.getDenominacion());
		}
		System.out.println(denominaciones.get(0).getValor());*/
	}
}