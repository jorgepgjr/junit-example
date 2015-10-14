package test.java.br.com.junitExample;

import main.java.br.com.junitExample.Calculadora;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void soma(){
		
		
		int result = Calculadora.soma(1,1,1);
		
		
		Assert.assertEquals(1+1+1, result);
	}
}
