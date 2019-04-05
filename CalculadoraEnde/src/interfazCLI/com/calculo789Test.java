package interfazCLI.com;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
/**
 * Esta clase es un Junit con las pruebas de las funciones valor absoluto, binario y logaritmo.
 * @author Aitor
 * @version 1.0
 *
 */
class calculo789Test {

	
	@Test
	void testAbsoluto() {
		
		int abs=calculo789.absoluto(-5);
		assertEquals(abs,5);
	}

	@Test
	void testAbsoluto2() {
		
		int abs=calculo789.absoluto(-4/3);
		assertNotEquals(abs,1.33);
	}
	@Test
	void testAbsoluto3() {
		
		int abs=calculo789.absoluto(3);
		assertEquals(abs,-3);
	}
	
	@Test
	void testBinario() 
	{
		String resul=calculo789.binario(10);
		assertEquals(resul,"1010");
	}

	@Test
	void testBinario2() 
	{
		String resul=calculo789.binario(10);
		assertEquals(resul,"1011");
	}
	
	@Test
	void testBinario3() 
	{
		String resul=calculo789.binario(-20);
		assertEquals(resul,"10100");
	}
	
	
	@Test
	void testLogaritmo() 
	{
		double log=calculo789.logaritmo(10);
		assertEquals(log,1);
	}
	
	@Test
	void testLogaritmo2() 
	{
		double log=calculo789.logaritmo(10);
		assertNotEquals(log,1);
	}
	
	@Test
	void testLogaritmo3() 
	{
		double log=calculo789.logaritmo(0);
		assertEquals(log,0);
	}

}
