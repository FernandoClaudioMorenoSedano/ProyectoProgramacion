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
import javax.swing.SwingConstants;

public class EquipoEnano extends JPanel{
	private Ventana ventana;
	private CreadorDeEquipos creadorDeEquipos;
	public EquipoEnano(Ventana v) {
		ventana=v;
		setLayout(null);
		
		JSpinner barbasLargas = new JSpinner();
		barbasLargas.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		barbasLargas.setBounds(69, 176, 30, 20);
		add(barbasLargas);
		
		JLabel lblNewLabel = new JLabel("BarbasLargas");
		lblNewLabel.setBounds(47, 201, 78, 20);
		add(lblNewLabel);
		
		JSpinner blizterEnano = new JSpinner();
		blizterEnano.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		blizterEnano.setBounds(230, 176, 30, 20);
		add(blizterEnano);
		
		JLabel lblNewLabel_1 = new JLabel("Blizter Enano");
		lblNewLabel_1.setBounds(210, 205, 78, 13);
		add(lblNewLabel_1);
		
		JSpinner corredorEnano = new JSpinner();
		corredorEnano.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		corredorEnano.setBounds(377, 176, 30, 20);
		add(corredorEnano);
		
		JLabel lblNewLabel_2 = new JLabel("Corredor Enano");
		lblNewLabel_2.setBounds(353, 205, 95, 13);
		add(lblNewLabel_2);
		
		JSpinner mataTrolls = new JSpinner();
		mataTrolls.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		mataTrolls.setBounds(95, 473, 30, 20);
		add(mataTrolls);
		
		JLabel lblNewLabel_3 = new JLabel("MataTrolls");
		lblNewLabel_3.setBounds(90, 503, 65, 13);
		add(lblNewLabel_3);
		
		JSpinner apisonadora = new JSpinner();
		apisonadora.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		apisonadora.setBounds(340, 473, 30, 20);
		add(apisonadora);
		
		JLabel lblNewLabel_4 = new JLabel("Apisonadora");
		lblNewLabel_4.setBounds(320, 503, 71, 13);
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
		
		JLabel imagBarbasLargas = new JLabel("");
		imagBarbasLargas.setHorizontalAlignment(SwingConstants.CENTER);
		imagBarbasLargas.setBounds(10, 10, 149, 156);
		imagBarbasLargas.setIcon(new ImageIcon("BarbasLargas.jpg"));
		add(imagBarbasLargas);
		
		JLabel imagBlizterEnano = new JLabel("");
		imagBlizterEnano.setHorizontalAlignment(SwingConstants.CENTER);
		imagBlizterEnano.setBounds(169, 10, 149, 154);
		imagBlizterEnano.setIcon(new ImageIcon("BlizterEnano.jpg"));
		add(imagBlizterEnano);
		
		JLabel imagCorredorEnano = new JLabel("");
		imagCorredorEnano.setHorizontalAlignment(SwingConstants.CENTER);
		imagCorredorEnano.setBounds(323, 10, 149, 157);
		imagCorredorEnano.setIcon(new ImageIcon("CorredorEnano.jpg"));
		add(imagCorredorEnano);
		
		JLabel imagMataTrolls = new JLabel("");
		imagMataTrolls.setHorizontalAlignment(SwingConstants.CENTER);
		imagMataTrolls.setBounds(21, 252, 186, 211);
		imagMataTrolls.setIcon(new ImageIcon("MataTrolls.jpg"));
		add(imagMataTrolls);
		
		JLabel imagApisonadora = new JLabel("");
		imagApisonadora.setHorizontalAlignment(SwingConstants.CENTER);
		imagApisonadora.setBounds(253, 252, 195, 211);
		imagApisonadora.setIcon(new ImageIcon("Apisonadora.jpg"));
		add(imagApisonadora);
		
	}
}
