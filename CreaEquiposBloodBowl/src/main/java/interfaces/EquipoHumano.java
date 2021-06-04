package interfaces;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

/**
 * Interfaz que permite seleccionar a los jugadores de tu equipo si este es de 
 * la raza de los Humanos
 * @author Fernando
 */
public class EquipoHumano extends JPanel{
	private Ventana ventana;
	private CreadorDeEquipos creadorDeEquipos;
	public EquipoHumano(Ventana v) {
		ventana=v;
		setLayout(null);
		
//Este JSpiner permite seleccionar cuantos Lineas Humanos habra en tu equipo(entre 0 y 16)		
		final JSpinner lineaHumano = new JSpinner();
		lineaHumano.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		lineaHumano.setBounds(84, 231, 30, 20);
		add(lineaHumano);
		
		JLabel lblLineaHumano = new JLabel("Linea Humano");
		lblLineaHumano.setBounds(58, 250, 81, 20);
		add(lblLineaHumano);

//Este JSpiner permite seleccionar cuantos Blizters Humanos habra en tu equipo(entre 0 y 4)
		final JSpinner blizterHumano = new JSpinner();
		blizterHumano.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		blizterHumano.setBounds(222, 231, 30, 20);
		add(blizterHumano);
		
		JLabel lblBlizterHumano = new JLabel("Blizter Humano");
		lblBlizterHumano.setBounds(197, 254, 96, 13);
		add(lblBlizterHumano);
	
//Este JSpiner permite seleccionar cuantos Lanzadores Humanos habra en tu equipo(entre 0 y 2)		
		final JSpinner lanzadorHumano = new JSpinner();
		lanzadorHumano.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		lanzadorHumano.setBounds(377, 231, 30, 20);
		add(lanzadorHumano);
		
		JLabel lblLanzadorHumano = new JLabel("Lanzador Humano");
		lblLanzadorHumano.setBounds(337, 254, 115, 13);
		add(lblLanzadorHumano);
		
//Este JSpiner permite seleccionar cuantos Receptores Humanos habra en tu equipo(entre 0 y 4)
		final JSpinner receptorHumano = new JSpinner();
		receptorHumano.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		receptorHumano.setBounds(118, 506, 30, 20);
		add(receptorHumano);
		
		JLabel lblReceptorHumano = new JLabel("Receptor Humano");
		lblReceptorHumano.setBounds(84, 529, 115, 13);
		add(lblReceptorHumano);

//Este JSpiner permite seleccionar cuantos Ogros habra en tu equipo(entre 0 y 1)
		final JSpinner ogro = new JSpinner();
		ogro.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		ogro.setBounds(321, 506, 30, 20);
		add(ogro);
		
		JLabel lblOgro = new JLabel("Ogro");
		lblOgro.setBounds(321, 529, 30, 20);
		add(lblOgro);

//Este boton te permite crear el equipo siempre y cuando el numero total de jugadores del equipo no sea mayor de 16
		JButton crearHumano = new JButton("Crear");
		crearHumano.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorHumano1 = (Integer) lineaHumano.getValue();
				int valorHumano2 = (Integer) blizterHumano.getValue();
				int valorHumano3 = (Integer) lanzadorHumano.getValue();
				int valorHumano4 = (Integer) receptorHumano.getValue();
				int valorHumano5 = (Integer) ogro.getValue();
				if((valorHumano1+
					valorHumano2+
				    valorHumano3+
				    valorHumano4+ 
				    valorHumano5)>16){
					JOptionPane.showMessageDialog(ventana,
							"No puedes tener mas de 16 jugadores en el equipo",
							"Login fallido",
							JOptionPane.ERROR_MESSAGE);
				}else {
					ventana.irAMenuPrincipal();
				}
				
					
				}
			});
		crearHumano.setBounds(377, 569, 85, 21);
		add(crearHumano);
		
		//Este boton te permite volver a la interfaz CreadorDeEquipos
		JButton atrasHumano = new JButton("Atras");
		atrasHumano.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irACreadorDeEquipos();
			}
		});
		atrasHumano.setBounds(40, 569, 85, 21);
		add(atrasHumano);
		
		JLabel imagLineaHumano = new JLabel("");
		imagLineaHumano.setHorizontalAlignment(SwingConstants.CENTER);
		imagLineaHumano.setBounds(10, 10, 149, 211);
		imagLineaHumano.setIcon(new ImageIcon("LineaHumano.jpg"));
		add(imagLineaHumano);
		
		JLabel imagBlizterHumano = new JLabel("");
		imagBlizterHumano.setBounds(163, 0, 155, 221);
		imagBlizterHumano.setIcon(new ImageIcon("BlizterHumano.jpg"));
		add(imagBlizterHumano);
		
		JLabel imagLanzadorHumano = new JLabel("");
		imagLanzadorHumano.setBounds(328, 10, 149, 211);
		imagLanzadorHumano.setIcon(new ImageIcon("LanzadorHumano.jpg"));
		add(imagLanzadorHumano);
		
		JLabel imagReceptorHumano = new JLabel("");
		imagReceptorHumano.setBounds(68, 280, 131, 211);
		imagReceptorHumano.setIcon(new ImageIcon("ReceptorHumano.jpg"));
		add(imagReceptorHumano);
		
		JLabel imagOgro = new JLabel("");
		imagOgro.setBounds(245, 277, 168, 221);
		imagOgro.setIcon(new ImageIcon("Ogro.jpg"));
		add(imagOgro);
	}
}