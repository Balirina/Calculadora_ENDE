package interfazCLI.com;

/**
 * Clase que calcula el binario de cualquier numero
 * @author Aitor
 *@version 1.0
 */
public class Binario {

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
        return binario;
	}
	
}
