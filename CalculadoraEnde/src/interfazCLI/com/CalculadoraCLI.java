package interfazCLI.com;

public class CalculadoraCLI {
/**
 * Es el programa principal de linea de comandos
 * nuestra labor será extraer los métodos que haga falta y 
 * en la medida de lo posible pasarlo a interfaz gráfico
 * o al menos tenerlo funcionando
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LanzarMenu();

	}

	
	/**
	 * Muestra un menú de linea de comando con diferentes opciones
	 * como son meter un operador A, un operador B
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
	int num1=Consola.leeInt();
	int num2=0;
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
	Operaciones op=new Operaciones(num1, num2);
	Operaciones456 op2=new Operaciones456();
	calculo789 op3=new calculo789();
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
		System.out.println("El resultado de la division es : "+op2.dividir(num1, num2));
		break;
	case 5:
		System.out.println("El resultado de la potencia es: "+op2.potencia(num1, num2));
		break;
	case 6:
		System.out.println("La raiz cuadrada es : "+op2.raiz(num1));
		break;
	case 7:
		System.out.println("El valor absoluto es : "+op3.absoluto(num1));
		break;
	case 8:
		System.out.println("El logaritmo es: "+op3.logaritmo(num1));
		break;
	case 9:
		System.out.println("El numero pasado a binario es: "+op3.binario(num1));
		break;
	}
	
}





}
