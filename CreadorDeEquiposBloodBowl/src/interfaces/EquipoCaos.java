package interfaces;

import javax.swing.JPanel;
import javax.swing.JSpinner;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class EquipoCaos extends JPanel{
	private Ventana ventana;
	private CreadorDeEquipos creadorDeEquipos;
	public EquipoCaos(Ventana v) {
		ventana=v;
		setLayout(null);
		
		JSpinner hombreBestia = new JSpinner();
		hombreBestia.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		hombreBestia.setBounds(68, 225, 30, 20);
		add(hombreBestia);
		
		JLabel lblHombreBestia = new JLabel("Hombre Bestia");
		lblHombreBestia.setBounds(54, 248, 100, 13);
		add(lblHombreBestia);
		
		JSpinner guerreroDelCaos = new JSpinner();
		guerreroDelCaos.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		guerreroDelCaos.setBounds(68, 503, 30, 20);
		add(guerreroDelCaos);
		
		JLabel lblGuerreroDelCaos = new JLabel("Guerrero del Caos");
		lblGuerreroDelCaos.setBounds(40, 528, 114, 13);
		add(lblGuerreroDelCaos);
		
		JSpinner minotauro = new JSpinner();
		minotauro.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		minotauro.setBounds(315, 503, 30, 20);
		add(minotauro);
		
		JLabel lblMinotauro = new JLabel("Minotauro");
		lblMinotauro.setBounds(305, 528, 67, 13);
		add(lblMinotauro);
		
		JButton crearCaos = new JButton("Crear");
		crearCaos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((int)hombreBestia.getValue()+
				   (int)guerreroDelCaos.getValue()+
				   (int)minotauro.getValue()>16){
					JOptionPane.showMessageDialog(ventana,
							"No puedes tener mas de 16 jugadores en el equipo",
							"Login fallido",
							JOptionPane.ERROR_MESSAGE);
				}else {
					ventana.irAMenuPrincipal();
				}
				
					
				}
			});
		crearCaos.setBounds(377, 569, 85, 21);
		add(crearCaos);
		
		JButton atrasCaos = new JButton("Atras");
		atrasCaos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irACreadorDeEquipos();
			}
		});
		atrasCaos.setBounds(40, 569, 85, 21);
		add(atrasCaos);
		
		JLabel imagHombreBestia = new JLabel("");
		imagHombreBestia.setBounds(10, 10, 141, 211);
		imagHombreBestia.setIcon(new ImageIcon("HombreBestia.jpg"));
		add(imagHombreBestia);
		
		JLabel imagMinotauro = new JLabel("");
		imagMinotauro.setBounds(178, 57, 312, 436);
		imagMinotauro.setIcon(new ImageIcon("Minotauro.jpg"));
		add(imagMinotauro);
		
		JLabel imagGuerreroDelCaos = new JLabel("");
		imagGuerreroDelCaos.setBounds(10, 290, 158, 201);
		imagGuerreroDelCaos.setIcon(new ImageIcon("GuerreroDelCaos.jpg"));
		add(imagGuerreroDelCaos);
		
	}

}
