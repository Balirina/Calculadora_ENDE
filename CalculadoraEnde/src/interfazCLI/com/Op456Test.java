package interfazCLI.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Op456Test {

	private Operaciones456 calc;
	
	
	@Test
	void testDivision() 
	{
		assertEquals(5, calc.dividir(10, 5));
	}
	
	@Test
	void testPotencia() 
	{
		assertEquals(16, calc.potencia(4, 2));
		//gdfgrf
	}
	
	@Test
	void testRaiz() 
	{
		assertEquals(4, calc.raiz(16));
	}
	

}