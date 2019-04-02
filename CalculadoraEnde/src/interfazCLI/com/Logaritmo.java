package interfazCLI.com;

/**
 * Esta clase calcula el logaritmo de un numero entero en base 10
 * @author Aitor
 * @version 1.0
 */
public class Logaritmo {
	
	/**
	 *  @author Aitor
	 * @param num Variable que corresponde a un numero entero
	 * @return Devuelve un double con el resultado de un logaritmo en base 10 de num
	 */
	public static double Logaritmo(int num)
	{
		double resul=(Math.log10(num));
		return resul;
	}

}
