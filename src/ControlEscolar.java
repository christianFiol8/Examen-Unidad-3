import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class ControlEscolar {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlEscolar window = new ControlEscolar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ControlEscolar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 932, 760);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.login(frame);
		
	}
	
	
	//Panel de login
	public void login(JFrame frame) {
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.decode("#EFEFEF"));
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(210, 103, 500, 500);
		panel_1.setBackground(Color.decode("#D4CFD5"));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Correo");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(53, 76, 100, 13);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(50, 108, 400, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(53, 160, 100, 13);
		panel_1.add(lblNewLabel_2);
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Recordarme");
		chckbxNewCheckBox.setBounds(50, 245, 100, 21);
		chckbxNewCheckBox.setOpaque(false);
		panel_1.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(53, 301, 400, 21);
		btnNewButton.setBackground(Color.decode("#E47E38"));
		panel_1.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(50, 196, 400, 20);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Inicio de Sesión");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.decode("#E47E38"));
		lblNewLabel.setBounds(330, 20,300, 100);
		panel.add(lblNewLabel);
		
	}
}
