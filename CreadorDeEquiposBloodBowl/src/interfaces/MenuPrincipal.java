package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MenuPrincipal extends JPanel{
	public MenuPrincipal() {
		setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Crear Equipo");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("Jugar Partido");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(btnNewButton_1, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("Menu Principal");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
	}

}
