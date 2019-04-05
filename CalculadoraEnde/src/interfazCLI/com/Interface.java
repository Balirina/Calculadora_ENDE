package interfazCLI.com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class Interface extends JFrame{

	private JTextField pantalla;
	private JPanel panelTeclas, panelOperac;
	private boolean nuevaOperacion=true;
	private String operacion;
	private double resultado;
	
	public Interface()
	{
		setSize(250,300);
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
		JButton boton;
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
		botonOp("V");
		botonOp("*");
		botonOp("| |");
		botonOp("/");
		botonOp("bin");
		botonOp("=");
		botonOp("log");
		botonOp("CE");
		
		
		panel.add("East", panelOperac);
		validate();
		setVisible(true);
	}
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
				
			}
		});
		panelOperac.add(btn);
	}
	
	private void numeroPulsado(String digito)
	{
		

	}
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
	
	private void calcularRes() 
	{
		if(operacion.equals("+"))
			resultado+=new Double(pantalla.getText());
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
	
	public static void main(String[] args) {
		new Interface();
	}
	
}
