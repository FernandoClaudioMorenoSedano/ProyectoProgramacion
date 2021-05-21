package interfaces;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import enumeraciones.Razas;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreadorDeEquipos extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	
	public CreadorDeEquipos() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Creador de Equipos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
	
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		JComboBox comboRaza = new JComboBox();
		comboRaza.setModel(new DefaultComboBoxModel(Razas.values()));
		comboRaza.setBounds(10, 43, 99, 23);
		panelCentral.add(comboRaza);
		
		JLabel lblNewLabel_1 = new JLabel("Raza");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(25, 26, 65, 18);
		panelCentral.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(133, 43, 307, 32);
		panelCentral.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre del Equipo");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(208, 26, 156, 18);
		panelCentral.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 124, 307, 32);
		panelCentral.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre del Estadio del Equipo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(165, 106, 233, 18);
		panelCentral.add(lblNewLabel_3);
		
		JPanel panelInferior = new JPanel();
		add(panelInferior, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelInferior.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelInferior.add(btnNewButton_1);
		
		
	}
}
