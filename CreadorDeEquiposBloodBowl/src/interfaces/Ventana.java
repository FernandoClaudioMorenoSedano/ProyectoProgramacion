package interfaces;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	private CreadorDeEquipos creadorDeEquipos;
	private MenuPrincipal menuPrincipal;
	public Ventana() {
		this.setSize(500,500);
		this.setTitle("Blood Bowl");
		//this.setAlwaysOnTop(true);
		try {
			BufferedImage icono=ImageIO.read(new File("Balon_Blood_Bowl.png"));
			this.setIconImage(icono);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JPanel panel=new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		this.menuPrincipal=new MenuPrincipal(this);
		this.setContentPane(menuPrincipal);		
		this.setVisible(true);
	}
	
	public void irACreadorDeEquipos() {
		if(this.creadorDeEquipos==null) {
			this.creadorDeEquipos=new CreadorDeEquipos(this);
		}
		if(this.menuPrincipal!=null) {
			this.menuPrincipal.setVisible(false);
		}
		this.setContentPane(this.creadorDeEquipos);
		this.creadorDeEquipos.setVisible(true);
	}
	
	public void irAMenuPrincipal() {
		if(this.menuPrincipal==null) {
			this.menuPrincipal=new MenuPrincipal(this);
		}
		if(this.creadorDeEquipos!=null) {
			this.creadorDeEquipos.setVisible(false);
		}
		this.setContentPane(this.menuPrincipal);
		this.menuPrincipal.setVisible(true);
	}
}

