package interfaces;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 * Interfaz que permite seleccionar a los jugadores de tu equipo si este es de 
 * la raza del Caos
 * @author Fernando
 */
public class EquipoCaos extends JPanel{
	private Ventana ventana;
	private CreadorDeEquipos creadorDeEquipos;
	public EquipoCaos(Ventana v) {
		ventana=v;
		setLayout(null);
		
//Este JSpiner permite seleccionar cuantos Hombres Bestia habra en tu equipo(entre 0 y 16)
		final JSpinner hombreBestia = new JSpinner();
		hombreBestia.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		hombreBestia.setBounds(68, 225, 30, 20);
		add(hombreBestia);
		
		JLabel lblHombreBestia = new JLabel("Hombre Bestia");
		lblHombreBestia.setBounds(54, 248, 100, 13);
		add(lblHombreBestia);

//Este JSpiner permite seleccionar cuantos Guerreros del Caos habra en tu equipo(entre 0 y 4 )		
		final JSpinner guerreroDelCaos = new JSpinner();
		guerreroDelCaos.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		guerreroDelCaos.setBounds(68, 503, 30, 20);
		add(guerreroDelCaos);
		
		JLabel lblGuerreroDelCaos = new JLabel("Guerrero del Caos");
		lblGuerreroDelCaos.setBounds(40, 528, 114, 13);
		add(lblGuerreroDelCaos);
		
//Este JSpiner permite seleccionar cuantos Minotauros habra en tu equipo(entre 0 y 1)		
		final JSpinner minotauro = new JSpinner();
		minotauro.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		minotauro.setBounds(315, 503, 30, 20);
		add(minotauro);
		
		JLabel lblMinotauro = new JLabel("Minotauro");
		lblMinotauro.setBounds(305, 528, 67, 13);
		add(lblMinotauro);
		
//Este boton te permite crear el equipo siempre y cuando el numero total de jugadores del equipo no sea mayor de 16
		JButton crearCaos = new JButton("Crear");
		crearCaos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				int valorCaos1 = (Integer) hombreBestia.getValue();
				int valorCaos2 = (Integer) guerreroDelCaos.getValue();
				int valorCaos3 = (Integer) minotauro.getValue();
				
				try {
					Connection conexion=
							DriverManager.getConnection(
"jdbc:mysql://127.0.0.1:3306/ProyectoProgramacion","root","admin");
					Statement smt=conexion.createStatement();
					Statement smta=conexion.createStatement();
					Statement smtb=conexion.createStatement();
					smt.executeUpdate("insert into Jugador" + "values('"+valorCaos1+"')");
					smta.executeUpdate("insert into Jugador" + "values('"+valorCaos2+"')");
					smtb.executeUpdate("insert into Jugador" + "values('"+valorCaos3+"')");
				} catch(SQLException e1) {
					e1.printStackTrace();
				}
				
				if((valorCaos1+
					valorCaos2+
					valorCaos3)>16){
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
		
//Este boton te permite volver a la interfaz CreadorDeEquipos
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
