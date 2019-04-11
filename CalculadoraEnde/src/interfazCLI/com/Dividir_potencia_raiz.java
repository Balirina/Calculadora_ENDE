package interfazCLI.com;

/**
 * La clase con los tres metodos de la calculadora(division, potencia y raiz cuadrada)
 * @author Balirina
 *
 */
public class Dividir_potencia_raiz {

	/**
	 * Metodo dividir que recide dos parametros y devuelve el resultado de division
	 * @param a, un valor double
	 * @param b, otro valor double 
	 * @return el resultado de division
	 */
	public static double dividir(double a, double b) throws Division0Exception
	{
		if(b==0)
			throw new Division0Exception("Division entre 0");
		double resp=a/b;
		return resp;
	}
	
	/**
	 * Metodo para calcular la potencia
	 * @param a introducido por el usuario
	 * @param b introducido por el usuario
	 * @return resultado 
	 */
	public static double potencia(double a, double b)
	{
		double resp=Math.pow(a, b);
		return resp;
	}
	
	/**
	 * Metodo para calculcar la raiz cuadrada de un numero
	 * @param a introducido por el usuario
	 * @return el resultado
	 */
	public static double raiz(double a)
	{
		double resp=Math.sqrt(a);
		return resp;
	}
}
