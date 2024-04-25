import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class ControlEscolar {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1, textField_2;
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
		
		//this.login(frame);
		//this.registro(frame);
		this.panelAlumnos(frame);
		//this.panelDocentes(frame);
		
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
	
	public void registro(JFrame frame) {
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.decode("#EFEFEF"));
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(210, 103, 500, 500);
		panel_1.setBackground(Color.decode("#D4CFD5"));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre(s)");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(53, 76, 100, 13);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(50, 108, 400, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(53, 160, 100, 30);
		panel_1.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("Correo");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(50, 255, 100, 21);
		panel_1.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(50, 286, 400, 20);
		panel_1.add(textField_2);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(53, 430, 400, 21);
		btnNewButton.setBackground(Color.decode("#E47E38"));
		panel_1.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(50, 196, 400, 20);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_4 = new JLabel("Contraseña");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setBounds(53, 341, 100, 13);
		panel_1.add(lblNewLabel_4);
		
		JPasswordField passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(50, 376, 400, 20);
		panel_1.add(passwordField_1);
		
		JLabel lblNewLabel_5 = new JLabel("Registro");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_5.setForeground(Color.decode("#E47E38"));
		lblNewLabel_5.setBounds(380, 20,300, 100);
		panel.add(lblNewLabel_5);
	}
	
	public void panelAlumnos(JFrame frame) {
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.decode("#EFEFEF"));
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 918, 40);
		menuBar.setBackground(Color.decode("#E47E38"));
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JLabel lblNewLabel_6 = new JLabel("Hola Alumno");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_6.setBounds(365, 50, 197, 100);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("¿Qué desea hacer hoy?");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(375, 128, 147, 40);
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(77, 194, 190, 188);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_1.setLayout(null);
		panel.add(panel_1);
		
		ImageIcon imagenDescargar = new ImageIcon("descarga.png");
		JButton botonDescargar = new JButton();
		botonDescargar.setBounds(0, 0, 190, 140);
		botonDescargar.setIcon(imagenDescargar);
		panel_1.add(botonDescargar);
		
		JLabel lblNewLabel_8 = new JLabel("Descargar Información");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_8.setBounds(20, 155, 200, 13);
		panel_1.add(lblNewLabel_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(360, 194, 190, 188);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_2.setLayout(null);
		panel.add(panel_2);
		
		JButton botonConsultar = new JButton();
		botonConsultar.setBounds(0, 0, 190, 140);
		panel_2.add(botonConsultar);
		
		JLabel lblNewLabel_9 = new JLabel("Consultar");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_9.setBounds(55, 155, 200, 13);
		panel_2.add(lblNewLabel_9);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_3.setBounds(646, 194, 190, 188);
		panel_3.setLayout(null);
		panel.add(panel_3);
		
		JButton botonCrear = new JButton();
		botonCrear.setBounds(0, 0, 190, 140);
		panel_3.add(botonCrear);
		
		JLabel lblNewLabel_10 = new JLabel("Crear");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_10.setBounds(70, 155, 45, 13);
		panel_3.add(lblNewLabel_10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_4.setBounds(208, 437, 190, 188);
		panel.add(panel_4);
		
		JButton botonEditar = new JButton();
		botonEditar.setBounds(0, 0, 190, 140);
		panel_4.add(botonEditar);
		
		JLabel lblNewLabel_11 = new JLabel("Editar");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_11.setBounds(70, 155, 45, 13);
		panel_4.add(lblNewLabel_11);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_5.setBounds(498, 437, 190, 188);
		panel.add(panel_5);
		
		JButton botonEliminar = new JButton();
		botonEliminar.setBounds(0, 0, 190, 140);
		panel_5.add(botonEliminar);
		
		JLabel lblNewLabel_12 = new JLabel("Eliminar");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_12.setBounds(60, 155, 100, 13);
		panel_5.add(lblNewLabel_12);
	}
	
	public void panelDocentes(JFrame frame) {
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.decode("#EFEFEF"));
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 918, 40);
		menuBar.setBackground(Color.decode("#E47E38"));
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);
		
		JLabel lblNewLabel_6 = new JLabel("Hola Docente");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_6.setBounds(365, 50, 197, 100);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("¿Qué desea hacer hoy?");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(375, 128, 147, 40);
		panel.add(lblNewLabel_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(77, 194, 190, 188);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_1.setLayout(null);
		panel.add(panel_1);
		
		ImageIcon imagenDescargar = new ImageIcon("descarga.png");
		JButton botonDescargar = new JButton();
		botonDescargar.setBounds(0, 0, 190, 140);
		botonDescargar.setIcon(imagenDescargar);
		panel_1.add(botonDescargar);
		
		JLabel lblNewLabel_8 = new JLabel("Descargar Información");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_8.setBounds(20, 155, 200, 13);
		panel_1.add(lblNewLabel_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(360, 194, 190, 188);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_2.setLayout(null);
		panel.add(panel_2);
		
		JButton botonConsultar = new JButton();
		botonConsultar.setBounds(0, 0, 190, 140);
		panel_2.add(botonConsultar);
		
		JLabel lblNewLabel_9 = new JLabel("Consultar");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_9.setBounds(55, 155, 200, 13);
		panel_2.add(lblNewLabel_9);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_3.setBounds(646, 194, 190, 188);
		panel_3.setLayout(null);
		panel.add(panel_3);
		
		JButton botonCrear = new JButton();
		botonCrear.setBounds(0, 0, 190, 140);
		panel_3.add(botonCrear);
		
		JLabel lblNewLabel_10 = new JLabel("Crear");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_10.setBounds(70, 155, 45, 13);
		panel_3.add(lblNewLabel_10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_4.setBounds(208, 437, 190, 188);
		panel.add(panel_4);
		
		JButton botonEditar = new JButton();
		botonEditar.setBounds(0, 0, 190, 140);
		panel_4.add(botonEditar);
		
		JLabel lblNewLabel_11 = new JLabel("Editar");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_11.setBounds(70, 155, 45, 13);
		panel_4.add(lblNewLabel_11);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_5.setBounds(498, 437, 190, 188);
		panel.add(panel_5);
		
		JButton botonEliminar = new JButton();
		botonEliminar.setBounds(0, 0, 190, 140);
		panel_5.add(botonEliminar);
		
		JLabel lblNewLabel_12 = new JLabel("Eliminar");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_12.setBounds(60, 155, 100, 13);
		panel_5.add(lblNewLabel_12);
	}
}
