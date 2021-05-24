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
	private EquipoNoMuerto equipoNoMuerto;
	private EquipoEnano equipoEnano;
	private EquipoElfo equipoElfo;
	private EquipoHumano equipoHumano;
	private EquipoOrco equipoOrco;
	private EquipoCaos equipoCaos;
	public Ventana() {
		this.setSize(500,600);
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
		}else if(this.equipoHumano!=null){
			this.equipoHumano.setVisible(false);
		}else if(this.equipoCaos!=null){
			this.equipoCaos.setVisible(false);
		}else if(this.equipoOrco!=null){
			this.equipoOrco.setVisible(false);
		}else if(this.equipoEnano!=null){
			this.equipoEnano.setVisible(false);
		}else if(this.equipoElfo!=null){
			this.equipoElfo.setVisible(false);
		}else if(this.equipoNoMuerto!=null){
			this.equipoNoMuerto.setVisible(false);
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
	
	public void irAEquipoHumano() {
		if(this.equipoHumano==null) {
			this.equipoHumano=new EquipoHumano(this);
		}
		if(this.creadorDeEquipos!=null) {
			this.creadorDeEquipos.setVisible(false);
		}
		this.setContentPane(this.equipoHumano);
		this.equipoHumano.setVisible(true);
	}
	
	public void irAEquipoOrco() {
		if(this.equipoOrco==null) {
			this.equipoOrco=new EquipoOrco(this);
		}
		if(this.creadorDeEquipos!=null) {
			this.creadorDeEquipos.setVisible(false);
		}
		this.setContentPane(this.equipoOrco);
		this.equipoOrco.setVisible(true);
	}
	
	public void irAEquipoEnano() {
		if(this.equipoEnano==null) {
			this.equipoEnano=new EquipoEnano(this);
		}
		if(this.creadorDeEquipos!=null) {
			this.creadorDeEquipos.setVisible(false);
		}
		this.setContentPane(this.equipoEnano);
		this.equipoEnano.setVisible(true);
	}
	
	public void irAEquipoElfo() {
		if(this.equipoElfo==null) {
			this.equipoElfo=new EquipoElfo(this);
		}
		if(this.creadorDeEquipos!=null) {
			this.creadorDeEquipos.setVisible(false);
		}
		this.setContentPane(this.equipoElfo);
		this.equipoElfo.setVisible(true);
	}
	
	public void irAEquipoCaos() {
		if(this.equipoCaos==null) {
			this.equipoCaos=new EquipoCaos(this);
		}
		if(this.creadorDeEquipos!=null) {
			this.creadorDeEquipos.setVisible(false);
		}
		this.setContentPane(this.equipoCaos);
		this.equipoCaos.setVisible(true);
	}
	
	public void irAEquipoNoMuerto() {
		if(this.equipoNoMuerto==null) {
			this.equipoNoMuerto=new EquipoNoMuerto(this);
		}
		if(this.creadorDeEquipos!=null) {
			this.creadorDeEquipos.setVisible(false);
		}
		this.setContentPane(this.equipoNoMuerto);
		this.equipoNoMuerto.setVisible(true);
	}
	
}

