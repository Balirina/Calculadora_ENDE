package interfazCLI.com;
/**
 * Clase que calcula el valor absoluto,el binario y el logaritmo de un numero entero
 * @author Aitor
 * @version1.0
 */

public class calculo789 {
	
	/**
	 * @author Aitor
	 * @param num Variable de numero entero
	 * @return Devuelve un int con el valor absoluto del numero pasado como parametro
	 */
	public static int absoluto(int num)
	{
		int absoluto=Math.abs(num);
		return absoluto;
	}
	
	/**
	 * @author Aitor
	 * @param num La variable es un numero entero
	 * @return Devuelve un String con el numero binario
	 */
	public static String binario(int num)
	{
		String binario = "";
        if (num > 0) 
        {
            while (num > 0) 
            {
                if (num % 2 == 0) 
                {
                    binario += "0";
                } 
                else 
                {
                    binario += "1";
                }
                num = (int) num / 2;
            }
        } 
        else 
        	if (num == 0) 
            binario = "0";
        String binario2="";
        for(int i=binario.length()-1;i>=0;i--)
        {
        	binario2+=binario.charAt(i);
        }
        return binario2;
	}
	
	/**
	 *  @author Aitor
	 * @param num Variable que corresponde a un numero entero
	 * @return Devuelve un double con el resultado de un logaritmo en base 10 de num
	 */
	public static double logaritmo(int num)
	{
		double resul=0;
		try {
			resul = (Math.log10(num));
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			return resul;
		}
		
	}

	public static void main(String[] args) {
		
		String resul=calculo789.binario(-20);
		System.out.println(resul);
		
		int abs=absoluto(-5);
		System.out.println(abs);
	}
}
