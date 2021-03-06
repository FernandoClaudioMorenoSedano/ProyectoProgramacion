package interfaces;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Interfaz que aparece por defecto en la ventana al ejecutar el programa
 * y en la cual puedes decidir si crear un equipo o jugar un partido
 * @author Fernando
 */
public class MenuPrincipal extends JPanel{
	private Ventana ventana;
	
	public MenuPrincipal(Ventana v) {
		ventana=v;
		setLayout(new BorderLayout(0, 0));
		
		//Este boton te lleva a la interfaz CreadorDeEquipos
		JButton botonCrearEquipo = new JButton("Crear Equipo");
		botonCrearEquipo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(botonCrearEquipo, BorderLayout.WEST);
		botonCrearEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.irACreadorDeEquipos();
			}
		});
		
		//Este boton te lleva a la interfaz PartidoAmistoso
		JButton botonJugar = new JButton("Jugar");
		botonJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAPartidoAmistoso();
			}
		});
		botonJugar.setFont(new Font("Tahoma", Font.PLAIN, 35));
		add(botonJugar, BorderLayout.EAST);
		
		//Titulo principal de la interfaz que aparece en la ventana
		JLabel lblNewLabel = new JLabel("Menu Principal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
		
		//Mensaje de bienvenida en la parte inferior de la ventana
		JLabel lblNewLabel_1 = new JLabel("Bienvenido a Blood Bowl");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblNewLabel_1, BorderLayout.SOUTH);
		
		JLabel imagenCentral = new JLabel("");
		imagenCentral.setIcon(new ImageIcon("Presentadores.jpg"));
		add(imagenCentral, BorderLayout.CENTER);
	}

}
