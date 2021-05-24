package interfaces;

import javax.swing.JPanel;
import javax.swing.JSpinner;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class EquipoHumano extends JPanel{
	private Ventana ventana;
	private CreadorDeEquipos creadorDeEquipos;
	public EquipoHumano(Ventana v) {
		ventana=v;
		setLayout(null);
		
		JSpinner lineaHumano = new JSpinner();
		lineaHumano.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		lineaHumano.setBounds(84, 231, 30, 20);
		add(lineaHumano);
		
		JLabel lblNewLabel = new JLabel("Linea Humano");
		lblNewLabel.setBounds(67, 250, 69, 20);
		add(lblNewLabel);
		
		JSpinner blizterHumano = new JSpinner();
		blizterHumano.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		blizterHumano.setBounds(222, 231, 30, 20);
		add(blizterHumano);
		
		JLabel lblNewLabel_1 = new JLabel("Blizter Humano");
		lblNewLabel_1.setBounds(206, 254, 69, 13);
		add(lblNewLabel_1);
		
		JSpinner lanzadorHumano = new JSpinner();
		lanzadorHumano.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		lanzadorHumano.setBounds(377, 231, 30, 20);
		add(lanzadorHumano);
		
		JLabel lblNewLabel_2 = new JLabel("Lanzador Humano");
		lblNewLabel_2.setBounds(347, 254, 82, 13);
		add(lblNewLabel_2);
		
		JSpinner receptorHumano = new JSpinner();
		receptorHumano.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		receptorHumano.setBounds(118, 506, 30, 20);
		add(receptorHumano);
		
		JLabel lblNewLabel_3 = new JLabel("Receptor Humano");
		lblNewLabel_3.setBounds(97, 529, 82, 13);
		add(lblNewLabel_3);
		
		JSpinner ogro = new JSpinner();
		ogro.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		ogro.setBounds(321, 506, 30, 20);
		add(ogro);
		
		JLabel lblNewLabel_4 = new JLabel("Ogro");
		lblNewLabel_4.setBounds(321, 529, 30, 13);
		add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((int)lineaHumano.getValue()+
				   (int)blizterHumano.getValue()+
				   (int)lanzadorHumano.getValue()+
				   (int)receptorHumano.getValue()+ 
				   (int)ogro.getValue()>16){
				}
				JOptionPane.showMessageDialog(ventana,
						"No puedes tener mas de 16 jugadores en el equipo",
						"Login fallido",
						JOptionPane.ERROR_MESSAGE);
					
				}
			});
		btnNewButton.setBounds(377, 569, 85, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irACreadorDeEquipos();
			}
		});
		btnNewButton_1.setBounds(40, 569, 85, 21);
		add(btnNewButton_1);
	}
}