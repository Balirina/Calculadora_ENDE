package interfazCLI.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Balirina
 * Clase para probar los metodos de dividir, calcular potencia y la raiz cuadrada
 * Cada metodo tiene dos casos de prueba
 *
 */
class Op456Test {

	private Operaciones456 calc;
	
	
	/**
	 * Primera prueba del metodo dividir que da fallo
	 */
	@Test
	void testDivision() 
	{
		assertEquals(5, calc.dividir(10, 5));
	}
	/**
	 * Segunda prueba del metodo dividir que no da fallo
	 */
	@Test
	void TestDivision2()
	{
		assertEquals(2, calc.dividir(10,5));
	}
	
	/**
	 * Primera prueba del metodo calcular potencia 
	 */
	@Test
	void testPotencia() 
	{
		assertEquals(16, calc.potencia(4, 2));
	}
	/**
	 * Segunda prueba del metodo calcular potencia que 
	 * comprueba que la calculadora sea instanciada
	 */
	@Test
	void TestPotencia2()
	{
		assertNotNull(calc);
	}
	
	/**
	 * Primera prueba del metodo calcular la raiz cuadrada
	 */
	@Test
	void testRaiz() 
	{
		assertEquals(4, calc.raiz(16));
	}
	/**
	 * Segunda prueba del metodo raiz que da fallo
	 */
	@Test
	void TestRaiz2()
	{
		assertEquals(3, calc.raiz(16));
	}
	

}
