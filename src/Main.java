import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Calculadora basica 2.0, Interfaz Grafica");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setLayout(new FlowLayout());

		JTextField n1CampoCreado = new JTextField(10);
		JTextField n2CampoCreado = new JTextField(10);

		JButton sumaButton = new JButton("Suma");
		JButton restaButton = new JButton("resta");
		JButton divisionButton = new JButton("division");
		JButton multiplicacionButton = new JButton("multiplicacion");
		JButton potenciaButton = new JButton("Potencia");
		JButton raizBUtton = new JButton("raiz");
		JButton logaritmoButton = new JButton("logaritmo");

		JLabel resultadoLabel = new JLabel("Resultado");
        
		ImageIcon icon = new ImageIcon(
				"C:\\Users\\esteb\\eclipse-workspace\\Proyecto_CalculadorBasica_Con_Interfaz_Grafica\\src\\fondoAtardecer.jpg");
		JLabel imageLabel = new JLabel(icon);
		frame.add(new JLabel("Número 1:")); 
		frame.add(n1CampoCreado);
		frame.add(new JLabel("Número 2:")); 
		frame.add(n2CampoCreado);
		frame.add(resultadoLabel);
		frame.add(imageLabel);
		boolean es_valido = true;
		do {
		String pregunta = JOptionPane.showInputDialog(null,
				"Que quiere hacer? Suma: + ,resta:- , division:/ ,  multiplicacion:* elija algun signo ");
		switch (pregunta) {
		case "+":
		{
			frame.add(sumaButton);
			sumaButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Double n1 = Double.parseDouble(n1CampoCreado.getText());
						Double n2 = Double.parseDouble(n2CampoCreado.getText());
						Double resultado = n1 + n2;
						resultadoLabel.setText("Resultado: " + resultado);
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(frame, "Por favor ingresa números válidos", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					
				}

			});
		}
		case "-": 
		{
			frame.add(restaButton);
			 restaButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                try {
		                    Double n1 = Double.parseDouble(n1CampoCreado.getText());
		                    Double n2 = Double.parseDouble(n2CampoCreado.getText());
		                     Double resultado = n1 - n2;
		                    resultadoLabel.setText("Resultado: " + resultado);
		            
		                } catch (NumberFormatException ex) {
		                    JOptionPane.showMessageDialog(frame, "Por favor ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
		                }
		            }
		            
		        });
		}
		case "/": 
		{
			frame.add(divisionButton);
	        divisionButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    Double n1 = Double.parseDouble(n1CampoCreado.getText());
	                    Double n2 = Double.parseDouble(n2CampoCreado.getText());
	                     Double resultado = n1 / n2;
	                    resultadoLabel.setText("Resultado: " + resultado);
	                
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(frame, "Por favor ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	            
	        });
		}
		case "*": 
		{
			frame.add(multiplicacionButton);
			 multiplicacionButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                try {
		                    Double n1 = Double.parseDouble(n1CampoCreado.getText());
		                    Double n2 = Double.parseDouble(n2CampoCreado.getText());
		                     Double resultado = n1 * n2;
		                    resultadoLabel.setText("Resultado: " + resultado);
		                   
		                } catch (NumberFormatException ex) {
		                    JOptionPane.showMessageDialog(frame, "Por favor ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
		                }
		            }
		        });
			 
		}case "**":
		{
			frame.add(potenciaButton);
			potenciaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    Double n1 = Double.parseDouble(n1CampoCreado.getText());
	                    Double n2 = Double.parseDouble(n2CampoCreado.getText());
	                     Double resultado =(Double) Math.pow(n1, n2);
	                    resultadoLabel.setText("Resultado: " + resultado);
	           
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(frame, "Por favor ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });
			
		}case "raiz":
		{
			frame.add(raizBUtton);
			raizBUtton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    Double n1 = Double.parseDouble(n1CampoCreado.getText());
	                    Double n2 = Double.parseDouble(n2CampoCreado.getText());
	                     Double resultado =(Double) Math.pow(n1, 1.0 / n2);;
	                    resultadoLabel.setText("Resultado: " + resultado);
	                
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(frame, "Por favor ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });
		}case "logaritmo":
		{
			frame.add(logaritmoButton);
			logaritmoButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    Double n1 = Double.parseDouble(n1CampoCreado.getText());
	                     Double resultado =Math.log(n1);
	                    resultadoLabel.setText("Resultado: " + resultado);
	               
	                } catch (NumberFormatException ex) {
	                    JOptionPane.showMessageDialog(frame, "Por favor ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });
			
		}
		
		frame.setVisible(true);
		es_valido=false;
		
		
		
		}
		}while(es_valido);
	}
}

	        


