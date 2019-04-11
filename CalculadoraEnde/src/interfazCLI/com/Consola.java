package interfazCLI.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Balirina
 * Clase para leer los valores introducidos por teclado
 *
 */
public class Consola {

	public static int leeInt() {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		try {
			x = Integer.valueOf(in.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return x;

	}
	
	
	
	
}
