package interfazCLI.com;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
/**
 * Esta clase es un Junit con las pruebas de las funciones valor absoluto, binario y logaritmo.
 * @author Aitor
 * @version 1.0
 *
 */
class Absoluto_binario_logTest {

	
	@Test
	void testAbsoluto() {
		
		int abs=Absoluto_binario_log.absoluto(-5);
		assertEquals(abs,5);
	}

	@Test
	void testAbsoluto2() {
		
		int abs=Absoluto_binario_log.absoluto(-4/3);
		assertNotEquals(abs,1.33);
	}
	@Test
	void testAbsoluto3() {
		
		int abs=Absoluto_binario_log.absoluto(3);
		assertEquals(abs,-3);
	}
	
	@Test
	void testBinario() 
	{
		String resul=Absoluto_binario_log.binario(10);
		assertEquals(resul,"1010");
	}

	@Test
	void testBinario2() 
	{
		String resul=Absoluto_binario_log.binario(10);
		assertEquals(resul,"1011");
	}
	
	@Test
	void testBinario3() 
	{
		String resul=Absoluto_binario_log.binario(-20);
		assertEquals(resul,"10100");
	}
	
	
	@Test
	void testLogaritmo() 
	{
		double log=Absoluto_binario_log.logaritmo(10);
		assertEquals(log,1);
	}
	
	@Test
	void testLogaritmo2() 
	{
		double log=Absoluto_binario_log.logaritmo(10);
		assertNotEquals(log,1);
	}
	
	@Test
	void testLogaritmo3() 
	{
		double log=Absoluto_binario_log.logaritmo(0);
		assertEquals(log,0);
	}

}
