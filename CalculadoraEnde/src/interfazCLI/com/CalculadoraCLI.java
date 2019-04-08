package interfazCLI.com;

public class CalculadoraCLI {
/**
 * @author Balirina
 * Es el programa principal de linea de comandos
 * nuestra labor será extraer los métodos que haga falta y 
 * en la medida de lo posible pasarlo a interfaz gráfico
 * o al menos tenerlo funcionando
 * @param num1, num2
 */
	private static int num1=0;
	private static int num2=0;
	public static void main(String[] args) {
		LanzarMenu();
	}

	/**
	 * Muestra un menú de linea de comando con diferentes opciones
	 * como son meter un num1, un num2
	 * y realziar una operacion sobre ellos
	 */
private static void LanzarMenu() {
	System.out.println("Bienvenido a la calculadora");
	System.out.println("Introduce 1 si queres sumar");
	System.out.println("Introduce 2 si queres restar");
	System.out.println("Introduce 3 si queres multiplicar");
	System.out.println("Introduce 4 si queres dividir");
	System.out.println("Introduce 5 si queres calcular potencia");
	System.out.println("Introduce 6 si queres calcular la raiz cuadrada");
	System.out.println("Introduce 7 si queres calcular el valor absoluto");
	System.out.println("Introduce 8 si queres calcular el logaritmo");
	System.out.println("Introduce 9 si queres calcular el binario");
	int resp=Consola.leeInt();
	System.out.println("Introduce un numero");
	num1=Consola.leeInt();
	if(resp==1 || resp==2 || resp==3 || resp==4)
	{
		System.out.println("Introduce otro numero");
		num2=Consola.leeInt();
	}
	else
	{
		if(resp==5)
		{
			System.out.println("Introduce la potencia");
			num2=Consola.leeInt();
		}
	}
	tratarCasosMenu(resp);
	
}

	/**
	 * Metodo que trata cada caso del menu
	 * @param resp que respresenta la operacion que quiere ejecutar el usuario
	 */
	private static void tratarCasosMenu(int resp) {
		Operaciones op=new Operaciones(num1, num2);
		switch(resp){
		case 1:
			System.out.println("La suma es: "+op.sumar());
			break;
		case 2:
			System.out.println("La resta es: "+op.restar());
			break;
		case 3:
			System.out.println("El resultado de la multiplicacion es : "+op.multiplicar());
			break;
		case 4:
			System.out.println("El resultado de la division es : "+Operaciones456.dividir(num1, num2));
			break;
		case 5:
			System.out.println("El resultado de la potencia es: "+Operaciones456.potencia(num1, num2));
			break;
		case 6:
			System.out.println("La raiz cuadrada es : "+Operaciones456.raiz(num1));
			break;
		case 7:
			System.out.println("El valor absoluto es : "+calculo789.absoluto(num1));
			break;
		case 8:
			System.out.println("El logaritmo es: "+calculo789.logaritmo(num1));
			break;
		case 9:
			System.out.println("El numero pasado a binario es: "+calculo789.binario(num1));
			break;
		}
	}





}
