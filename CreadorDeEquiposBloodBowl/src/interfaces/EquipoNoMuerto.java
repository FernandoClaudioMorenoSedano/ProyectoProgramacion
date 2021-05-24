package interfaces;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class EquipoNoMuerto extends JPanel{
	private Ventana ventana;
	private CreadorDeEquipos creadorDeEquipos;
	public EquipoNoMuerto(Ventana v) {
		ventana=v;
		setLayout(null);
		
		JSpinner zombi = new JSpinner();
		zombi.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		zombi.setBounds(84, 231, 30, 20);
		add(zombi);
		
		JLabel lblNewLabel = new JLabel("Zombi");
		lblNewLabel.setBounds(81, 250, 41, 20);
		add(lblNewLabel);
		
		JSpinner esqueleto = new JSpinner();
		esqueleto.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		esqueleto.setBounds(222, 231, 30, 20);
		add(esqueleto);
		
		JLabel lblNewLabel_1 = new JLabel("Esqueleto");
		lblNewLabel_1.setBounds(206, 254, 60, 13);
		add(lblNewLabel_1);
		
		JSpinner tumulario = new JSpinner();
		tumulario.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		tumulario.setBounds(377, 231, 30, 20);
		add(tumulario);
		
		JLabel lblNewLabel_2 = new JLabel("Tumulario");
		lblNewLabel_2.setBounds(361, 254, 60, 13);
		add(lblNewLabel_2);
		
		JSpinner necrofago = new JSpinner();
		necrofago.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		necrofago.setBounds(118, 506, 30, 20);
		add(necrofago);
		
		JLabel lblNewLabel_3 = new JLabel("Necrofago");
		lblNewLabel_3.setBounds(100, 527, 65, 13);
		add(lblNewLabel_3);
		
		JSpinner momia = new JSpinner();
		momia.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		momia.setBounds(321, 506, 30, 20);
		add(momia);
		
		JLabel lblNewLabel_4 = new JLabel("Momia");
		lblNewLabel_4.setBounds(318, 527, 47, 13);
		add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((int)zombi.getValue()+
				   (int)esqueleto.getValue()+
				   (int)tumulario.getValue()+
				   (int)necrofago.getValue()+ 
				   (int)momia.getValue()>16){
					JOptionPane.showMessageDialog(ventana,
							"No puedes tener mas de 16 jugadores en el equipo",
							"Login fallido",
							JOptionPane.ERROR_MESSAGE);
				}else {
					ventana.irAMenuPrincipal();
				}
				
					
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
