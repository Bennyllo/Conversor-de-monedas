package Ventanas;

import javax.swing.JOptionPane;

public class VentanaTemperatura {
	private double valor;

	public void Temperatura() {
		String[] convertir = { "Celsius a Fahrenheit", "Fahrenheit a celsius", "Celsius a Kelvin", "kelvin a celsius",
				"Fahrenheit a kelvin", "kelvin a Fahrenheit" };

		String opcion = (String) JOptionPane.showInputDialog(null, "Elije una conversion: ", "Opciones",
				JOptionPane.PLAIN_MESSAGE, null, convertir, null);
		try {
			this.valor = Double.parseDouble(JOptionPane.showInputDialog("Cuantos grados quieres convertir"));

			switch (opcion) {
			case "Celsius a Fahrenheit":
				JOptionPane.showMessageDialog(null,
						"°C" + this.valor + " equivalen a °F" + celsiusafarenheit(this.valor));
				break;
			case "Fahrenheit a celsius":
				JOptionPane.showMessageDialog(null,
						"°F" + this.valor + " equivalen a °C" + farenheitacelsius(this.valor));
				break;
			case "Celsius a Kelvin":
				JOptionPane.showMessageDialog(null, "°C" + this.valor + " equivalen a °K" + celsiusakelvin(this.valor));
				break;
			case "kelvin a celsius":
				JOptionPane.showMessageDialog(null, "°K" + this.valor + " equivalen a °C" + kelvinacelsius(this.valor));
				break;
			case "Fahrenheit a kelvin":
				JOptionPane.showMessageDialog(null,
						"°F" + this.valor + " equivalen a °K" + farenheitakelvin(this.valor));
				break;
			case "kelvin a Fahrenheit":
				JOptionPane.showMessageDialog(null,
						"°K" + this.valor + " equivalen a °F" + kelvinafarenheit(this.valor));
				break;
			default:
				break;
			}

		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,
					"Debes ingresar un numero entero o con punto decimal para realizar la convercion");
			Temperatura();
		}

		VentanaContinuar op = new VentanaContinuar();
		op.DeseaContinuar();

	}

	private double celsiusafarenheit(double valor) {
		return (valor * 9 / 5) + 32;
	}

	private double farenheitacelsius(double valor) {
		return (valor - 32) * 5 / 9;
	}

	private double celsiusakelvin(double valor) {
		return valor + 273.15;
	}

	private double kelvinacelsius(double valor) {
		return valor - 273.15;
	}

	private double farenheitakelvin(double valor) {
		double celsius = farenheitacelsius(valor);
		return celsiusakelvin(celsius);
	}

	private double kelvinafarenheit(double valor) {
		double celsius = kelvinacelsius(valor);
		return celsiusafarenheit(celsius);
	}

}
