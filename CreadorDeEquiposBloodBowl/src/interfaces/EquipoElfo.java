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
		
		JSpinner lineaElfo = new JSpinner();
		lineaElfo.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		lineaElfo.setBounds(77, 231, 30, 20);
		add(lineaElfo);
		
		JLabel lblNewLabel = new JLabel("Linea Elfo");
		lblNewLabel.setBounds(65, 250, 60, 20);
		add(lblNewLabel);
		
		JSpinner lanzadorElfo = new JSpinner();
		lanzadorElfo.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		lanzadorElfo.setBounds(222, 231, 30, 20);
		add(lanzadorElfo);
		
		JLabel lblNewLabel_1 = new JLabel("Lanzador Elfo");
		lblNewLabel_1.setBounds(194, 254, 85, 13);
		add(lblNewLabel_1);
		
		JSpinner receptorElfo = new JSpinner();
		receptorElfo.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		receptorElfo.setBounds(385, 231, 30, 20);
		add(receptorElfo);
		
		JLabel lblNewLabel_2 = new JLabel("Receptor Elfo");
		lblNewLabel_2.setBounds(366, 254, 85, 13);
		add(lblNewLabel_2);
		
		JSpinner bailarinGuerrero = new JSpinner();
		bailarinGuerrero.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		bailarinGuerrero.setBounds(110, 506, 30, 20);
		add(bailarinGuerrero);
		
		JLabel lblNewLabel_3 = new JLabel("Bailarin Guerrero");
		lblNewLabel_3.setBounds(84, 525, 103, 13);
		add(lblNewLabel_3);
		
		JSpinner hombreArbol = new JSpinner();
		hombreArbol.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		hombreArbol.setBounds(321, 506, 30, 20);
		add(hombreArbol);
		
		JLabel lblNewLabel_4 = new JLabel("Hombre Arbol");
		lblNewLabel_4.setBounds(298, 525, 78, 13);
		add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((int)lineaElfo.getValue()+
				   (int)lanzadorElfo.getValue()+
				   (int)receptorElfo.getValue()+
				   (int)bailarinGuerrero.getValue()+ 
				   (int)hombreArbol.getValue()>16){
					JOptionPane.showMessageDialog(ventana,
							"No puedes tener mas de 16 jugadores en el equipo",
							"Login fallido",
							JOptionPane.ERROR_MESSAGE);
				}else {
					ventana.irAMenuPrincipal();
				}
				
					
				}
			});
		btnNewButton.setBounds(377, 569, 85, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atras");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irACreadorDeEquipos();
			}
		});
		btnNewButton_1.setBounds(40, 569, 85, 21);
		add(btnNewButton_1);
		
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
