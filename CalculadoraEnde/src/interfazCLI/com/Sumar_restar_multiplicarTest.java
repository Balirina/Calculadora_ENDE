package interfazCLI.com;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Sumar_restar_multiplicarTest {

	@Test
	void sumaPositivos()
		{
		assertTrue (Sumar_restar_multiplicar.sumar(4,3)== 7);
		}

	@Test
	
	void sumaNegativos()
	{
		assertTrue(Sumar_restar_multiplicar.sumar (-2, -4)==-6);
	}
	
	void sumaPositivoNegativo()
	{
		assertTrue(Sumar_restar_multiplicar.sumar (1, -4)==-3);
	}
	
	
	@Test
	void RestaPositivos() {
		
		assertTrue(Sumar_restar_multiplicar.restar(2, 6)== 8);
	}

	@Test
	void RestaNegativos() {
		
		assertTrue(Sumar_restar_multiplicar.restar(-2, -6)== -3);
	}

	@Test
	void RestaPositivosNegativos() {
		
		assertTrue(Sumar_restar_multiplicar.restar(4, -6)== -10);
	}
	@Test
	void MultiplicacionPositiva() {
		
		assertTrue(Sumar_restar_multiplicar.multiplicar(2,4)==8 );		
	}
	@Test
	void MultiplicacionNegativa() {
		
		assertTrue(Sumar_restar_multiplicar.multiplicar(-1, -2)== 4);	
	}

	@Test
	void MultiplicacionPositivaNegativa() {
		
		assertTrue(Sumar_restar_multiplicar.multiplicar(2, - 4)==-5 );
		
	}
}
