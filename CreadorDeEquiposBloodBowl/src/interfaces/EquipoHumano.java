package interfaces;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;

public class EquipoHumano extends JPanel{
	public EquipoHumano() {
		setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		spinner.setBounds(84, 210, 30, 20);
		add(spinner);
		
		JLabel lblNewLabel = new JLabel("Linea Humano");
		lblNewLabel.setBounds(67, 180, 69, 20);
		add(lblNewLabel);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_1.setBounds(226, 210, 30, 20);
		add(spinner_1);
		
		JLabel lblNewLabel_1 = new JLabel("Blizter Humano");
		lblNewLabel_1.setBounds(211, 184, 69, 13);
		add(lblNewLabel_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		spinner_2.setBounds(375, 210, 30, 20);
		add(spinner_2);
		
		JLabel lblNewLabel_2 = new JLabel("Lanzador Humano");
		lblNewLabel_2.setBounds(353, 184, 82, 13);
		add(lblNewLabel_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		spinner_3.setBounds(119, 431, 30, 20);
		add(spinner_3);
		
		JLabel lblNewLabel_3 = new JLabel("Receptor Humano");
		lblNewLabel_3.setBounds(95, 408, 82, 13);
		add(lblNewLabel_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		spinner_4.setBounds(321, 431, 30, 20);
		add(spinner_4);
		
		JLabel lblNewLabel_4 = new JLabel("Ogro");
		lblNewLabel_4.setBounds(323, 408, 30, 13);
		add(lblNewLabel_4);
	}
}