package Clases;
//clase para representar las divisas
public class Unidades {
	//la variable denominacion guarda el nombre de la moneda
	//la variable caracter guarda el simbolo de la moneda
	//la variable valor guarda lo que vale cada moneda en pesos todas las monedas van a ser convertidas a pesos 
	private String denominacion;
	private char caracter;
	private double valor;

	// Nombre de la moneda-simbolo de la moneda-valor en pesos de la moneda
	public Unidades(String denominacion, char caracter, double valor) {
		this.denominacion = denominacion;
		this.caracter = caracter;
		this.valor = valor;
	}

	//metodo para convertir entre divisas
	public double convertir(double cantidad) {
		return cantidad = cantidad * this.valor;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public char getCaracter() {
		return caracter;
	}

	public double getValor() {
		return valor;
	}

}
