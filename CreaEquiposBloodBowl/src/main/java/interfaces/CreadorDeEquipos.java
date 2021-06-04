package interfaces;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import clases.Equipo;
import enumeraciones.Razas;
import excepciones.NombreVacioException;

/**
 * Interfaz Principal de creacion de equipos
 *
 * @author Fernando
 */

public class CreadorDeEquipos extends JPanel{
	private JTextField nombre;
	private JTextField estadio;
	private Ventana ventana;
	private JTextField entrenador;
	
	public CreadorDeEquipos(Ventana v) {
		ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		//Titulo principal de la interfaz que aparece en la ventana
		JLabel lblCreadorDeEquipos = new JLabel("Creador de Equipos");
		lblCreadorDeEquipos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCreadorDeEquipos.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblCreadorDeEquipos, BorderLayout.NORTH);
		
		JPanel panelCentral = new JPanel();
		add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(null);
		
		//Este es el JCombox que nos permite elegir la raza de nuestro equipo
		final JComboBox comboRaza = new JComboBox();
		comboRaza.setModel(new DefaultComboBoxModel(Razas.values()));
		comboRaza.setBounds(10, 43, 99, 23);
		panelCentral.add(comboRaza);
		
		JLabel lblRaza = new JLabel("Raza");
		lblRaza.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaza.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRaza.setBounds(25, 26, 65, 18);
		panelCentral.add(lblRaza);
		
		//Este JText nos permite introducir el nombre de nuestro equipo
		nombre = new JTextField();
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nombre.setBounds(133, 93, 307, 32);
		panelCentral.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblNombreEquipo = new JLabel("Nombre del Equipo");
		lblNombreEquipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreEquipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEquipo.setBounds(211, 74, 156, 18);
		panelCentral.add(lblNombreEquipo);
		
		////Este JText nos permite introducir el nombre del estadio de nuestro equipo
		estadio = new JTextField();
		estadio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		estadio.setBounds(133, 153, 307, 32);
		panelCentral.add(estadio);
		estadio.setColumns(10);
		
		JLabel lblNombreEstadio = new JLabel("Nombre del Estadio del Equipo");
		lblNombreEstadio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEstadio.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreEstadio.setBounds(167, 135, 233, 18);
		panelCentral.add(lblNombreEstadio);
		
		//Este JText nos permite introducir el nombre del entrenador de nuestro equipo
		entrenador = new JTextField();
		entrenador.setFont(new Font("Tahoma", Font.PLAIN, 15));
		entrenador.setColumns(10);
		entrenador.setBounds(133, 28, 307, 32);
		panelCentral.add(entrenador);
		
		JLabel lblNombreEntrenador = new JLabel("Nombre del Entrenador");
		lblNombreEntrenador.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreEntrenador.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreEntrenador.setBounds(200, 10, 167, 18);
		panelCentral.add(lblNombreEntrenador);
		
		JPanel panelInferior = new JPanel();
		add(panelInferior, BorderLayout.SOUTH);
		
		
		//Este es el boton que nos permite volver al menu principal
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAMenuPrincipal();
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelInferior.add(btnAtras);
		
		/**
		 * Este es el boton que nos permite continuar con la creacio de nuestro equipo
		 * dependiendo de que raza hayamos escojido y siempre y cuando se haya introducido
		 * un nombre de entrenador de equipo y de estadio, sino lanzara un NombreVacioException
		 */
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					ventana.miEquipo=new Equipo(nombre.getText());
					try {
						Connection conexion=
								DriverManager.getConnection(
	"jdbc:mysql://127.0.0.1:3306/ProyectoProgramacion","root","admin");
						Statement smt=conexion.createStatement();
						smt.executeUpdate("insert into Entrenador" + "values('"+nombre+"')");
					} catch(SQLException e1) {
						e1.printStackTrace();
					}
					
						if(comboRaza.getSelectedItem().equals(Razas.HUMANO)) {
						ventana.irAEquipoHumano();
					}else if(comboRaza.getSelectedItem().equals(Razas.ORCO)) {
						ventana.irAEquipoOrco();
					}else if(comboRaza.getSelectedItem().equals(Razas.ENANO)) {
						ventana.irAEquipoEnano();
					}else if(comboRaza.getSelectedItem().equals(Razas.ELFO)) {
						ventana.irAEquipoElfo();
					}else if(comboRaza.getSelectedItem().equals(Razas.CAOS)) {
						ventana.irAEquipoCaos();
					}else if(comboRaza.getSelectedItem().equals(Razas.NOMUERTO)) {
						ventana.irAEquipoNoMuerto();
					}
				} catch (NombreVacioException e2) {
					JOptionPane.showMessageDialog(ventana, e2.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
					e2.printStackTrace();
				}
				
				
				
				
			}
		});
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelInferior.add(btnSiguiente);
		
		
	}
}
