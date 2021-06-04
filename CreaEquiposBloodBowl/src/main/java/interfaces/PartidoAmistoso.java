package interfaces;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PartidoAmistoso extends JPanel{
	public PartidoAmistoso() {
		setLayout(null);
		
		JComboBox comboEquipoLocal = new JComboBox();
		comboEquipoLocal.setToolTipText("");
		comboEquipoLocal.setBounds(10, 136, 220, 23);
		add(comboEquipoLocal);
		
		JLabel lblEquipolocal = new JLabel("Equipo Local");
		lblEquipolocal.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipolocal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEquipolocal.setBounds(73, 118, 92, 18);
		add(lblEquipolocal);
		
		JComboBox comboEquipoVisitante = new JComboBox();
		comboEquipoVisitante.setToolTipText("");
		comboEquipoVisitante.setBounds(260, 136, 230, 23);
		add(comboEquipoVisitante);
		
		JLabel lblEquipoVisitante = new JLabel("Equipo Visitante");
		lblEquipoVisitante.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipoVisitante.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEquipoVisitante.setBounds(326, 118, 107, 18);
		add(lblEquipoVisitante);
		
		JButton btnJugarPartido = new JButton("Jugar Partido");
		btnJugarPartido.setBounds(200, 207, 98, 21);
		add(btnJugarPartido);
		
		JButton atrasPartido = new JButton("Atras");
		atrasPartido.setBounds(10, 269, 85, 21);
		add(atrasPartido);
		
		JButton btnLiga = new JButton("Liga");
		btnLiga.setBounds(405, 269, 85, 21);
		add(btnLiga);
		
		JLabel TituloPartidoAmistoso = new JLabel("Partido Amistoso");
		TituloPartidoAmistoso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TituloPartidoAmistoso.setBounds(174, 10, 149, 23);
		add(TituloPartidoAmistoso);
	}
}
