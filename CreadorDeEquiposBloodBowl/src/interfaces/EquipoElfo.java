package interfaces;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class EquipoElfo extends JPanel{
	private Ventana ventana;
	public EquipoElfo() {
		setLayout(null);
		
		JSpinner lineaElfo = new JSpinner();
		lineaElfo.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		lineaElfo.setBounds(84, 231, 30, 20);
		add(lineaElfo);
		
		JLabel lblNewLabel = new JLabel("Linea Elfo");
		lblNewLabel.setBounds(77, 250, 48, 20);
		add(lblNewLabel);
		
		JSpinner lanzadorElfo = new JSpinner();
		lanzadorElfo.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		lanzadorElfo.setBounds(222, 231, 30, 20);
		add(lanzadorElfo);
		
		JLabel lblNewLabel_1 = new JLabel("Lanzador Elfo");
		lblNewLabel_1.setBounds(210, 254, 69, 13);
		add(lblNewLabel_1);
		
		JSpinner receptorElfo = new JSpinner();
		receptorElfo.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		receptorElfo.setBounds(377, 231, 30, 20);
		add(receptorElfo);
		
		JLabel lblNewLabel_2 = new JLabel("Receptor Elfo");
		lblNewLabel_2.setBounds(364, 254, 69, 13);
		add(lblNewLabel_2);
		
		JSpinner bailarinGuerrero = new JSpinner();
		bailarinGuerrero.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		bailarinGuerrero.setBounds(118, 506, 30, 20);
		add(bailarinGuerrero);
		
		JLabel lblNewLabel_3 = new JLabel("Bailarin Guerrero");
		lblNewLabel_3.setBounds(98, 525, 78, 13);
		add(lblNewLabel_3);
		
		JSpinner hombreArbol = new JSpinner();
		hombreArbol.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		hombreArbol.setBounds(321, 506, 30, 20);
		add(hombreArbol);
		
		JLabel lblNewLabel_4 = new JLabel("Hombre Arbol");
		lblNewLabel_4.setBounds(304, 525, 69, 13);
		add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((int)lineaElfo.getValue()+
				   (int)lanzadorElfo.getValue()+
				   (int)receptorElfo.getValue()+
				   (int)bailarinGuerrero.getValue()+ 
				   (int)hombreArbol.getValue()>16){
				}
				JOptionPane.showMessageDialog(ventana,
						"No puedes tener mas de 16 jugadores en el equipo",
						"Login fallido",
						JOptionPane.ERROR_MESSAGE);
					
				}
			});
		btnNewButton.setBounds(377, 569, 85, 21);
		add(btnNewButton);
		
	}
}
