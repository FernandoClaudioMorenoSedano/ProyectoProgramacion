package interfaces;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Interfaz que permite jugar con 2 equipos
 *
 * @author Fernando
 */
public class PartidoAmistoso extends JPanel{
	private Ventana ventana;
	public PartidoAmistoso(Ventana v) {
		ventana=v;
		setLayout(null);
		
//Este JComboBox Te permite elegir quien sera el equipo local(El partido se jugara en el estadio de este equipo)
		JComboBox comboEquipoLocal = new JComboBox();
		comboEquipoLocal.setToolTipText("");
		comboEquipoLocal.setBounds(10, 136, 220, 23);
		add(comboEquipoLocal);
		
		JLabel lblEquipolocal = new JLabel("Equipo Local");
		lblEquipolocal.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipolocal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEquipolocal.setBounds(73, 118, 92, 18);
		add(lblEquipolocal);
		
		//Este JComboBox Te permite elegir quien sera el equipo Visitante	
		JComboBox comboEquipoVisitante = new JComboBox();
		comboEquipoVisitante.setToolTipText("");
		comboEquipoVisitante.setBounds(260, 136, 230, 23);
		add(comboEquipoVisitante);
		
		JLabel lblEquipoVisitante = new JLabel("Equipo Visitante");
		lblEquipoVisitante.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipoVisitante.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEquipoVisitante.setBounds(326, 118, 107, 18);
		add(lblEquipoVisitante);
		
//Este boton te permite jugar el partido siempre que se hayan seleccionado los equipos que lo van a jugar
		JButton btnJugarPartido = new JButton("Jugar Partido");
		btnJugarPartido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnJugarPartido.setBounds(189, 207, 112, 21);
		add(btnJugarPartido);
		
		//Este es el boton que nos permite volver al menu principal
		JButton atrasPartido = new JButton("Atras");
		atrasPartido.setBounds(10, 269, 85, 21);
		add(atrasPartido);
		
		//Titulo principal de la interfaz que aparece en la ventana
		JLabel TituloPartidoAmistoso = new JLabel("Partido Amistoso");
		TituloPartidoAmistoso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TituloPartidoAmistoso.setBounds(174, 10, 149, 23);
		add(TituloPartidoAmistoso);
	}
}
