package fp.daw.exprog20210602.ejercicio4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class MarcoGrafico {

	public static void main(String[] args) {

		Marco miMarco = new Marco();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco extends JFrame {

	public Marco() {
		setTitle("Examen 3ª Evaluacion-Ejercicio 4");
		setBounds(600, 300, 500, 300);
		setResizable(false);
		Panel panel = new Panel();
		add(panel);
	}

	class Panel extends JPanel implements MouseListener, ActionListener {
		private static final long serialVersionUID = 1L;
		private int contadorPulsaciones;
		private JButton botonPulsa = new JButton("Pulsa aquí");
		private JTextField contador = new JTextField(20);
		private JButton botonReiniciar = new JButton("Reiniciar");
		private Object botonPulsado;
		

		public Panel() {
			setLayout(new GridLayout(3, 3));
			setBorder(new EmptyBorder(5, 5, 5, 5));
			add(botonPulsa);
			botonPulsa.getActionForKeyStroke(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.ALT_MASK));
			botonPulsa.addMouseListener(this);
			add(contador);
			contador.addActionListener(this);
			add(botonReiniciar);
			botonReiniciar.getActionForKeyStroke(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.ALT_MASK));
			botonReiniciar.addMouseListener(this);
			

		}

		public void mouseClicked(MouseEvent e) {
			
			botonPulsado=e.getSource();
			
			if(botonPulsado==botonPulsa) {
				contadorPulsaciones++;
				
			}else {
				contadorPulsaciones=0;
			}

		}

		public void mouseEntered(MouseEvent e) {
		

		}

		public void mouseExited(MouseEvent e) {
			

		}

		public void mousePressed(MouseEvent e) {
		

		}

		public void mouseReleased(MouseEvent e) {
		

		}

		
		public void actionPerformed(ActionEvent e) {
			contador.setText(""+contadorPulsaciones);
			
		}

	}

}