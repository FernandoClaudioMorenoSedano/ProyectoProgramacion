package interfaces;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	private CreadorDeEquipos creadorDeEquipos;
	private MenuPrincipal menuPrincipal;
	public Ventana() {
		this.setSize(500,500);
		JPanel panel=new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		this.menuPrincipal=new MenuPrincipal();
		this.setContentPane(menuPrincipal);		
		this.setVisible(true);
	}
}

