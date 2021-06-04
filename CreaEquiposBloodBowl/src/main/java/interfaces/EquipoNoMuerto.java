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

/**
 * Interfaz que permite seleccionar a los jugadores de tu equipo si este es de 
 * la raza de los No Muertos
 * @author Fernando
 */
public class EquipoNoMuerto extends JPanel{
	private Ventana ventana;
	private CreadorDeEquipos creadorDeEquipos;
	public EquipoNoMuerto(Ventana v) {
		ventana=v;
		setLayout(null);

//Este JSpiner permite seleccionar cuantos Zombis habra en tu equipo(entre 0 y 16)
		final JSpinner zombi = new JSpinner();
		zombi.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		zombi.setBounds(71, 215, 30, 20);
		add(zombi);
		
		JLabel lblZombi = new JLabel("Zombi");
		lblZombi.setBounds(70, 240, 41, 20);
		add(lblZombi);
		
//Este JSpiner permite seleccionar cuantos Esqueletos habra en tu equipo(entre 0 y 16)
		final JSpinner esqueleto = new JSpinner();
		esqueleto.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		esqueleto.setBounds(223, 215, 30, 20);
		add(esqueleto);
		
		JLabel lblEsqueleto = new JLabel("Esqueleto");
		lblEsqueleto.setBounds(211, 240, 60, 13);
		add(lblEsqueleto);
		
//Este JSpiner permite seleccionar cuantos Tumularios habra en tu equipo(entre 0 y 2)
		final JSpinner tumulario = new JSpinner();
		tumulario.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		tumulario.setBounds(396, 215, 30, 20);
		add(tumulario);
		
		JLabel lblTumulario = new JLabel("Tumulario");
		lblTumulario.setBounds(383, 240, 60, 13);
		add(lblTumulario);
	
//Este JSpiner permite seleccionar cuantos Necrofagos habra en tu equipo(entre 0 y 4)
		final JSpinner necrofago = new JSpinner();
		necrofago.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		necrofago.setBounds(84, 506, 30, 20);
		add(necrofago);
		
		JLabel lblNecrofago = new JLabel("Necrofago");
		lblNecrofago.setBounds(71, 527, 65, 13);
		add(lblNecrofago);
	
//Este JSpiner permite seleccionar cuantas Momias habra en tu equipo(entre 0 y 2)
		final JSpinner momia = new JSpinner();
		momia.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		momia.setBounds(335, 506, 30, 20);
		add(momia);
		
		JLabel lblMomia = new JLabel("Momia");
		lblMomia.setBounds(332, 527, 47, 13);
		add(lblMomia);
	
//Este boton te permite crear el equipo siempre y cuando el numero total de jugadores del equipo no sea mayor de 16
		JButton crearNoMuerto = new JButton("Crear");
		crearNoMuerto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorNoMuerto1 = (Integer) zombi.getValue();
				int valorNoMuerto2 = (Integer) esqueleto.getValue();
				int valorNoMuerto3 = (Integer) tumulario.getValue();
				int valorNoMuerto4 = (Integer) necrofago.getValue();
				int valorNoMuerto5 = (Integer) momia.getValue();
				if((valorNoMuerto1+
					valorNoMuerto2+
				    valorNoMuerto3+
				    valorNoMuerto4+ 
				    valorNoMuerto5)>16){
					JOptionPane.showMessageDialog(ventana,
							"No puedes tener mas de 16 jugadores en el equipo",
							"Login fallido",
							JOptionPane.ERROR_MESSAGE);
				}else {
					ventana.irAMenuPrincipal();
				}
				
					
				}
			});
		crearNoMuerto.setBounds(377, 569, 85, 21);
		add(crearNoMuerto);
		
		//Este boton te permite volver a la interfaz Creador de equipos
		JButton atrasNoMuerto = new JButton("Atras");
		atrasNoMuerto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irACreadorDeEquipos();
			}
		});
		atrasNoMuerto.setBounds(40, 569, 85, 21);
		add(atrasNoMuerto);
		
		JLabel imagZombi = new JLabel("");
		imagZombi.setBounds(10, 10, 149, 195);
		imagZombi.setIcon(new ImageIcon("Zombi.jpg"));
		add(imagZombi);
		
		JLabel imagEsqueleto = new JLabel("");
		imagEsqueleto.setBounds(169, 10, 149, 200);
		imagEsqueleto.setIcon(new ImageIcon("Esqueleto.jpg"));
		add(imagEsqueleto);
		
		JLabel imagTumulario = new JLabel("");
		imagTumulario.setBounds(335, 9, 149, 201);
		imagTumulario.setIcon(new ImageIcon("Tumulario.jpg"));
		add(imagTumulario);
		
		JLabel imagNecrofago = new JLabel("");
		imagNecrofago.setBounds(10, 307, 183, 189);
		imagNecrofago.setIcon(new ImageIcon("Necrofago.jpg"));
		add(imagNecrofago);
		
		JLabel imagMomia = new JLabel("");
		imagMomia.setBounds(270, 285, 150, 211);
		imagMomia.setIcon(new ImageIcon("Momia.jpg"));
		add(imagMomia);
		
	}
}
