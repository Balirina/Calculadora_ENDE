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

/**
 * @author Balirina
 *Clase que dibuja la interfaz de una calculadora
 */
public class Interface extends JFrame{

	private JTextField pantalla;
	private JPanel panelTeclas, panelOperac;
	private boolean nuevaOperacion=true;
	private String operacion;
	private double resultado;

	/**
	 * Constructor que dibuja la pantalla y los botones de la calculadora
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
	 * @param operacion
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
				pantalla.setText(contenido+operacion);
				operacionPulsado(operacion);

			}
		});

		panelOperac.add(btn);
	}


	/**
	 * Metodo para realizar las operaciones
	 * @param tecla, la operacion tecleada
	 */
	private void operacionPulsado(String tecla)
	{
		if(tecla.equals("="))
			calcularRes();
		else
		{
			if (tecla.equals("CE"))
			{
				resultado=0;
				pantalla.setText("");
				nuevaOperacion=true;
			}
			else
			{
				operacion=tecla;
				if((resultado>0) && !nuevaOperacion)
					calcularRes();
				else
					resultado=new Double(pantalla.getText());
			}
		}
		nuevaOperacion=true;
	}

	/**
	 * Metodo para hacer los calculos de las operaciones
	 */
	private void calcularRes() 
	{
		if(operacion.equals("+"))
		{
			String contenido=pantalla.getText();
			String[] partes=contenido.split("+");
			Operaciones op=new Operaciones((Integer.parseInt(partes[0])), (Integer.parseInt(partes[1])));
			resultado=op.sumar();
			pantalla.setText(String.valueOf(resultado));

		}
		if(operacion.equals("abs"))
		{
			String contenido=pantalla.getText();
			calculo789 calc=new calculo789();
			resultado=calc.absoluto(Integer.parseInt(contenido));
			pantalla.setText(String.valueOf(resultado));
		}
		else
		{
			if(operacion.equals("-"))
				resultado-=new Double(pantalla.getText());
			else
			{
				if(operacion.equals("/"))
					resultado/=new Double(pantalla.getText());
				else
				{
					if(operacion.equals("*"));
					resultado*=new Double(pantalla.getText());
				}
			}
		}
		pantalla.setText(""+resultado);
		operacion="";
	}

	/**
	 * Metodo para instanciar la interfaz de la calculadora
	 * @param args
	 */
	public static void main(String[] args) {
		new Interface();
	}



}
