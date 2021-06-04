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

public class EquipoOrco extends JPanel{
	private Ventana ventana;
	private CreadorDeEquipos creadorDeEquipos;
	public EquipoOrco(Ventana v) {
		ventana=v;
		setLayout(null);
		
		final JSpinner lineaOrco = new JSpinner();
		lineaOrco.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		lineaOrco.setBounds(60, 232, 30, 20);
		add(lineaOrco);
		
		JLabel lblLineaOrco = new JLabel("Linea Orco");
		lblLineaOrco.setBounds(45, 248, 69, 20);
		add(lblLineaOrco);
		
		final JSpinner blizterOrco = new JSpinner();
		blizterOrco.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		blizterOrco.setBounds(232, 232, 30, 20);
		add(blizterOrco);
		
		JLabel lblBlizterOrco = new JLabel("Blizter Orco");
		lblBlizterOrco.setBounds(214, 252, 69, 13);
		add(lblBlizterOrco);
		
		final JSpinner lanzadorOrco = new JSpinner();
		lanzadorOrco.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		lanzadorOrco.setBounds(377, 232, 30, 20);
		add(lanzadorOrco);
		
		JLabel lblLanzadorOrco = new JLabel("Lanzador Orco");
		lblLanzadorOrco.setBounds(354, 252, 85, 13);
		add(lblLanzadorOrco);
		
		final JSpinner orcoNegro = new JSpinner();
		orcoNegro.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		orcoNegro.setBounds(60, 515, 30, 20);
		add(orcoNegro);
		
		JLabel lblOrcoNegro = new JLabel("Orco Negro");
		lblOrcoNegro.setBounds(45, 534, 69, 20);
		add(lblOrcoNegro);
		
		final JSpinner troll = new JSpinner();
		troll.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		troll.setBounds(232, 515, 30, 20);
		add(troll);
		
		JLabel lblTroll = new JLabel("Troll");
		lblTroll.setBounds(232, 534, 30, 13);
		add(lblTroll);
		
		final JSpinner goblin = new JSpinner();
		goblin.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		goblin.setBounds(377, 515, 30, 20);
		add(goblin);
		
		JLabel lblGoblin = new JLabel("Goblin");
		lblGoblin.setBounds(373, 538, 42, 13);
		add(lblGoblin);
		
		JButton crearOrco = new JButton("Crear");
		crearOrco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorOrco1 = (Integer) lineaOrco.getValue();
				int valorOrco2 = (Integer) blizterOrco.getValue();
				int valorOrco3 = (Integer) lanzadorOrco.getValue();
				int valorOrco4 = (Integer) orcoNegro.getValue();
				int valorOrco5 = (Integer) troll.getValue();
				int valorOrco6 = (Integer) goblin.getValue();
				if((valorOrco1+
				   valorOrco2+
				   valorOrco3+
				   valorOrco4+
				   valorOrco5+
				   valorOrco6)>16){
					JOptionPane.showMessageDialog(ventana,
							"No puedes tener mas de 16 jugadores en el equipo",
							"Login fallido",
							JOptionPane.ERROR_MESSAGE);
				}else {
					ventana.irAMenuPrincipal();
				}
				
					
				}
			});
		crearOrco.setBounds(377, 569, 85, 21);
		add(crearOrco);
		
		JButton atrasOrco = new JButton("Atras");
		atrasOrco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irACreadorDeEquipos();
			}
		});
		atrasOrco.setBounds(40, 569, 85, 21);
		add(atrasOrco);
		
		JLabel imagLineaOrco = new JLabel("");
		imagLineaOrco.setHorizontalAlignment(SwingConstants.CENTER);
		imagLineaOrco.setBounds(10, 11, 149, 211);
		imagLineaOrco.setIcon(new ImageIcon("LineaOrco.jpg"));
		add(imagLineaOrco);
		
		JLabel imagBlizterOrco = new JLabel("");
		imagBlizterOrco.setHorizontalAlignment(SwingConstants.CENTER);
		imagBlizterOrco.setBounds(169, 11, 149, 211);
		imagBlizterOrco.setIcon(new ImageIcon("BlizterOrco.jpg"));
		add(imagBlizterOrco);
		
		JLabel imagLanzadorOrco = new JLabel("");
		imagLanzadorOrco.setHorizontalAlignment(SwingConstants.CENTER);
		imagLanzadorOrco.setBounds(328, 11, 149, 211);
		imagLanzadorOrco.setIcon(new ImageIcon("LanzadorOrco.jpg"));
		add(imagLanzadorOrco);
		
		JLabel imagOrcoNegro = new JLabel("");
		imagOrcoNegro.setHorizontalAlignment(SwingConstants.CENTER);
		imagOrcoNegro.setBounds(10, 294, 149, 211);
		imagOrcoNegro.setIcon(new ImageIcon("OrcoNegro.jpg"));
		add(imagOrcoNegro);
		
		JLabel imagTroll = new JLabel("");
		imagTroll.setHorizontalAlignment(SwingConstants.CENTER);
		imagTroll.setBounds(169, 294, 149, 211);
		imagTroll.setIcon(new ImageIcon("Troll.jpg"));
		add(imagTroll);
		
		JLabel imagGoblin = new JLabel("");
		imagGoblin.setHorizontalAlignment(SwingConstants.CENTER);
		imagGoblin.setBounds(328, 378, 149, 127);
		imagGoblin.setIcon(new ImageIcon("Goblin.jpg"));
		add(imagGoblin);
		
	}
}


