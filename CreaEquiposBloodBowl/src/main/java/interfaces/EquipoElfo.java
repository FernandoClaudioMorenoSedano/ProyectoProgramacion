package interfaces;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class EquipoElfo extends JPanel{
	private Ventana ventana;
	private CreadorDeEquipos creadorDeEquipos;
	public EquipoElfo(Ventana v) {
		ventana=v;
		setLayout(null);
		
		final JSpinner lineaElfo = new JSpinner();
		lineaElfo.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		lineaElfo.setBounds(77, 231, 30, 20);
		add(lineaElfo);
		
		JLabel lblLineaElfo = new JLabel("Linea Elfo");
		lblLineaElfo.setBounds(65, 250, 60, 20);
		add(lblLineaElfo);
		
		final JSpinner lanzadorElfo = new JSpinner();
		lanzadorElfo.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		lanzadorElfo.setBounds(222, 231, 30, 20);
		add(lanzadorElfo);
		
		JLabel lblLanzadorElfo = new JLabel("Lanzador Elfo");
		lblLanzadorElfo.setBounds(194, 254, 85, 13);
		add(lblLanzadorElfo);
		
		final JSpinner receptorElfo = new JSpinner();
		receptorElfo.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		receptorElfo.setBounds(385, 231, 30, 20);
		add(receptorElfo);
		
		JLabel lblReceptorElfo = new JLabel("Receptor Elfo");
		lblReceptorElfo.setBounds(366, 254, 85, 13);
		add(lblReceptorElfo);
		
		final JSpinner bailarinGuerrero = new JSpinner();
		bailarinGuerrero.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		bailarinGuerrero.setBounds(110, 506, 30, 20);
		add(bailarinGuerrero);
		
		JLabel lblBailarinGuerrero = new JLabel("Bailarin Guerrero");
		lblBailarinGuerrero.setBounds(84, 525, 103, 13);
		add(lblBailarinGuerrero);
		
		final JSpinner hombreArbol = new JSpinner();
		hombreArbol.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		hombreArbol.setBounds(321, 506, 30, 20);
		add(hombreArbol);
		
		JLabel lblHombreArbol = new JLabel("Hombre Arbol");
		lblHombreArbol.setBounds(298, 525, 78, 13);
		add(lblHombreArbol);
		
		JButton crearElfo = new JButton("Crear");
		crearElfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorElfo1 = (Integer) lineaElfo.getValue();
				int valorElfo2 = (Integer) lanzadorElfo.getValue();
				int valorElfo3 = (Integer) receptorElfo.getValue();
				int valorElfo4 = (Integer) bailarinGuerrero.getValue();
				int valorElfo5 = (Integer) hombreArbol.getValue();
				if((valorElfo1+
					valorElfo2+
				    valorElfo3+
				    valorElfo4+ 
				    valorElfo5)>16){
					JOptionPane.showMessageDialog(ventana,
							"No puedes tener mas de 16 jugadores en el equipo",
							"Login fallido",
							JOptionPane.ERROR_MESSAGE);
				}else {
					ventana.irAMenuPrincipal();
				}
				
					
				}
			});
		crearElfo.setBounds(377, 569, 85, 21);
		add(crearElfo);
		
		JButton atrasElfo = new JButton("Atras");
		atrasElfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irACreadorDeEquipos();
			}
		});
		atrasElfo.setBounds(40, 569, 85, 21);
		add(atrasElfo);
		
		JLabel imagLineaElfo = new JLabel("");
		imagLineaElfo.setHorizontalAlignment(SwingConstants.CENTER);
		imagLineaElfo.setBounds(10, 11, 149, 207);
		imagLineaElfo.setIcon(new ImageIcon("LineaElfo.jpg"));
		add(imagLineaElfo);
		
		JLabel imagLanzadorElfo = new JLabel("");
		imagLanzadorElfo.setHorizontalAlignment(SwingConstants.CENTER);
		imagLanzadorElfo.setBounds(169, 11, 149, 207);
		imagLanzadorElfo.setIcon(new ImageIcon("LanzadorElfo.jpg"));
		add(imagLanzadorElfo);
		
		JLabel imagReceptorElfo = new JLabel("");
		imagReceptorElfo.setHorizontalAlignment(SwingConstants.CENTER);
		imagReceptorElfo.setBounds(328, 10, 140, 211);
		imagReceptorElfo.setIcon(new ImageIcon("ReceptorElfo.jpg"));
		add(imagReceptorElfo);
		
		JLabel imagBailarinGuerrero = new JLabel("");
		imagBailarinGuerrero.setHorizontalAlignment(SwingConstants.CENTER);
		imagBailarinGuerrero.setBounds(56, 285, 138, 211);
		imagBailarinGuerrero.setIcon(new ImageIcon("BailarinGuerrero.jpg"));
		add(imagBailarinGuerrero);
		
		JLabel imagHombreArbol = new JLabel("");
		imagHombreArbol.setHorizontalAlignment(SwingConstants.CENTER);
		imagHombreArbol.setBounds(247, 285, 174, 211);
		imagHombreArbol.setIcon(new ImageIcon("HombreArbol.jpg"));
		add(imagHombreArbol);
	}
}
