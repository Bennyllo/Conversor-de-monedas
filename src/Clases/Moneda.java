package Clases;

public class Moneda {
	private String denominacion;
	private char caracter;
	private double valor;

	// Nombre de la moneda-simbolo de la moneda-valor en pesos de la moneda
	public Moneda(String denominacion, char caracter, double valor) {
		this.denominacion = denominacion;
		this.caracter = caracter;
		this.valor = valor;
	}

	public double convertir(double cantidad) {
		return cantidad = cantidad * this.valor;
		// cantidad / this.valor;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
