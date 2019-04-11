package interfazCLI.com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import org.hamcrest.core.SubstringMatcher;

/**
 * @author Balirina
 *Clase que dibuja la interfaz de una calculadora
 *con los metodos para que cada operacion funcione
 */
public class Interface extends JFrame{

	private JTextField pantalla;
	private JPanel panelTeclas, panelOperac;
	private boolean nuevaOperacion=true;

	/**
	 * Constructor que dibuja la ventana de la calculadora,
	 * la pantalla y los botones de la calculadora.
	 * @author Balirina
	 */
	public Interface()
	{
		setSize(260,300);
		setTitle("Calculadora");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		//dibujar el panel
		JPanel panel=(JPanel)this.getContentPane();
		panel.setLayout(new BorderLayout());

		pantalla=new JTextField("0",20);
		pantalla.setBorder(new EmptyBorder(4,4,4,4));
		pantalla.setFont(new Font("Arial", Font.BOLD,25));
		pantalla.setHorizontalAlignment(JTextField.RIGHT);
		panel.add("North",pantalla);

		//dibujar teclas
		panelTeclas=new JPanel();
		panelTeclas.setLayout(new GridLayout(4,3));
		panelTeclas.setBorder(new EmptyBorder(4,4,4,4));
		for(int i=9; i>=0; i--)
		{
			botonNum(""+i);
		}
		botonNum(".");
		panel.add("Center", panelTeclas);

		//dibujar operaciones
		panelOperac=new JPanel();
		panelOperac.setLayout(new GridLayout(6,2));
		panelOperac.setBorder(new EmptyBorder(4,4,4,4));

		botonOp("+");
		botonOp("^");
		botonOp("-");
		botonOp('\u221A'+"");
		botonOp("*");
		botonOp("abs");
		botonOp("/");
		botonOp("bin");
		botonOp("=");
		botonOp("log");
		botonOp("CE");

		panel.add("East", panelOperac);
		validate();
		setVisible(true);
	}
	/**
	 * Metodo para dibujar los botones con numeros en la pantalla
	 * @param digito, el  valor de cada boton
	 * @author Balirina
	 */
	private void botonNum(String digito)
	{
		JButton btn=new JButton();
		btn.setText(digito);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(pantalla.getText().equals("0") || nuevaOperacion)
				{
					pantalla.setText(digito);
					nuevaOperacion=false;
				}
				else
				{
					String contenido=pantalla.getText();
					pantalla.setText(contenido+digito);
				}

			}
		});
		panelTeclas.add(btn);
	}

	/**
	 * Metodo bara dibujar los botones de las operaciones en la pantalla
	 * @param operacion, el simbolo de la operacion que recibe cada boton
	 * @author Balirina
	 */
	private void botonOp(String operacion)
	{
		JButton btn=new JButton(operacion);
		btn.setForeground(Color.RED);
		btn.setText(operacion);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String contenido=pantalla.getText();
				if(operacion.equals("+") || operacion.equals("-") || operacion.equals("/") || operacion.equals("*")|| operacion.equals("^"))
				{
					pantalla.setText(contenido+operacion);
				}
				else
				{
					ejecutarOperacion(operacion);
					nuevaOperacion=false;
				}
			}
		});

		panelOperac.add(btn);
	}

	/**
	 * Metodo que ejecuta las operaciones que se realizan con solo un valor 
	 * y que llama al metodo operacion2Valores para operaciones que necesitan 2 valores para ser ejecutados
	 * @param op, la operacion que recibe el metodo
	 * @author Balirina
	 */
	private void ejecutarOperacion( String op)
	{
		String contenido=pantalla.getText();
		switch(op)
		{
		case "abs":
				pantalla.setText(String.valueOf(Absoluto_binario_log.absoluto(Integer.parseInt(contenido))));
				break;
		case "log":
				pantalla.setText(String.valueOf(Absoluto_binario_log.logaritmo(Integer.parseInt(contenido))));
				break;
		case '\u221A'+"":
				pantalla.setText(String.valueOf(Dividir_potencia_raiz.raiz(Double.parseDouble(contenido))));
				break;
		case "bin":
				pantalla.setText(String.valueOf(Absoluto_binario_log.binario(Integer.parseInt(contenido))));
				break;
		case "=":
				operacion2Valores();
				break;
		case "CE":
				pantalla.setText("");
				break;
		}
	}
	
	/**
	 * Metodo que ejecuta las operaciones que necesitan 2 valores para ser ejecutados
	 * @author Balirina
	 */
	private void operacion2Valores()
	{
		String contenido=pantalla.getText();
		String valor1="";
		String valor2="";
		String op="";
		for(int i=0; i<contenido.length(); i++)
		{
			if(contenido.charAt(i)=='+' || contenido.charAt(i)=='-' || contenido.charAt(i)=='*' || contenido.charAt(i)=='/' || contenido.charAt(i)=='^')
			{
				op+=contenido.charAt(i);
				valor2=contenido.substring(i+1, contenido.length());
				break;
			}
			valor1+=contenido.charAt(i);
		}
		switch(op) {
		case "+":
				pantalla.setText(String.valueOf(Sumar_restar_multiplicar.sumar(Double.parseDouble(valor1),Double.parseDouble(valor2))));
				break;
		case "-":
				pantalla.setText(String.valueOf(Sumar_restar_multiplicar.restar(Double.parseDouble(valor1),Double.parseDouble(valor2))));
				break;
		case "/":
			try {
				pantalla.setText(String.valueOf(Dividir_potencia_raiz.dividir(Double.parseDouble(valor1),Double.parseDouble(valor2))));
			} catch (NumberFormatException | Division0Exception e) {
				pantalla.setText(e.getMessage());
			}
				break;
		case "^":
				pantalla.setText(String.valueOf(Dividir_potencia_raiz.potencia(Double.parseDouble(valor1),Double.parseDouble(valor2))));
				break;
		case "*":
				pantalla.setText(String.valueOf(Sumar_restar_multiplicar.multiplicar(Double.parseDouble(valor1),Double.parseDouble(valor2))));
				break;
		}
	}
	
	
	/**
	 * Metodo para instanciar la interfaz de la calculadora
	 * @author Balirina
	 * @param args
	 */
	public static void main(String[] args) {
		new Interface();
	}



}
