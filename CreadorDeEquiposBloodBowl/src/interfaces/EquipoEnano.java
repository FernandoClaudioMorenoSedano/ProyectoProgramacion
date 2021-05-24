package interfaces;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class EquipoEnano extends JPanel{
	private Ventana ventana;
	private CreadorDeEquipos creadorDeEquipos;
	public EquipoEnano() {
		setLayout(null);
		
		JSpinner barbasLargas = new JSpinner();
		barbasLargas.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		barbasLargas.setBounds(84, 231, 30, 20);
		add(barbasLargas);
		
		JLabel lblNewLabel = new JLabel("BarbasLargas");
		lblNewLabel.setBounds(70, 250, 62, 20);
		add(lblNewLabel);
		
		JSpinner blizterEnano = new JSpinner();
		blizterEnano.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		blizterEnano.setBounds(222, 231, 30, 20);
		add(blizterEnano);
		
		JLabel lblNewLabel_1 = new JLabel("Blizter Enano");
		lblNewLabel_1.setBounds(209, 254, 62, 13);
		add(lblNewLabel_1);
		
		JSpinner corredorEnano = new JSpinner();
		corredorEnano.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		corredorEnano.setBounds(377, 231, 30, 20);
		add(corredorEnano);
		
		JLabel lblNewLabel_2 = new JLabel("Corredor Enano");
		lblNewLabel_2.setBounds(351, 254, 82, 13);
		add(lblNewLabel_2);
		
		JSpinner mataTrolls = new JSpinner();
		mataTrolls.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		mataTrolls.setBounds(118, 506, 30, 20);
		add(mataTrolls);
		
		JLabel lblNewLabel_3 = new JLabel("MataTrolls");
		lblNewLabel_3.setBounds(112, 528, 48, 13);
		add(lblNewLabel_3);
		
		JSpinner apisonadora = new JSpinner();
		apisonadora.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		apisonadora.setBounds(321, 506, 30, 20);
		add(apisonadora);
		
		JLabel lblNewLabel_4 = new JLabel("Apisonadora");
		lblNewLabel_4.setBounds(307, 528, 57, 13);
		add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((int)barbasLargas.getValue()+
				   (int)blizterEnano.getValue()+
				   (int)corredorEnano.getValue()+
				   (int)mataTrolls.getValue()+ 
				   (int)apisonadora.getValue()>16){
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
