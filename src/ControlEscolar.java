import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class ControlEscolar {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1, textField_2;
	private JPasswordField passwordField;
	
	JButton botonDocente;
	JButton botonAlumno;

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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 932, 22);
		menuBar.setBackground(Color.decode("#E09923"));
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cuenta");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cerrar Sesión");
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				logout(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		
		JMenu mnNewMenu_1 = new JMenu("Alumnos");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Docentes");
		menuBar.add(mnNewMenu_2);
		
		//this.seleccionPerfil(frame);
		//this.login(frame);
		//this.registroAlumno(frame);
		//this.registroDocente(frame);
		//this.panelAlumnos(frame);
		this.panelDocentes(frame);
		//this.consultarAlumno(frame);
		//this.logout(frame);
		//this.consultarDocente(frame);
		//this.editarAlumno(frame);
		//this.editarDocente(frame);
		//this.borrarAlumno(frame);
		//this.crearAlumno(frame);
		//this.descargarAlumno(frame);
		
	}
	
	public void seleccionPerfil(JFrame frame) {
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("Seleccione Perfil");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_16.setBounds(330, 50, 300, 100);
		panel.add(lblNewLabel_16);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(250, 194, 190, 188);
		panel_1.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_1.setLayout(null);
		panel.add(panel_1);
		
		ImageIcon imagenAlumno = new ImageIcon(getClass().getResource("/Imagenes/students.png"));
		botonAlumno = new JButton(imagenAlumno);
		botonAlumno.setBounds(0, 0, 190, 140);
		botonAlumno.setBackground(Color.white);
		botonAlumno.setIcon(imagenAlumno);
		panel_1.add(botonAlumno);
		botonAlumno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				login(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		
		JLabel lblNewLabel_1 = new JLabel("Alumno");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(60, 155, 200, 13);
		panel_1.add(lblNewLabel_1);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(500, 194, 190, 188);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_2.setLayout(null);
		panel.add(panel_2);
		
		ImageIcon imagenDocente = new ImageIcon(getClass().getResource("/Imagenes/teacher.png"));
		botonDocente = new JButton(imagenDocente);
		botonDocente.setBounds(0, 0, 190, 140);
		botonDocente.setBackground(Color.white);
		botonDocente.setIcon(imagenDocente);
		botonDocente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				login(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel_2.add(botonDocente);
		
		JLabel lblNewLabel_2 = new JLabel("Docente");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(60, 155, 200, 13);
		panel_2.add(lblNewLabel_2);
	}
	
	
	//Panel de login
	public void login(JFrame frame) {
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.decode("#3D4CFD5"));
		panel.setLayout(null);
		

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(60, 103, 500, 500);
		panel_1.setBackground(new Color(255, 255, 255));
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(560, 103, 290, 500);
		panel_2.setBackground(Color.decode("#E09923"));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al Control Escolar");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(20, 76, 300, 20);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_20 = new JLabel("¿Aún no tienes cuenta?");
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_20.setBounds(70, 250, 150, 20);
		panel_2.add(lblNewLabel_20);
		
		JButton btnNewButton_2 = new JButton("Registrarse como Alumno");
		btnNewButton_2.setBounds(20, 301, 250, 21);
		
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				registroAlumno(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Registrarse como docente");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cambiarPantalla();
				registroDocente(frame);
				frame.revalidate();
				frame.repaint();
				
			}
			
		});
		btnNewButton_3.setBounds(20, 343, 250, 21);
		panel_2.add(btnNewButton_3);
		
		
		
			
		
	}
	
	//Panel de registro
	public void registroAlumno(JFrame frame) {
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
		
		JLabel lblNewLabel_5 = new JLabel("Registro Alumnos");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_5.setForeground(Color.decode("#E47E38"));
		lblNewLabel_5.setBounds(300, 20,400, 100);
		panel.add(lblNewLabel_5);
	}
	
	public void registroDocente(JFrame frame) {
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
		
		JLabel lblNewLabel_5 = new JLabel("Registro Docente");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_5.setForeground(Color.decode("#E47E38"));
		lblNewLabel_5.setBounds(300, 20,400, 100);
		panel.add(lblNewLabel_5);
	}
	
	
	//Panel de alumnos
	public void panelAlumnos(JFrame frame) {
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.decode("#F1EEE9"));
		panel.setLayout(null);
		
		/*JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 918, 40);
		menuBar.setBackground(Color.decode("#E47E38"));
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Inicio");
		menuBar.add(mnNewMenu);*/
		
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
		
		ImageIcon imagenDescargar = new ImageIcon(getClass().getResource("/Imagenes/download_10696784.png"));
		JButton botonDescargar = new JButton(imagenDescargar);
		botonDescargar.setBounds(0, 0, 190, 140);
		botonDescargar.setBackground(Color.decode("#EFEFEF"));
		botonDescargar.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		botonDescargar.setIcon(imagenDescargar);
		botonDescargar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				descargarAlumno(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
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
		
		ImageIcon imagenConsultar = new ImageIcon(getClass().getResource("/Imagenes/IconoConsultar.png"));
		JButton botonConsultar = new JButton(imagenConsultar);
		botonConsultar.setBackground(Color.decode("#EFEFEF"));
		botonConsultar.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		botonConsultar.setBounds(0, 0, 190, 140);
		panel_2.add(botonConsultar);
		botonConsultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				consultarAlumno(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		
		JLabel lblNewLabel_9 = new JLabel("Consultar");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_9.setBounds(55, 155, 200, 13);
		panel_2.add(lblNewLabel_9);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_3.setBounds(646, 194, 190, 188);
		panel_3.setLayout(null);
		panel.add(panel_3);
		
		ImageIcon imagenCrear = new ImageIcon(getClass().getResource("/Imagenes/IconoCrear.png"));
		JButton botonCrear = new JButton(imagenCrear);
		botonCrear.setBackground(Color.decode("#EFEFEF"));
		botonCrear.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		botonCrear.setBounds(0, 0, 190, 140);
		botonCrear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				crearAlumno(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
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
		
		ImageIcon imagenEditar = new ImageIcon(getClass().getResource("/Imagenes/IconoEditar.png"));
		JButton botonEditar = new JButton(imagenEditar);
		botonEditar.setBackground(Color.decode("#EFEFEF"));
		botonEditar.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		botonEditar.setBounds(0, 0, 190, 140);
		
		botonEditar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				editarAlumno(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		
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
		
		ImageIcon imagenEliminar = new ImageIcon(getClass().getResource("/Imagenes/BorrarIcono.png"));
		JButton botonEliminar = new JButton(imagenEliminar);
		botonEliminar.setBackground(Color.decode("#EFEFEF"));
		botonEliminar.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		botonEliminar.setBounds(0, 0, 190, 140);
		botonEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				borrarAlumno(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
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
		
		ImageIcon imagenDescargar = new ImageIcon(getClass().getResource("/Imagenes/download_10696784.png"));
		JButton botonDescargar = new JButton(imagenDescargar);
		botonDescargar.setBounds(0, 0, 190, 140);
		botonDescargar.setBackground(Color.decode("#EFEFEF"));
		botonDescargar.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		botonDescargar.setIcon(imagenDescargar);
		botonDescargar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				descargarDocente(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
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
		
		ImageIcon imagenConsultar = new ImageIcon(getClass().getResource("/Imagenes/IconoConsultar.png"));
		JButton botonConsultar = new JButton(imagenConsultar);
		botonConsultar.setBackground(Color.decode("#EFEFEF"));
		botonConsultar.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		botonConsultar.setBounds(0, 0, 190, 140);
		botonConsultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				consultarDocente(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
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
		
		ImageIcon imagenCrear = new ImageIcon(getClass().getResource("/Imagenes/IconoCrear.png"));
		JButton botonCrear = new JButton(imagenCrear);
		botonCrear.setBackground(Color.decode("#EFEFEF"));
		botonCrear.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		botonCrear.setBounds(0, 0, 190, 140);
		botonCrear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				crearDocente(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
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
		
		ImageIcon imagenEditar = new ImageIcon(getClass().getResource("/Imagenes/IconoEditar.png"));
		JButton botonEditar = new JButton(imagenEditar);
		botonEditar.setBackground(Color.decode("#EFEFEF"));
		botonEditar.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		botonEditar.setBounds(0, 0, 190, 140);
		botonEditar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				editarDocente(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
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
		
		ImageIcon imagenEliminar = new ImageIcon(getClass().getResource("/Imagenes/BorrarIcono.png"));
		JButton botonEliminar = new JButton(imagenEliminar);
		botonEliminar.setBackground(Color.decode("#EFEFEF"));
		botonEliminar.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		botonEliminar.setBounds(0, 0, 190, 140);
		botonEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				eliminarDocente(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel_5.add(botonEliminar);
		
		JLabel lblNewLabel_12 = new JLabel("Eliminar");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_12.setBounds(60, 155, 100, 13);
		panel_5.add(lblNewLabel_12);
	}
	
	public void consultarAlumno(JFrame frame) {


		JPanel panel12 = new JPanel();
		frame.getContentPane().add(panel12, BorderLayout.CENTER);
		panel12.setBackground(Color.decode("#EFEFEF"));
		panel12.setLayout(null);
	
		JLabel lblNewLabel_8 = new JLabel("Consulta de alumnos");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_8.setBounds(20, 30, 300, 100);
		panel12.add(lblNewLabel_8);
		
		JPanel panel_44 = new JPanel();
		panel_44.setLayout(null);
		panel_44.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_44.setBounds(20, 130, 880, 400);
		panel12.add(panel_44);
		
		JLabel lblNewLabel_9 = new JLabel("Apellido paterno");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(70, 30, 170, 40);
		panel_44.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setBounds(250, 40, 250, 25);
		panel_44.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Apellido materno");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_10.setBounds(63, 90, 190, 40);
		panel_44.add(lblNewLabel_10);
		
		JTextField textField4 = new JTextField();
		textField4.setBounds(250, 100, 250, 25);
		panel_44.add(textField4);
		textField4.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Nombre");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(155, 150, 190, 40);
		panel_44.add(lblNewLabel_15);
		
		JTextField textField8 = new JTextField();
		textField8.setBounds(250, 160, 250, 25);
		panel_44.add(textField8);
		textField8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Fecha de nacimiento");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(30, 210, 220, 40);
		panel_44.add(lblNewLabel_11);
		
		JTextField textField5 = new JTextField();
		textField5.setBounds(250, 220, 250, 25);
		panel_44.add(textField5);
		textField5.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Correo electronico");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(50, 270, 200, 40);
		panel_44.add(lblNewLabel_12);
		
		JTextField textField6 = new JTextField();
		textField6.setBounds(250, 280, 250, 25);
		panel_44.add(textField6);
		textField6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Telefono");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(145, 330, 147, 40);
		panel_44.add(lblNewLabel_13);
		
		JTextField textField7 = new JTextField();
		textField7.setBounds(250, 340, 250, 25);
		panel_44.add(textField7);
		textField7.setColumns(10);
		
		ImageIcon camara = new ImageIcon(getClass().getResource("/Imagenes/CamaraIcono.png"));
		JLabel lblNewLabel_14 = new JLabel("Fotografia del alumno");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_14.setIcon(camara);
		lblNewLabel_14.setBounds(575, 30, 270, 40);
		panel_44.add(lblNewLabel_14);
		
		ImageIcon imagenUsuario = new ImageIcon(getClass().getResource("/Imagenes/IconoFoto.png"));
		JButton botonDescargar = new JButton(imagenUsuario);
		botonDescargar.setOpaque(true);
		botonDescargar.setBackground(Color.white);
		botonDescargar.setBounds(580, 100, 256, 256);
		panel_44.add(botonDescargar);
		
		ImageIcon imagenIconoBotonVolver = new ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"));
		RoundedButton roundedButton2 = new RoundedButton(imagenIconoBotonVolver ,"Regresar", 45, Color.decode("#FF5733"));
		roundedButton2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton2.setBounds(335, 570, 250, 50);
		roundedButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				panelAlumnos(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel12.add(roundedButton2);
	}
	
	public void editarAlumno(JFrame frame) {


		JPanel panel12 = new JPanel();
		frame.getContentPane().add(panel12, BorderLayout.CENTER);
		panel12.setBackground(Color.decode("#EFEFEF"));
		panel12.setLayout(null);
	
		JLabel lblNewLabel_8 = new JLabel("Editar datos de alumno");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_8.setBounds(20, 30, 340, 100);
		panel12.add(lblNewLabel_8);
		
		JPanel panel_44 = new JPanel();
		panel_44.setLayout(null);
		panel_44.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_44.setBounds(20, 130, 880, 400);
		panel12.add(panel_44);
		
		JLabel lblNewLabel_9 = new JLabel("Apellido paterno");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(70, 30, 170, 40);
		panel_44.add(lblNewLabel_9);
		
		JTextField textField = new JTextField();
		textField.setBounds(250, 40, 250, 25);
		textField.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaALetras(evt, textField, 20);
		    }

		});
		panel_44.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Apellido materno");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_10.setBounds(63, 90, 190, 40);
		panel_44.add(lblNewLabel_10);
		
		JTextField textField4 = new JTextField();
		textField4.setBounds(250, 100, 250, 25);
		textField4.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaALetras(evt, textField4, 20);
		    }

		});
		panel_44.add(textField4);
		textField4.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Nombre");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(155, 150, 190, 40);
		panel_44.add(lblNewLabel_15);
		
		JTextField textField8 = new JTextField();
		textField8.setBounds(250, 160, 250, 25);
		textField8.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaALetras(evt, textField8, 30);
		    }

		});
		panel_44.add(textField8);
		textField8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Fecha de nacimiento");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(30, 210, 220, 40);
		panel_44.add(lblNewLabel_11);
		
		JTextField textField5 = new JTextField();
		textField5.setBounds(250, 220, 250, 25);
		textField5.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaCaracteres(evt, textField5, 30);
		    }

		});
		panel_44.add(textField5);
		textField5.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Correo electronico");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(50, 270, 200, 40);
		panel_44.add(lblNewLabel_12);
		
		JTextField textField6 = new JTextField();
		textField6.setBounds(250, 280, 250, 25);
		textField6.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaCaracteres(evt, textField6, 50);
		    }

		});
		panel_44.add(textField6);
		textField6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Telefono");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(145, 330, 147, 40);
		
		panel_44.add(lblNewLabel_13);
		
		JTextField textField7 = new JTextField();
		textField7.setBounds(250, 340, 250, 25);
		textField7.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaANumeros(evt, textField7, 10);
		    }

		});
		panel_44.add(textField7);
		textField7.setColumns(10);
		
		ImageIcon camara = new ImageIcon(getClass().getResource("/Imagenes/CamaraIcono.png"));
		JLabel lblNewLabel_14 = new JLabel("Fotografia del alumno");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_14.setIcon(camara);
		lblNewLabel_14.setBounds(575, 30, 270, 40);
		panel_44.add(lblNewLabel_14);
		
		ImageIcon imagenUsuario = new ImageIcon(getClass().getResource("/Imagenes/IconoFoto.png"));
		JButton botonDescargar = new JButton(imagenUsuario);
		botonDescargar.setOpaque(true);
		botonDescargar.setBackground(Color.white);
		botonDescargar.setBounds(580, 100, 256, 256);
		panel_44.add(botonDescargar);
		
		ImageIcon imagenIconoBotonEditar = new ImageIcon(getClass().getResource("/Imagenes/IconoBotonEditar.png"));
		RoundedButton roundedButton = new RoundedButton(imagenIconoBotonEditar ,"Editar datos", 45, Color.decode("#FF5733"));
		roundedButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton.setBounds(200, 570, 250, 50);
		panel12.add(roundedButton);
		
		ImageIcon imagenIconoBotonVolver = new ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"));
		RoundedButton roundedButton2 = new RoundedButton(imagenIconoBotonVolver ,"Regresar", 45, Color.decode("#FF5733"));
		roundedButton2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton2.setBounds(470, 570, 250, 50);
		roundedButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				panelAlumnos(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel12.add(roundedButton2);
		
		
	}
	
	public void borrarAlumno(JFrame frame) {


		JPanel panel12 = new JPanel();
		frame.getContentPane().add(panel12, BorderLayout.CENTER);
		panel12.setBackground(Color.decode("#EFEFEF"));
		panel12.setLayout(null);
	
		JLabel lblNewLabel_8 = new JLabel("Eliminar datos de alumno");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_8.setBounds(20, 30, 340, 100);
		panel12.add(lblNewLabel_8);
		
		JPanel panel_44 = new JPanel();
		panel_44.setLayout(null);
		panel_44.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_44.setBounds(20, 130, 880, 400);
		panel12.add(panel_44);
		
		JLabel lblNewLabel_9 = new JLabel("Apellido paterno");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(70, 30, 170, 40);
		panel_44.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setBounds(250, 40, 250, 25);
		panel_44.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Apellido materno");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_10.setBounds(63, 90, 190, 40);
		panel_44.add(lblNewLabel_10);
		
		JTextField textField4 = new JTextField();
		textField4.setBounds(250, 100, 250, 25);
		panel_44.add(textField4);
		textField4.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Nombre");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(155, 150, 190, 40);
		panel_44.add(lblNewLabel_15);
		
		JTextField textField8 = new JTextField();
		textField8.setBounds(250, 160, 250, 25);
		panel_44.add(textField8);
		textField8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Fecha de nacimiento");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(30, 210, 220, 40);
		panel_44.add(lblNewLabel_11);
		
		JTextField textField5 = new JTextField();
		textField5.setBounds(250, 220, 250, 25);
		panel_44.add(textField5);
		textField5.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Correo electronico");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(50, 270, 200, 40);
		panel_44.add(lblNewLabel_12);
		
		JTextField textField6 = new JTextField();
		textField6.setBounds(250, 280, 250, 25);
		panel_44.add(textField6);
		textField6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Telefono");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(145, 330, 147, 40);
		panel_44.add(lblNewLabel_13);
		
		JTextField textField7 = new JTextField();
		textField7.setBounds(250, 340, 250, 25);
		panel_44.add(textField7);
		textField7.setColumns(10);
		
		ImageIcon camara = new ImageIcon(getClass().getResource("/Imagenes/CamaraIcono.png"));
		JLabel lblNewLabel_14 = new JLabel("Fotografia del alumno");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_14.setIcon(camara);
		lblNewLabel_14.setBounds(575, 30, 270, 40);
		panel_44.add(lblNewLabel_14);
		
		ImageIcon imagenUsuario = new ImageIcon(getClass().getResource("/Imagenes/IconoFoto.png"));
		JButton botonDescargar = new JButton(imagenUsuario);
		botonDescargar.setOpaque(true);
		botonDescargar.setBackground(Color.white);
		botonDescargar.setBounds(580, 100, 256, 256);
		panel_44.add(botonDescargar);
		
		ImageIcon imagenIconoBotonBorrar = new ImageIcon(getClass().getResource("/Imagenes/BotonIconoBorrar.png"));
		RoundedButton roundedButton = new RoundedButton(imagenIconoBotonBorrar ,"Borrar datos", 45, Color.decode("#FF5733"));
		roundedButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton.setBounds(200, 570, 250, 50);
		panel12.add(roundedButton);
		
		ImageIcon imagenIconoBotonVolver = new ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"));
		RoundedButton roundedButton2 = new RoundedButton(imagenIconoBotonVolver ,"Regresar", 45, Color.decode("#FF5733"));
		roundedButton2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton2.setBounds(470, 570, 250, 50);
		roundedButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				panelAlumnos(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel12.add(roundedButton2);
		
		
	}
	
	public void crearAlumno(JFrame frame) {


		JPanel panel12 = new JPanel();
		frame.getContentPane().add(panel12, BorderLayout.CENTER);
		panel12.setBackground(Color.decode("#EFEFEF"));
		panel12.setLayout(null);
	
		JLabel lblNewLabel_8 = new JLabel("Crear datos de alumno");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_8.setBounds(20, 30, 340, 100);
		panel12.add(lblNewLabel_8);
		
		JPanel panel_44 = new JPanel();
		panel_44.setLayout(null);
		panel_44.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_44.setBounds(20, 130, 880, 400);
		panel12.add(panel_44);
		
		JLabel lblNewLabel_9 = new JLabel("Apellido paterno");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(70, 30, 170, 40);
		panel_44.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setBounds(250, 40, 250, 25);
		panel_44.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Apellido materno");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_10.setBounds(63, 90, 190, 40);
		panel_44.add(lblNewLabel_10);
		
		JTextField textField4 = new JTextField();
		textField4.setBounds(250, 100, 250, 25);
		panel_44.add(textField4);
		textField4.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Nombre");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(155, 150, 190, 40);
		panel_44.add(lblNewLabel_15);
		
		JTextField textField8 = new JTextField();
		textField8.setBounds(250, 160, 250, 25);
		panel_44.add(textField8);
		textField8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Fecha de nacimiento");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(30, 210, 220, 40);
		panel_44.add(lblNewLabel_11);
		
		JTextField textField5 = new JTextField();
		textField5.setBounds(250, 220, 250, 25);
		panel_44.add(textField5);
		textField5.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Correo electronico");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(50, 270, 200, 40);
		panel_44.add(lblNewLabel_12);
		
		JTextField textField6 = new JTextField();
		textField6.setBounds(250, 280, 250, 25);
		panel_44.add(textField6);
		textField6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Telefono");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(145, 330, 147, 40);
		panel_44.add(lblNewLabel_13);
		
		JTextField textField7 = new JTextField();
		textField7.setBounds(250, 340, 250, 25);
		panel_44.add(textField7);
		textField7.setColumns(10);
		
		ImageIcon camara = new ImageIcon(getClass().getResource("/Imagenes/CamaraIcono.png"));
		JLabel lblNewLabel_14 = new JLabel("Fotografia del alumno");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_14.setIcon(camara);
		lblNewLabel_14.setBounds(575, 30, 270, 40);
		panel_44.add(lblNewLabel_14);
		
		ImageIcon imagenUsuario = new ImageIcon(getClass().getResource("/Imagenes/IconoFoto.png"));
		JButton botonDescargar = new JButton(imagenUsuario);
		botonDescargar.setOpaque(true);
		botonDescargar.setBackground(Color.white);
		botonDescargar.setBounds(580, 100, 256, 256);
		panel_44.add(botonDescargar);
		
		ImageIcon imagenIconoBotonCrear = new ImageIcon(getClass().getResource("/Imagenes/IconoBotonCrear.png"));
		RoundedButton roundedButton = new RoundedButton(imagenIconoBotonCrear ,"Crear datos", 45, Color.decode("#FF5733"));
		roundedButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton.setBounds(200, 570, 250, 50);
		panel12.add(roundedButton);
		
		ImageIcon imagenIconoBotonVolver = new ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"));
		RoundedButton roundedButton2 = new RoundedButton(imagenIconoBotonVolver ,"Regresar", 45, Color.decode("#FF5733"));
		roundedButton2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton2.setBounds(470, 570, 250, 50);
		roundedButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				panelAlumnos(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel12.add(roundedButton2);
		
		
	}
	
	public void descargarAlumno(JFrame frame) {


		JPanel panel12 = new JPanel();
		frame.getContentPane().add(panel12, BorderLayout.CENTER);
		panel12.setBackground(Color.decode("#EFEFEF"));
		panel12.setLayout(null);
	
		JLabel lblNewLabel_8 = new JLabel("Descargar datos de alumno");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_8.setBounds(20, 30, 370, 100);
		panel12.add(lblNewLabel_8);
		
		JPanel panel_44 = new JPanel();
		panel_44.setLayout(null);
		panel_44.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_44.setBounds(20, 130, 880, 400);
		panel12.add(panel_44);
		
		JLabel lblNewLabel_9 = new JLabel("Apellido paterno");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(70, 30, 170, 40);
		panel_44.add(lblNewLabel_9);
		
		textField = new JTextField();
		textField.setBounds(250, 40, 250, 25);
		panel_44.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Apellido materno");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_10.setBounds(63, 90, 190, 40);
		panel_44.add(lblNewLabel_10);
		
		JTextField textField4 = new JTextField();
		textField4.setBounds(250, 100, 250, 25);
		panel_44.add(textField4);
		textField4.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Nombre");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(155, 150, 190, 40);
		panel_44.add(lblNewLabel_15);
		
		JTextField textField8 = new JTextField();
		textField8.setBounds(250, 160, 250, 25);
		panel_44.add(textField8);
		textField8.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Fecha de nacimiento");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(30, 210, 220, 40);
		panel_44.add(lblNewLabel_11);
		
		JTextField textField5 = new JTextField();
		textField5.setBounds(250, 220, 250, 25);
		panel_44.add(textField5);
		textField5.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Correo electronico");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(50, 270, 200, 40);
		panel_44.add(lblNewLabel_12);
		
		JTextField textField6 = new JTextField();
		textField6.setBounds(250, 280, 250, 25);
		panel_44.add(textField6);
		textField6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Telefono");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(145, 330, 147, 40);
		panel_44.add(lblNewLabel_13);
		
		JTextField textField7 = new JTextField();
		textField7.setBounds(250, 340, 250, 25);
		panel_44.add(textField7);
		textField7.setColumns(10);
		
		ImageIcon camara = new ImageIcon(getClass().getResource("/Imagenes/CamaraIcono.png"));
		JLabel lblNewLabel_14 = new JLabel("Fotografia del alumno");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_14.setIcon(camara);
		lblNewLabel_14.setBounds(575, 30, 270, 40);
		panel_44.add(lblNewLabel_14);
		
		ImageIcon imagenUsuario = new ImageIcon(getClass().getResource("/Imagenes/IconoFoto.png"));
		JButton botonDescargar = new JButton(imagenUsuario);
		botonDescargar.setOpaque(true);
		botonDescargar.setBackground(Color.white);
		botonDescargar.setBounds(580, 100, 256, 256);
		panel_44.add(botonDescargar);
		
		ImageIcon imagenIconoBotonDescargar = new ImageIcon(getClass().getResource("/Imagenes/IconoBotonDescargar.png"));
		RoundedButton roundedButton = new RoundedButton(imagenIconoBotonDescargar ,"Descargar", 45, Color.decode("#FF5733"));
		roundedButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton.setBounds(200, 570, 250, 50);
		panel12.add(roundedButton);
		
		ImageIcon imagenIconoBotonVolver = new ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"));
		RoundedButton roundedButton2 = new RoundedButton(imagenIconoBotonVolver ,"Regresar", 45, Color.decode("#FF5733"));
		roundedButton2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton2.setBounds(470, 570, 250, 50);
		roundedButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				panelAlumnos(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel12.add(roundedButton2);
		
		
	}
	
	public void editarDocente(JFrame frame) {
		
		JPanel panel13 = new JPanel();
		frame.getContentPane().add(panel13, BorderLayout.CENTER);
		panel13.setBackground(Color.decode("#EFEFEF"));
		panel13.setLayout(null);
		
		
		JLabel lblNewLabel_18 = new JLabel("Editar datos de docente");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_18.setBounds(20, 30, 340, 100);
		panel13.add(lblNewLabel_18);
		
		JPanel panel_45 = new JPanel();
		panel_45.setLayout(null);
		panel_45.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_45.setBounds(20, 130, 880, 460);
		panel13.add(panel_45);
		
		JLabel lblNewLabel_19 = new JLabel("Apellido paterno");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_19.setBounds(70, 30, 170, 40);
		panel_45.add(lblNewLabel_19);
		
		textField = new JTextField();
		textField.setBounds(250, 40, 250, 25);
		textField.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaALetras(evt, textField, 20);
		    }

		});
		panel_45.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Apellido materno");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(63, 90, 190, 40);
		panel_45.add(lblNewLabel_11);
		
		JTextField textField14 = new JTextField();
		textField14.setBounds(250, 100, 250, 25);
		textField14.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaALetras(evt, textField14, 20);
		    }

		});
		panel_45.add(textField14);
		textField14.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Nombre");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_16.setBounds(155, 150, 190, 40);
		panel_45.add(lblNewLabel_16);
		
		JTextField textField8 = new JTextField();
		textField8.setBounds(250, 160, 250, 25);
		textField8.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaALetras(evt, textField8, 30);
		    }

		});
		panel_45.add(textField8);
		textField8.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Fecha de nacimiento");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_17.setBounds(30, 210, 220, 40);
		panel_45.add(lblNewLabel_17);
		
		JTextField textField9 = new JTextField();
		textField9.setBounds(250, 220, 250, 25);
		textField9.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaCaracteres(evt, textField9, 30);
		    }

		});
		panel_45.add(textField9);
		textField9.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Correo electronico");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(50, 270, 200, 40);
		panel_45.add(lblNewLabel_12);
		
		JTextField textField6 = new JTextField();
		textField6.setBounds(250, 280, 250, 25);
		textField6.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaCaracteres(evt, textField6, 50);
		    }

		});
		panel_45.add(textField6);
		textField6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Telefono");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(145, 330, 147, 40);
		panel_45.add(lblNewLabel_13);
		
		JTextField textField7 = new JTextField();
		textField7.setBounds(250, 340, 250, 25);
		textField7.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaANumeros(evt, textField7, 10);
		    }

		});
		panel_45.add(textField7);
		textField7.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Grado de estudios");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(55, 390, 197, 40);
		panel_45.add(lblNewLabel_15);
		
		JTextField textField10 = new JTextField();
		textField10.setBounds(250, 400, 250, 25);
		textField10.addKeyListener(new java.awt.event.KeyAdapter() {
		    @Override
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        limitarEntradaALetras(evt, textField10, 25);
		    }

		});
		panel_45.add(textField10);
		textField10.setColumns(10);
		
		ImageIcon camara = new ImageIcon(getClass().getResource("/Imagenes/CamaraIcono.png"));
		JLabel lblNewLabel_14 = new JLabel("Fotografia del docente");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_14.setIcon(camara);
		lblNewLabel_14.setBounds(575, 30, 270, 40);
		panel_45.add(lblNewLabel_14);
		
		ImageIcon imagenUsuario = new ImageIcon(getClass().getResource("/Imagenes/IconoFoto.png"));
		JButton botonDescargar = new JButton(imagenUsuario);
		botonDescargar.setOpaque(true);
		botonDescargar.setBackground(Color.white);
		botonDescargar.setBounds(580, 100, 256, 256);
		panel_45.add(botonDescargar);
		
		ImageIcon imagenIconoBotonEditar = new ImageIcon(getClass().getResource("/Imagenes/IconoBotonEditar.png"));
		RoundedButton roundedButton = new RoundedButton(imagenIconoBotonEditar ,"Editar datos", 45, Color.decode("#FF5733"));
		roundedButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton.setBounds(200, 630, 250, 50);
		panel13.add(roundedButton);
		
		ImageIcon imagenIconoBotonVolver = new ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"));
		RoundedButton roundedButton2 = new RoundedButton(imagenIconoBotonVolver ,"Regresar", 45, Color.decode("#FF5733"));
		roundedButton2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton2.setBounds(470, 630, 250, 50);
		roundedButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				panelDocentes(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel13.add(roundedButton2);
		
	}
	
	public void descargarDocente(JFrame frame) {
		
		JPanel panel13 = new JPanel();
		frame.getContentPane().add(panel13, BorderLayout.CENTER);
		panel13.setBackground(Color.decode("#EFEFEF"));
		panel13.setLayout(null);
		
		
		JLabel lblNewLabel_18 = new JLabel("Descargar datos de docente");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_18.setBounds(20, 30, 400, 100);
		panel13.add(lblNewLabel_18);
		
		JPanel panel_45 = new JPanel();
		panel_45.setLayout(null);
		panel_45.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_45.setBounds(20, 130, 880, 460);
		panel13.add(panel_45);
		
		JLabel lblNewLabel_19 = new JLabel("Apellido paterno");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_19.setBounds(70, 30, 170, 40);
		panel_45.add(lblNewLabel_19);
		
		textField = new JTextField();
		textField.setBounds(250, 40, 250, 25);
		panel_45.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Apellido materno");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(63, 90, 190, 40);
		panel_45.add(lblNewLabel_11);
		
		JTextField textField14 = new JTextField();
		textField14.setBounds(250, 100, 250, 25);
		panel_45.add(textField14);
		textField14.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Nombre");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_16.setBounds(155, 150, 190, 40);
		panel_45.add(lblNewLabel_16);
		
		JTextField textField8 = new JTextField();
		textField8.setBounds(250, 160, 250, 25);
		panel_45.add(textField8);
		textField8.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Fecha de nacimiento");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_17.setBounds(30, 210, 220, 40);
		panel_45.add(lblNewLabel_17);
		
		JTextField textField9 = new JTextField();
		textField9.setBounds(250, 220, 250, 25);
		panel_45.add(textField9);
		textField9.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Correo electronico");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(50, 270, 200, 40);
		panel_45.add(lblNewLabel_12);
		
		JTextField textField6 = new JTextField();
		textField6.setBounds(250, 280, 250, 25);
		panel_45.add(textField6);
		textField6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Telefono");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(145, 330, 147, 40);
		panel_45.add(lblNewLabel_13);
		
		JTextField textField7 = new JTextField();
		textField7.setBounds(250, 340, 250, 25);
		panel_45.add(textField7);
		textField7.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Grado de estudios");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(55, 390, 197, 40);
		panel_45.add(lblNewLabel_15);
		
		JTextField textField10 = new JTextField();
		textField10.setBounds(250, 400, 250, 25);
		panel_45.add(textField10);
		textField10.setColumns(10);
		
		ImageIcon camara = new ImageIcon(getClass().getResource("/Imagenes/CamaraIcono.png"));
		JLabel lblNewLabel_14 = new JLabel("Fotografia del docente");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_14.setIcon(camara);
		lblNewLabel_14.setBounds(575, 30, 270, 40);
		panel_45.add(lblNewLabel_14);
		
		ImageIcon imagenUsuario = new ImageIcon(getClass().getResource("/Imagenes/IconoFoto.png"));
		JButton botonDescargar = new JButton(imagenUsuario);
		botonDescargar.setOpaque(true);
		botonDescargar.setBackground(Color.white);
		botonDescargar.setBounds(580, 100, 256, 256);
		panel_45.add(botonDescargar);
		
		ImageIcon imagenIconoBotonDescargar = new ImageIcon(getClass().getResource("/Imagenes/IconoBotonDescargar.png"));
		RoundedButton roundedButton = new RoundedButton(imagenIconoBotonDescargar ,"Descargar", 45, Color.decode("#FF5733"));
		roundedButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton.setBounds(200, 630, 250, 50);
		panel13.add(roundedButton);
		
		ImageIcon imagenIconoBotonVolver = new ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"));
		RoundedButton roundedButton2 = new RoundedButton(imagenIconoBotonVolver ,"Regresar", 45, Color.decode("#FF5733"));
		roundedButton2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton2.setBounds(470, 630, 250, 50);
		roundedButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				panelDocentes(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel13.add(roundedButton2);
		
	}

	public void crearDocente(JFrame frame) {
		
		JPanel panel13 = new JPanel();
		frame.getContentPane().add(panel13, BorderLayout.CENTER);
		panel13.setBackground(Color.decode("#EFEFEF"));
		panel13.setLayout(null);
		
		
		JLabel lblNewLabel_18 = new JLabel("Crear datos de docente");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_18.setBounds(20, 30, 400, 100);
		panel13.add(lblNewLabel_18);
		
		JPanel panel_45 = new JPanel();
		panel_45.setLayout(null);
		panel_45.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_45.setBounds(20, 130, 880, 460);
		panel13.add(panel_45);
		
		JLabel lblNewLabel_19 = new JLabel("Apellido paterno");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_19.setBounds(70, 30, 170, 40);
		panel_45.add(lblNewLabel_19);
		
		textField = new JTextField();
		textField.setBounds(250, 40, 250, 25);
		panel_45.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Apellido materno");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(63, 90, 190, 40);
		panel_45.add(lblNewLabel_11);
		
		JTextField textField14 = new JTextField();
		textField14.setBounds(250, 100, 250, 25);
		panel_45.add(textField14);
		textField14.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Nombre");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_16.setBounds(155, 150, 190, 40);
		panel_45.add(lblNewLabel_16);
		
		JTextField textField8 = new JTextField();
		textField8.setBounds(250, 160, 250, 25);
		panel_45.add(textField8);
		textField8.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Fecha de nacimiento");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_17.setBounds(30, 210, 220, 40);
		panel_45.add(lblNewLabel_17);
		
		JTextField textField9 = new JTextField();
		textField9.setBounds(250, 220, 250, 25);
		panel_45.add(textField9);
		textField9.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Correo electronico");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(50, 270, 200, 40);
		panel_45.add(lblNewLabel_12);
		
		JTextField textField6 = new JTextField();
		textField6.setBounds(250, 280, 250, 25);
		panel_45.add(textField6);
		textField6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Telefono");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(145, 330, 147, 40);
		panel_45.add(lblNewLabel_13);
		
		JTextField textField7 = new JTextField();
		textField7.setBounds(250, 340, 250, 25);
		panel_45.add(textField7);
		textField7.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Grado de estudios");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(55, 390, 197, 40);
		panel_45.add(lblNewLabel_15);
		
		JTextField textField10 = new JTextField();
		textField10.setBounds(250, 400, 250, 25);
		panel_45.add(textField10);
		textField10.setColumns(10);
		
		ImageIcon camara = new ImageIcon(getClass().getResource("/Imagenes/CamaraIcono.png"));
		JLabel lblNewLabel_14 = new JLabel("Fotografia del docente");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_14.setIcon(camara);
		lblNewLabel_14.setBounds(575, 30, 270, 40);
		panel_45.add(lblNewLabel_14);
		
		ImageIcon imagenUsuario = new ImageIcon(getClass().getResource("/Imagenes/IconoFoto.png"));
		JButton botonDescargar = new JButton(imagenUsuario);
		botonDescargar.setOpaque(true);
		botonDescargar.setBackground(Color.white);
		botonDescargar.setBounds(580, 100, 256, 256);
		panel_45.add(botonDescargar);
		
		ImageIcon imagenIconoBotonDescargar = new ImageIcon(getClass().getResource("/Imagenes/IconoBotonCrear.png"));
		RoundedButton roundedButton = new RoundedButton(imagenIconoBotonDescargar ,"Crear datos", 45, Color.decode("#FF5733"));
		roundedButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton.setBounds(200, 630, 250, 50);
		panel13.add(roundedButton);
		
		ImageIcon imagenIconoBotonVolver = new ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"));
		RoundedButton roundedButton2 = new RoundedButton(imagenIconoBotonVolver ,"Regresar", 45, Color.decode("#FF5733"));
		roundedButton2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton2.setBounds(470, 630, 250, 50);
		roundedButton2.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				panelDocentes(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel13.add(roundedButton2);
	}

	public void eliminarDocente(JFrame frame) {
		
		JPanel panel13 = new JPanel();
		frame.getContentPane().add(panel13, BorderLayout.CENTER);
		panel13.setBackground(Color.decode("#EFEFEF"));
		panel13.setLayout(null);
		
		
		JLabel lblNewLabel_18 = new JLabel("Eliminar datos de docente");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_18.setBounds(20, 30, 400, 100);
		panel13.add(lblNewLabel_18);
		
		JPanel panel_45 = new JPanel();
		panel_45.setLayout(null);
		panel_45.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_45.setBounds(20, 130, 880, 460);
		panel13.add(panel_45);
		
		JLabel lblNewLabel_19 = new JLabel("Apellido paterno");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_19.setBounds(70, 30, 170, 40);
		panel_45.add(lblNewLabel_19);
		
		textField = new JTextField();
		textField.setBounds(250, 40, 250, 25);
		panel_45.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Apellido materno");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(63, 90, 190, 40);
		panel_45.add(lblNewLabel_11);
		
		JTextField textField14 = new JTextField();
		textField14.setBounds(250, 100, 250, 25);
		panel_45.add(textField14);
		textField14.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Nombre");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_16.setBounds(155, 150, 190, 40);
		panel_45.add(lblNewLabel_16);
		
		JTextField textField8 = new JTextField();
		textField8.setBounds(250, 160, 250, 25);
		panel_45.add(textField8);
		textField8.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Fecha de nacimiento");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_17.setBounds(30, 210, 220, 40);
		panel_45.add(lblNewLabel_17);
		
		JTextField textField9 = new JTextField();
		textField9.setBounds(250, 220, 250, 25);
		panel_45.add(textField9);
		textField9.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Correo electronico");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(50, 270, 200, 40);
		panel_45.add(lblNewLabel_12);
		
		JTextField textField6 = new JTextField();
		textField6.setBounds(250, 280, 250, 25);
		panel_45.add(textField6);
		textField6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Telefono");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(145, 330, 147, 40);
		panel_45.add(lblNewLabel_13);
		
		JTextField textField7 = new JTextField();
		textField7.setBounds(250, 340, 250, 25);
		panel_45.add(textField7);
		textField7.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Grado de estudios");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(55, 390, 197, 40);
		panel_45.add(lblNewLabel_15);
		
		JTextField textField10 = new JTextField();
		textField10.setBounds(250, 400, 250, 25);
		panel_45.add(textField10);
		textField10.setColumns(10);
		
		ImageIcon camara = new ImageIcon(getClass().getResource("/Imagenes/CamaraIcono.png"));
		JLabel lblNewLabel_14 = new JLabel("Fotografia del docente");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_14.setIcon(camara);
		lblNewLabel_14.setBounds(575, 30, 270, 40);
		panel_45.add(lblNewLabel_14);
		
		ImageIcon imagenUsuario = new ImageIcon(getClass().getResource("/Imagenes/IconoFoto.png"));
		JButton botonDescargar = new JButton(imagenUsuario);
		botonDescargar.setOpaque(true);
		botonDescargar.setBackground(Color.white);
		botonDescargar.setBounds(580, 100, 256, 256);
		panel_45.add(botonDescargar);
		
		ImageIcon imagenIconoBotonDescargar = new ImageIcon(getClass().getResource("/Imagenes/BotonIconoBorrar.png"));
		RoundedButton roundedButton = new RoundedButton(imagenIconoBotonDescargar ,"Borrar datos", 45, Color.decode("#FF5733"));
		roundedButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton.setBounds(200, 630, 250, 50);
		panel13.add(roundedButton);
		
		ImageIcon imagenIconoBotonVolver = new ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"));
		RoundedButton roundedButton2 = new RoundedButton(imagenIconoBotonVolver ,"Regresar", 45, Color.decode("#FF5733"));
		roundedButton2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton2.setBounds(470, 630, 250, 50);
		roundedButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				panelDocentes(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel13.add(roundedButton2);
	}
	
	public void consultarDocente(JFrame frame) {


		JPanel panel13 = new JPanel();
		frame.getContentPane().add(panel13, BorderLayout.CENTER);
		panel13.setBackground(Color.decode("#EFEFEF"));
		panel13.setLayout(null);
		
		
		
		JLabel lblNewLabel_18 = new JLabel("Consulta de datos de docente");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_18.setBounds(20, 30, 390, 100);
		panel13.add(lblNewLabel_18);
		
		JPanel panel_45 = new JPanel();
		panel_45.setLayout(null);
		panel_45.setBorder(BorderFactory.createLineBorder(Color.black , 2));
		panel_45.setBounds(20, 130, 880, 460);
		panel13.add(panel_45);
		
		JLabel lblNewLabel_19 = new JLabel("Apellido paterno");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_19.setBounds(70, 30, 170, 40);
		panel_45.add(lblNewLabel_19);
		
		textField = new JTextField();
		textField.setBounds(250, 40, 250, 25);
		panel_45.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Apellido materno");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(63, 90, 190, 40);
		panel_45.add(lblNewLabel_11);
		
		JTextField textField14 = new JTextField();
		textField14.setBounds(250, 100, 250, 25);
		panel_45.add(textField14);
		textField14.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Nombre");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_16.setBounds(155, 150, 190, 40);
		panel_45.add(lblNewLabel_16);
		
		JTextField textField8 = new JTextField();
		textField8.setBounds(250, 160, 250, 25);
		panel_45.add(textField8);
		textField8.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Fecha de nacimiento");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_17.setBounds(30, 210, 220, 40);
		panel_45.add(lblNewLabel_17);
		
		JTextField textField9 = new JTextField();
		textField9.setBounds(250, 220, 250, 25);
		panel_45.add(textField9);
		textField9.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Correo electronico");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(50, 270, 200, 40);
		panel_45.add(lblNewLabel_12);
		
		JTextField textField6 = new JTextField();
		textField6.setBounds(250, 280, 250, 25);
		panel_45.add(textField6);
		textField6.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Telefono");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(145, 330, 147, 40);
		panel_45.add(lblNewLabel_13);
		
		JTextField textField7 = new JTextField();
		textField7.setBounds(250, 340, 250, 25);
		panel_45.add(textField7);
		textField7.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Grado de estudios");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(55, 390, 197, 40);
		panel_45.add(lblNewLabel_15);
		
		JTextField textField10 = new JTextField();
		textField10.setBounds(250, 400, 250, 25);
		panel_45.add(textField10);
		textField10.setColumns(10);
		
		ImageIcon camara = new ImageIcon(getClass().getResource("/Imagenes/CamaraIcono.png"));
		JLabel lblNewLabel_14 = new JLabel("Fotografia del docente");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_14.setIcon(camara);
		lblNewLabel_14.setBounds(575, 30, 270, 40);
		panel_45.add(lblNewLabel_14);
		
		ImageIcon imagenUsuario = new ImageIcon(getClass().getResource("/Imagenes/IconoFoto.png"));
		JButton botonDescargar = new JButton(imagenUsuario);
		botonDescargar.setOpaque(true);
		botonDescargar.setBackground(Color.white);
		botonDescargar.setBounds(580, 100, 256, 256);
		panel_45.add(botonDescargar);
		
		ImageIcon imagenIconoBotonVolver = new ImageIcon(getClass().getResource("/Imagenes/IconoVolver.png"));
		RoundedButton roundedButton2 = new RoundedButton(imagenIconoBotonVolver ,"Regresar", 45, Color.decode("#FF5733"));
		roundedButton2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		roundedButton2.setBounds(335, 630, 250, 50);
		roundedButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				panelDocentes(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel13.add(roundedButton2);
	}
	
	public void logout(JFrame frame) {
		
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.white);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(220, 100, 500, 500);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("¿Estas seguro de que quieres cerrar tu sesión?");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_17.setBounds(110, 250, 300, 13);
		panel_1.add(lblNewLabel_17);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(250, 300, 150, 21);
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				System.exit(0);
			}});
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Volver");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(90, 301, 150, 21);
		btnNewButton_1_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				cambiarPantalla();
				seleccionPerfil(frame);
				frame.revalidate();
				frame.repaint();
				
			}});
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_21 = new JLabel("Vuelve pronto!");
		lblNewLabel_21.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_21.setBounds(180, 190, 200, 40);
		panel_1.add(lblNewLabel_21);
		
		JLabel logout = new JLabel();
		logout.setSize(150, 150);
		logout.setLocation(170, 30);
		ImageIcon imagenLogout = new ImageIcon("/Imagenes/logout1.png");
		logout.setIcon(imagenLogout);
		panel_1.add(logout);
	}
	
	public void cambiarPantalla() {
		
		Component[] elementos = frame.getContentPane().getComponents();
		for(int i=0 ; i<elementos.length ; i++) {
			if(elementos[i].getClass().toString().equals("class javax.swing.JPanel")) {
				
				JPanel panel = ((JPanel) elementos[i]);
				
				frame.remove(panel);
				
			}
		}
	}
	
	private void limitarEntradaANumeros(KeyEvent evt, JTextField textField, int longitud) {
		// TODO Auto-generated method stub
		char key = evt.getKeyChar();

	    boolean esNumero = Character.isDigit(key);
	    
	    boolean esBorrarOEnviar = key == KeyEvent.VK_BACK_SPACE || key == KeyEvent.VK_ENTER;

	    if (!esNumero && !esBorrarOEnviar) {
	        evt.consume();
	        
	        JOptionPane.showMessageDialog(null, "Solo números", "Advertencia", JOptionPane.WARNING_MESSAGE);
	    }

	    if (textField.getText().length() >= longitud) {
	        evt.consume();
	    }
	}
	
	private void limitarEntradaALetras(KeyEvent evt, JTextField textField, int longitud) {
		int key = evt.getKeyChar();

	    boolean mayusculas = key >= 65 && key <= 90;
	    boolean minusculas = key >= 97 && key <= 122;
	    boolean espacio = key == 32;
	    boolean esBorrarOEnviar = key == KeyEvent.VK_BACK_SPACE || key == KeyEvent.VK_ENTER;
	            
	     if (!(minusculas || mayusculas || espacio|| esBorrarOEnviar))
	    {
	        evt.consume();
	        JOptionPane.showMessageDialog(null, "Solo letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
	    }
	     
	     if (textField.getText().length() >= longitud) {
		        evt.consume();
		    }
	}
	
	private void limitarEntradaCaracteres(KeyEvent evt, JTextField textField, int longitudMaxima) {
	    
	    if (textField.getText().length() >= longitudMaxima) {
	        evt.consume();
	    }
	}
	
	
	
}


class RoundedButton extends JButton {

    private int radius;
    private Color borderColor;

    public RoundedButton(ImageIcon icon, String text, int radius, Color borderColor) {
        super(text);

        setIcon(icon);

        this.radius = radius;

        this.borderColor = borderColor;

        setOpaque(false);
        setContentAreaFilled(false);
        setBorder(new RoundedBorder(radius, borderColor));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
        
        if (getModel().isPressed()) {
        	 g2.setColor(Color.decode("#b7cfe5")); 
        } else if (getModel().isRollover()) {
        	g2.setColor(Color.WHITE);
        } else {
            g2.setColor(getBackground());
        }
        
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        super.paintComponent(g);
    }

    static class RoundedBorder implements Border {
        private int radius;
        private Color borderColor;

        public RoundedBorder(int radius, Color borderColor) {
            this.radius = radius;
            this.borderColor = borderColor;
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radius, radius, radius, radius);
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(borderColor);
            g2.setStroke(new BasicStroke(3.0f));
            g2.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
            g2.drawRoundRect(x + 1, y + 1, width - 3, height - 3, radius, radius);
        }
    }
}
