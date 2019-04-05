package interfazCLI.com;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperacionesTest {

	@Test
	void sumaPositivos() {
		
		Operaciones sum= new Operaciones( 3,4);
		assertTrue (sum.sumar()== 7);
		
		
		}

	@Test
	
	void sumaNegativos()
	{
		Operaciones sum = new Operaciones (-2, -4);
		assertTrue(sum.sumar ()==-6);
		
		
	}
	
	void sumaPositivoNegativo()
	{
		Operaciones sum = new Operaciones (1, -4);
		assertTrue(sum.sumar ()==-3);
		
		
	}
	
	
	@Test
	void RestaPositivos() {
		
		Operaciones res = new Operaciones (2, 6);
		assertTrue(res.restar()== 8);
	}

	@Test
	void RestaNegativos() {
		
		Operaciones res = new Operaciones (-2, -6);
		assertTrue(res.restar()== -3);
	}

	@Test
	void RestaPositivosNegativos() {
		
		Operaciones res = new Operaciones (4, -6);
		assertTrue(res.restar()== -10);
	}
	@Test
	void MultiplicacionPositiva() {
		
		Operaciones multi= new Operaciones(2,4);
		assertTrue(multi.multiplicar()==8 );
		
		
	}
	@Test
	void MultiplicacionNegativa() {
		
		Operaciones multi= new Operaciones(-1, -2);
		assertTrue(multi.multiplicar()== 4);	
	}

	@Test
	void MultiplicacionPositivaNegativa() {
		
		Operaciones multi= new Operaciones(2, - 4);
		assertTrue(multi.multiplicar()==-5 );
		
		
	}
}
