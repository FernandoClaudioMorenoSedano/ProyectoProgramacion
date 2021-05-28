package interfaces;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
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
		zombi.setBounds(71, 215, 30, 20);
		add(zombi);
		
		JLabel lblNewLabel = new JLabel("Zombi");
		lblNewLabel.setBounds(70, 240, 41, 20);
		add(lblNewLabel);
		
		JSpinner esqueleto = new JSpinner();
		esqueleto.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		esqueleto.setBounds(223, 215, 30, 20);
		add(esqueleto);
		
		JLabel lblNewLabel_1 = new JLabel("Esqueleto");
		lblNewLabel_1.setBounds(211, 240, 60, 13);
		add(lblNewLabel_1);
		
		JSpinner tumulario = new JSpinner();
		tumulario.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		tumulario.setBounds(396, 215, 30, 20);
		add(tumulario);
		
		JLabel lblNewLabel_2 = new JLabel("Tumulario");
		lblNewLabel_2.setBounds(383, 240, 60, 13);
		add(lblNewLabel_2);
		
		JSpinner necrofago = new JSpinner();
		necrofago.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		necrofago.setBounds(84, 506, 30, 20);
		add(necrofago);
		
		JLabel lblNewLabel_3 = new JLabel("Necrofago");
		lblNewLabel_3.setBounds(71, 527, 65, 13);
		add(lblNewLabel_3);
		
		JSpinner momia = new JSpinner();
		momia.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		momia.setBounds(335, 506, 30, 20);
		add(momia);
		
		JLabel lblNewLabel_4 = new JLabel("Momia");
		lblNewLabel_4.setBounds(332, 527, 47, 13);
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
		
		JLabel imagZombi = new JLabel("");
		imagZombi.setBounds(10, 10, 149, 195);
		imagZombi.setIcon(new ImageIcon("Zombi.jpg"));
		add(imagZombi);
		
		JLabel imagEsqueleto = new JLabel("");
		imagEsqueleto.setBounds(169, 10, 149, 200);
		imagEsqueleto.setIcon(new ImageIcon("Esqueleto.jpg"));
		add(imagEsqueleto);
		
		JLabel imagTumulario = new JLabel("");
		imagTumulario.setBounds(335, 9, 149, 201);
		imagTumulario.setIcon(new ImageIcon("Tumulario.jpg"));
		add(imagTumulario);
		
		JLabel imagNecrofago = new JLabel("");
		imagNecrofago.setBounds(10, 307, 183, 189);
		imagNecrofago.setIcon(new ImageIcon("Necrofago.jpg"));
		add(imagNecrofago);
		
		JLabel imagMomia = new JLabel("");
		imagMomia.setBounds(270, 285, 150, 211);
		imagMomia.setIcon(new ImageIcon("Momia.jpg"));
		add(imagMomia);
		
	}
}
