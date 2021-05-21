package interfaces;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;

public class EquipoCaos extends JPanel{
	public EquipoCaos() {
		setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		spinner.setBounds(120, 220, 30, 20);
		add(spinner);
		
		JLabel lblNewLabel = new JLabel("Linea Hombre Bestia");
		lblNewLabel.setBounds(88, 201, 94, 13);
		add(lblNewLabel);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_1.setBounds(350, 220, 30, 20);
		add(spinner_1);
		
		JLabel lblNewLabel_1 = new JLabel("Guerrero del Caos");
		lblNewLabel_1.setBounds(320, 201, 83, 13);
		add(lblNewLabel_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		spinner_2.setBounds(244, 392, 30, 20);
		add(spinner_2);
		
		JLabel lblNewLabel_2 = new JLabel("Minotauro");
		lblNewLabel_2.setBounds(235, 369, 53, 13);
		add(lblNewLabel_2);
	}

}
