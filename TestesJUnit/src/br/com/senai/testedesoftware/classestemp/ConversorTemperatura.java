package br.com.senai.testedesoftware.classestemp;

public class ConversorTemperatura {

	public static double converteCelsiusParaFahrenheit(double celsius) {
		double fahrenheit = 1.8 * celsius + 32;
		return fahrenheit;
	}

	public static double converteFahrenheitParaCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32)/1.8;
		return celsius;
	}

}
