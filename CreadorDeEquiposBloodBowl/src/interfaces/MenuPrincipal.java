package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MenuPrincipal extends JPanel{
	public MenuPrincipal() {
		setLayout(new BorderLayout(0, 0));
		
		JButton botonCrearEquipo = new JButton("Crear Equipo");
		botonCrearEquipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(botonCrearEquipo, BorderLayout.WEST);
		
		
		
		JButton botonJugar = new JButton("Jugar");
		botonJugar.setFont(new Font("Tahoma", Font.PLAIN, 35));
		add(botonJugar, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("Menu Principal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenido a Blood Bowl");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblNewLabel_1, BorderLayout.SOUTH);
	}

}
