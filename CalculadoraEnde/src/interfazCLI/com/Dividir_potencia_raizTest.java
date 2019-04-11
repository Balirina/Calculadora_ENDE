package interfazCLI.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Balirina
 * Clase para probar los metodos de dividir, calcular potencia y la raiz cuadrada
 * Cada metodo tiene dos casos de prueba
 *
 */
class Dividir_potencia_raizTest {

	/**
	 * Primera prueba del metodo dividir que da fallo
	 */
	@Test
	void testDivision() 
	{
		try {
			assertEquals(5, Dividir_potencia_raiz.dividir(10, 5));
		} catch (Division0Exception e) {
			System.out.println("Division entre 0");
		}
	}
	/**
	 * Segunda prueba del metodo dividir que no da fallo
	 */
	@Test
	void TestDivision2()
	{
		try {
			assertEquals(2, Dividir_potencia_raiz.dividir(10,5));
		} catch (Division0Exception e) {
			System.out.println("Division entre 0");
		}
	}
	
	/**
	 * Primera prueba del metodo calcular potencia 
	 */
	@Test
	void testPotencia() 
	{
		assertEquals(16, Dividir_potencia_raiz.potencia(4, 2));
	}

	/**
	 * Segunda prueba del metodo calcular potencia
	 */
	void testPotencia2() 
	{
		assertEquals(16, Dividir_potencia_raiz.potencia(3, 2));
	}
	/**
	 * Primera prueba del metodo calcular la raiz cuadrada
	 */
	@Test
	void testRaiz() 
	{
		assertEquals(4, Dividir_potencia_raiz.raiz(16));
	}
	/**
	 * Segunda prueba del metodo raiz que da fallo
	 */
	@Test
	void TestRaiz2()
	{
		assertEquals(3, Dividir_potencia_raiz.raiz(16));
	}
	

}
