package interfaces;

import javax.swing.JPanel;
import javax.swing.JSpinner;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class EquipoCaos extends JPanel{
	private Ventana ventana;
	public EquipoCaos() {
		setLayout(null);
		
		JSpinner hombreBestia = new JSpinner();
		hombreBestia.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		hombreBestia.setBounds(120, 220, 30, 20);
		add(hombreBestia);
		
		JLabel lblNewLabel = new JLabel("Hombre Bestia");
		lblNewLabel.setBounds(104, 242, 66, 13);
		add(lblNewLabel);
		
		JSpinner guerreroDelCaos = new JSpinner();
		guerreroDelCaos.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		guerreroDelCaos.setBounds(350, 220, 30, 20);
		add(guerreroDelCaos);
		
		JLabel lblNewLabel_1 = new JLabel("Guerrero del Caos");
		lblNewLabel_1.setBounds(321, 242, 83, 13);
		add(lblNewLabel_1);
		
		JSpinner minotauro = new JSpinner();
		minotauro.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		minotauro.setBounds(234, 494, 30, 20);
		add(minotauro);
		
		JLabel lblNewLabel_2 = new JLabel("Minotauro");
		lblNewLabel_2.setBounds(225, 519, 53, 13);
		add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((int)hombreBestia.getValue()+
				   (int)guerreroDelCaos.getValue()+
				   (int)minotauro.getValue()>16){
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
