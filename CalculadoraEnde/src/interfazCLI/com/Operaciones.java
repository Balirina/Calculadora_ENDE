package interfazCLI.com;

public class Operaciones {
	
	
	int a;
	int b;
	int resultado;
	/**
	@Metodo que suma dos numeros
	@param a
	@param b
	@param resultado
	@return resultado
	
	*/
	public  int suma()
	{
		resultado= a+b;
		
		 return resultado;
	}

	/**
	 * Metodo que resta dos numeros
	 * @param a
	 * @param b
	 * @param resultado
	 * @return resultado
	 */
	
	public int  resta()

	{
		resultado =a-b;
		
		return resultado;
	}

	
	/**
	 * Metodo que multiplica dos numeros
	 * @param a
	 * @param b
	 * @param resultado
	 * @return resultado
	 */
	public int  multiplicacion()
	{
		resultado=a*b;
		
		return resultado;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("El resultado de la suma es..");
		System.out.println("El resultado de la resta es ..");
		System.out.println("El resultado de la multiplicacion es...");
	}

}
