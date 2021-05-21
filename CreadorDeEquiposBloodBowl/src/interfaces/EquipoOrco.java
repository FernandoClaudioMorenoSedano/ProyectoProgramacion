package interfaces;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

public class EquipoOrco extends JPanel{
	public EquipoOrco() {
		setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(47, 210, 30, 20);
		add(spinner);
		
		JLabel lblNewLabel = new JLabel("Linea Orco");
		lblNewLabel.setBounds(23, 180, 67, 20);
		add(lblNewLabel);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(192, 210, 30, 20);
		add(spinner_1);
		
		JLabel lblNewLabel_1 = new JLabel("Blizter Orco");
		lblNewLabel_1.setBounds(172, 184, 69, 13);
		add(lblNewLabel_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(356, 210, 30, 20);
		add(spinner_2);
		
		JLabel lblNewLabel_2 = new JLabel("Lanzador Orco");
		lblNewLabel_2.setBounds(330, 184, 82, 13);
		add(lblNewLabel_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(47, 431, 30, 20);
		add(spinner_3);
		
		JLabel lblNewLabel_3 = new JLabel("Orco Negro");
		lblNewLabel_3.setBounds(23, 408, 82, 13);
		add(lblNewLabel_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(192, 431, 30, 20);
		add(spinner_4);
		
		JLabel lblNewLabel_4 = new JLabel("Troll");
		lblNewLabel_4.setBounds(192, 408, 45, 13);
		add(lblNewLabel_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(356, 431, 30, 20);
		add(spinner_5);
		
		JLabel lblNewLabel_5 = new JLabel("Goblin");
		lblNewLabel_5.setBounds(356, 408, 45, 13);
		add(lblNewLabel_5);
	}
}


