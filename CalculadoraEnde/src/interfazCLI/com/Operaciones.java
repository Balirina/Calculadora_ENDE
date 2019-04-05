package interfazCLI.com;


public class Operaciones {
	
	
	int a;
	int b;
	int resultado;
	
	
	
	public Operaciones(int a2, int b2) {
		
		super();
		this.a= a2;
		this.b= b2;
	}



	/**
	@Metodo que suma dos numeros
	@param a
	@param b
	@param resultado
	@return resultado
	
	*/
	public  int sumar()
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
	
	public int  restar()

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
	public int  multiplicar()
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
