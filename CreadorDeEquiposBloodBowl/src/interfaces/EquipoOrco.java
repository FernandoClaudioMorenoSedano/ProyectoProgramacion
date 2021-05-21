package interfaces;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EquipoOrco extends JPanel{
	public EquipoOrco() {
		setLayout(null);
		
		JSpinner lineaOrco = new JSpinner();
		lineaOrco.setModel(new SpinnerNumberModel(0, 0, 16, 1));
		lineaOrco.setBounds(60, 210, 30, 20);
		add(lineaOrco);
		
		JLabel lblNewLabel = new JLabel("Linea Orco");
		lblNewLabel.setBounds(56, 180, 49, 20);
		add(lblNewLabel);
		
		JSpinner blizterOrco = new JSpinner();
		blizterOrco.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		blizterOrco.setBounds(232, 210, 30, 20);
		add(blizterOrco);
		
		JLabel lblNewLabel_1 = new JLabel("Blizter Orco");
		lblNewLabel_1.setBounds(218, 184, 69, 13);
		add(lblNewLabel_1);
		
		JSpinner lanzadorOrco = new JSpinner();
		lanzadorOrco.setModel(new SpinnerNumberModel(0, 0, 2, 1));
		lanzadorOrco.setBounds(377, 210, 30, 20);
		add(lanzadorOrco);
		
		JLabel lblNewLabel_2 = new JLabel("Lanzador Orco");
		lblNewLabel_2.setBounds(354, 184, 82, 13);
		add(lblNewLabel_2);
		
		JSpinner orcoNegro = new JSpinner();
		orcoNegro.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		orcoNegro.setBounds(60, 431, 30, 20);
		add(orcoNegro);
		
		JLabel lblNewLabel_3 = new JLabel("Orco Negro");
		lblNewLabel_3.setBounds(45, 408, 60, 13);
		add(lblNewLabel_3);
		
		JSpinner troll = new JSpinner();
		troll.setModel(new SpinnerNumberModel(0, 0, 1, 1));
		troll.setBounds(232, 431, 30, 20);
		add(troll);
		
		JLabel lblNewLabel_4 = new JLabel("Troll");
		lblNewLabel_4.setBounds(232, 408, 30, 13);
		add(lblNewLabel_4);
		
		JSpinner goblin = new JSpinner();
		goblin.setModel(new SpinnerNumberModel(0, 0, 4, 1));
		goblin.setBounds(377, 431, 30, 20);
		add(goblin);
		
		JLabel lblNewLabel_5 = new JLabel("Goblin");
		lblNewLabel_5.setBounds(377, 408, 35, 13);
		add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((int)lineaOrco.getValue()+
				(int)blizterOrco.getValue()+
				(int)lanzadorOrco.getValue()+
				(int)orcoNegro.getValue()>16) {
					
				}
				troll.setValue(troll);
				goblin.setValue(goblin);
					
				}
			}
		});
		btnNewButton.setBounds(377, 569, 85, 21);
		add(btnNewButton);
	}
}


