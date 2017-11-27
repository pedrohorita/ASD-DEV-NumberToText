package Aula03_DevOps_ASDof7.NumberToText;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;

public class NumberToTextTest {
	
	NumberToText numToText;
	@Test
	public void ConverterNumero0() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(0.00), equalTo(""));
		
	}
	
	@Test
	public void ConverterNumero1() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(1.00), equalTo("Um real"));
		
	}
	
	@Test
	public void ConverterNumero9() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(9.00), equalTo("Nove reais"));
		
	}
	
	@Test
	public void ConverterNumero10() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(10.00), equalTo("Dez reais"));
		
	}
	
	@Test
	public void ConverterNumero15() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(15.00), equalTo("Quinze reais"));
		
	}
	
	@Test
	public void ConverterNumero33() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(33.00), equalTo("Trinta e três reais"));
		
	}
	
	
	@Test
	public void ConverterNumero99() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(99.00), equalTo("Noventa e nove reais"));
		
	}
	
	@Test
	public void ConverterNumero100() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(100.00), equalTo("Cem reais"));
		
	}
	
	@Test
	public void ConverterNumero101() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(101.00), equalTo("Cento e um reais"));
		
	}
	
	@Test
	public void ConverterNumero1000() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(1000.00), equalTo("Valor inválido"));
		
	}
	
	@Test
	public void ConverterNumero1v7fracionado() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(1.7), equalTo("Valor inválido"));
		
	}
	
	@Test
	public void ConverterNumero999v1fracionado() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(999.1), equalTo("Valor inválido"));
		
	}
	@Test
	public void ConverterNumero0v5fracionado() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(0.5), equalTo("Valor inválido"));
		
	}
	@Test
	public void ConverterNumero999v45fracionadoNegativo() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(-999.45), equalTo("Valor inválido"));
		
	}
	@Test
	public void ConverterNumero0v9fracionadoNegativo() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(-0.9), equalTo("Valor inválido"));
		
	}
	
	@Test
	public void ConverterNumero1000v36fracionadoNegativo() throws RuntimeException {
		numToText = new NumberToText();
		assertThat(numToText.Convert(-1000.36), equalTo("Valor inválido"));
		
	}
}
