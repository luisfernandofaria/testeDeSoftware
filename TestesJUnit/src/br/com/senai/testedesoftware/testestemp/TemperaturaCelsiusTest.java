package br.com.senai.testedesoftware.testestemp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.senai.testedesoftware.classestemp.TemperaturaCelsius;

public class TemperaturaCelsiusTest {

//	private TemperaturaCelsius tc = new TemperaturaCelsius(32.5);
//	private TemperaturaCelsius tc2 = new TemperaturaCelsius(22);
//	private TemperaturaCelsius tc3 = new TemperaturaCelsius(36.2);

//	@Test
//	public void testConverteCelsiusParaFahrenheit() {
//		assertEquals(90.5, tc.converteCelsiusParaFahrenheit(), 0.01);
//		assertEquals(71.6, tc2.converteCelsiusParaFahrenheit(), 0.01);
//
////		pro valor abaixo, é necessário aceitar maior divergência na precisão
////		caso contrário precisa usar uma classe com maior precisão lugar de double
////		Obs: valores de comparação pegos no conversor do Google		
//		assertEquals(96.8, tc3.converteCelsiusParaFahrenheit(), 0.4);
//	}
	
	TemperaturaCelsius instance = new TemperaturaCelsius(0);
	double expResult = 32.0;
	
	@Test
	public void testConverteCelsiusParaFahrenheit() {
		assertEquals(32.0, instance.converteCelsiusParaFahrenheit(), 0.00);

	}
	
	

}
