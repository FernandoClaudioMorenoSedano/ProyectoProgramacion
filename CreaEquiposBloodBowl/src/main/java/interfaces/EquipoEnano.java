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

/**
 * Interfaz que permite seleccionar a los jugadores de tu equipo si este es de 
 * la raza de los Enanos
 * @author Fernando
 */
public class EquipoEnano extends JPanel{
	private Ventana ventana;
	private CreadorDeEquipos creadorDeEquipos;
	public EquipoEnano(Ventana v) {
		ventana=v;
		setLayout(null);
//Este JSpiner permite seleccionar cuantos BarbasLargas habra en tu equipo(entre 0 y 16)		
		final JSpinner barbasLargas = new JSpinner();
		barbasLargas.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		barbasLargas.setBounds(69, 176, 30, 20);
		add(barbasLargas);
		
		JLabel lblBarbasLargas = new JLabel("BarbasLargas");
		lblBarbasLargas.setBounds(47, 201, 78, 20);
		add(lblBarbasLargas);
		
//Este JSpiner permite seleccionar cuantos Blizters Enanos habra en tu equipo(entre 0 y 2)		
		final JSpinner blizterEnano = new JSpinner();
		blizterEnano.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		blizterEnano.setBounds(230, 176, 30, 20);
		add(blizterEnano);
		
		JLabel lblBlizterEnano = new JLabel("Blizter Enano");
		lblBlizterEnano.setBounds(210, 205, 78, 13);
		add(lblBlizterEnano);
		
//Este JSpiner permite seleccionar cuantos Corredores Enanos habra en tu equipo(entre 0 y 2)		
		final JSpinner corredorEnano = new JSpinner();
		corredorEnano.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		corredorEnano.setBounds(377, 176, 30, 20);
		add(corredorEnano);
		
		JLabel lblCorredorEnano = new JLabel("Corredor Enano");
		lblCorredorEnano.setBounds(353, 205, 95, 13);
		add(lblCorredorEnano);
		
//Este JSpiner permite seleccionar cuantos MataTrolls habra en tu equipo(entre 0 y 2)		
		final JSpinner mataTrolls = new JSpinner();
		mataTrolls.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		mataTrolls.setBounds(95, 473, 30, 20);
		add(mataTrolls);
		
		JLabel lblMataTrolls = new JLabel("MataTrolls");
		lblMataTrolls.setBounds(90, 503, 65, 13);
		add(lblMataTrolls);

//Este JSpiner permite seleccionar cuantas Apisonadoras habra en tu equipo(entre 0 y 1)
		final JSpinner apisonadora = new JSpinner();
		apisonadora.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		apisonadora.setBounds(340, 473, 30, 20);
		add(apisonadora);
		
		JLabel lblApisonadora = new JLabel("Apisonadora");
		lblApisonadora.setBounds(320, 503, 71, 13);
		add(lblApisonadora);
		
//Este boton te permite crear el equipo siempre y cuando el numero total de jugadores del equipo no sea mayor de 16		
		JButton crearEnano = new JButton("Crear");
		crearEnano.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valorEnano1 = (Integer) barbasLargas.getValue();
				int valorEnano2 = (Integer) blizterEnano.getValue();
				int valorEnano3 = (Integer) corredorEnano.getValue();
				int valorEnano4 = (Integer) mataTrolls.getValue();
				int valorEnano5 = (Integer) apisonadora.getValue();
				if((valorEnano1+
					valorEnano2+
				    valorEnano3+
				    valorEnano4+ 
				    valorEnano5)>16){
					JOptionPane.showMessageDialog(ventana,
							"No puedes tener mas de 16 jugadores en el equipo",
							"Login fallido",
							JOptionPane.ERROR_MESSAGE);
				}else {
					ventana.irAMenuPrincipal();
				}
				
					
				}
			});
		crearEnano.setBounds(377, 569, 85, 21);
		add(crearEnano);
		
		//Este boton te permite volver a la interfaz CreadorDeEquipos
		JButton atrasEnano = new JButton("Atras");
		atrasEnano.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irACreadorDeEquipos();
			}
		});
		atrasEnano.setBounds(40, 569, 85, 21);
		add(atrasEnano);
		
		JLabel imagBarbasLargas = new JLabel("");
		imagBarbasLargas.setHorizontalAlignment(SwingConstants.CENTER);
		imagBarbasLargas.setBounds(10, 10, 149, 156);
		imagBarbasLargas.setIcon(new ImageIcon("BarbasLargas.jpg"));
		add(imagBarbasLargas);
		
		JLabel imagBlizterEnano = new JLabel("");
		imagBlizterEnano.setHorizontalAlignment(SwingConstants.CENTER);
		imagBlizterEnano.setBounds(169, 10, 149, 154);
		imagBlizterEnano.setIcon(new ImageIcon("BlizterEnano.jpg"));
		add(imagBlizterEnano);
		
		JLabel imagCorredorEnano = new JLabel("");
		imagCorredorEnano.setHorizontalAlignment(SwingConstants.CENTER);
		imagCorredorEnano.setBounds(323, 10, 149, 157);
		imagCorredorEnano.setIcon(new ImageIcon("CorredorEnano.jpg"));
		add(imagCorredorEnano);
		
		JLabel imagMataTrolls = new JLabel("");
		imagMataTrolls.setHorizontalAlignment(SwingConstants.CENTER);
		imagMataTrolls.setBounds(21, 252, 186, 211);
		imagMataTrolls.setIcon(new ImageIcon("MataTrolls.jpg"));
		add(imagMataTrolls);
		
		JLabel imagApisonadora = new JLabel("");
		imagApisonadora.setHorizontalAlignment(SwingConstants.CENTER);
		imagApisonadora.setBounds(253, 252, 195, 211);
		imagApisonadora.setIcon(new ImageIcon("Apisonadora.jpg"));
		add(imagApisonadora);
		
	}
}
