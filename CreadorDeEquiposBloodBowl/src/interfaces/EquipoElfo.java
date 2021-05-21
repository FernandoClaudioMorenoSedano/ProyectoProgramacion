package interfaces;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class EquipoElfo extends JPanel{
	public EquipoElfo() {
		setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(84, 210, 30, 20);
		add(spinner);
		
		JLabel lblNewLabel = new JLabel("Linea Elfo");
		lblNewLabel.setBounds(72, 180, 48, 20);
		add(lblNewLabel);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(226, 210, 30, 20);
		add(spinner_1);
		
		JLabel lblNewLabel_1 = new JLabel("Lanzador Elfo");
		lblNewLabel_1.setBounds(211, 184, 69, 13);
		add(lblNewLabel_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(375, 210, 30, 20);
		add(spinner_2);
		
		JLabel lblNewLabel_2 = new JLabel("Receptor Elfo");
		lblNewLabel_2.setBounds(353, 184, 69, 13);
		add(lblNewLabel_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(119, 431, 30, 20);
		add(spinner_3);
		
		JLabel lblNewLabel_3 = new JLabel("Bailarin Guerrero");
		lblNewLabel_3.setBounds(95, 408, 78, 13);
		add(lblNewLabel_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(321, 431, 30, 20);
		add(spinner_4);
		
		JLabel lblNewLabel_4 = new JLabel("Hombre Arbol");
		lblNewLabel_4.setBounds(301, 408, 69, 13);
		add(lblNewLabel_4);
	}
}
