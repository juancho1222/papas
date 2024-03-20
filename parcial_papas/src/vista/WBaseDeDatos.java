package vista;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class WBaseDeDatos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public JTextField fieldNombre;
	public JTextField fieldEspecie;
	public JTextField fieldZona;
	public JTextField fieldHabito;
	public JTextField fieldFloracion;
	public JTextField fieldBayas;
	public JTextField fieldTuberculo;
	public JTextField textField_1;
	
	
	public JRadioButton rdbtnCundinamarca; 
	public JRadioButton rdbtnBoyaca; 
	public JRadioButton rdbtnNariño; 
	private final ButtonGroup groupZona = new ButtonGroup();
	private JTextField fieldHabitoC;
	private JTextField fieldFloracionC;
	private JTextField fieldBayasC;
	private JTextField fieldTuberculoC;
	private JTextField fieldNombreC;
	private JTextField fieldEspecieC;
	private JButton btnConsultar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JButton btnRegistrar;
	private final ButtonGroup groupZonaConsulta = new ButtonGroup();

	public WBaseDeDatos() {
		iniciar();
	}
	/**
	 * Create the frame.
	 */
	public void iniciar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelLogo = new JPanel();
		panelLogo.setBackground(new Color(255, 255, 174));
		panelLogo.setBounds(0, 0, 1184, 130);
		contentPane.add(panelLogo);
		panelLogo.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(252, 0, 720, 129);
		imagenEnLabel("src/imgs/minagricultura.png",lblLogo,panelLogo);		
			
		JPanel panelREA = new JPanel();
		panelREA.setForeground(new Color(255, 255, 255));
		panelREA.setBackground(new Color(0, 0, 0));
		panelREA.setBounds(0, 130, 621, 631);
		contentPane.add(panelREA);
		
		JPanel panelConsulta = new JPanel();
		panelConsulta.setBackground(new Color(255, 255, 255));
		panelConsulta.setForeground(new Color(0, 0, 0));
		panelConsulta.setBounds(620, 130, 564, 631);
		contentPane.add(panelConsulta);
		panelConsulta.setLayout(null);
		
		fieldHabitoC = new JTextField();
		fieldHabitoC.setFont(new Font("SansSerif", Font.BOLD, 12));
		fieldHabitoC.setColumns(10);
		fieldHabitoC.setBounds(117, 144, 420, 28);
		panelConsulta.add(fieldHabitoC);
		
		JLabel lblHabitoC = new JLabel("<html> Hábito de crecimiento:");
		lblHabitoC.setForeground(new Color(0, 0, 0));
		lblHabitoC.setFont(new Font("Roboto", Font.BOLD, 16));
		lblHabitoC.setBounds(10, 134, 99, 38);
		panelConsulta.add(lblHabitoC);
		
		
		fieldFloracionC = new JTextField();
		fieldFloracionC.setFont(new Font("SansSerif", Font.BOLD, 12));
		fieldFloracionC.setColumns(10);
		fieldFloracionC.setBounds(117, 184, 420, 19);
		panelConsulta.add(fieldFloracionC);
		
		JLabel lblFloracionC = new JLabel("Floración:");
		lblFloracionC.setForeground(new Color(0, 0, 0));
		lblFloracionC.setFont(new Font("Roboto", Font.BOLD, 16));
		lblFloracionC.setBounds(12, 182, 97, 19);
		panelConsulta.add(lblFloracionC);
		
		
		fieldBayasC = new JTextField();
		fieldBayasC.setFont(new Font("SansSerif", Font.BOLD, 12));
		fieldBayasC.setColumns(10);
		fieldBayasC.setBounds(117, 214, 420, 20);
		panelConsulta.add(fieldBayasC);
		
		JLabel lblBayasC = new JLabel("Bayas:");
		lblBayasC.setForeground(new Color(0, 0, 0));
		lblBayasC.setFont(new Font("Roboto", Font.BOLD, 16));
		lblBayasC.setBounds(10, 212, 97, 19);
		panelConsulta.add(lblBayasC);
		
		
		fieldTuberculoC = new JTextField();
		fieldTuberculoC.setFont(new Font("SansSerif", Font.BOLD, 12));
		fieldTuberculoC.setColumns(10);
		fieldTuberculoC.setBounds(117, 245, 420, 19);
		panelConsulta.add(fieldTuberculoC);
		
		JLabel lblTuberculoC = new JLabel("Tubérculo:");
		lblTuberculoC.setForeground(new Color(0, 0, 0));
		lblTuberculoC.setFont(new Font("Roboto", Font.BOLD, 16));
		lblTuberculoC.setBounds(10, 242, 90, 19);
		panelConsulta.add(lblTuberculoC);
		
		
		JLabel lblNombreC = new JLabel("Nombre:");
		lblNombreC.setForeground(new Color(0, 0, 0));
		lblNombreC.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNombreC.setBounds(10, 11, 104, 28);
		panelConsulta.add(lblNombreC);
		
		JLabel lblEspecieC = new JLabel("Especie:");
		lblEspecieC.setForeground(new Color(0, 0, 0));
		lblEspecieC.setFont(new Font("Roboto", Font.BOLD, 16));
		lblEspecieC.setBounds(10, 49, 99, 28);
		panelConsulta.add(lblEspecieC);
		
		JLabel lblZonaDeProduccionC = new JLabel("<html>Zona de Producción:");
		lblZonaDeProduccionC.setForeground(new Color(0, 0, 0));
		lblZonaDeProduccionC.setFont(new Font("Roboto", Font.BOLD, 16));
		lblZonaDeProduccionC.setBounds(10, 88, 97, 38);
		panelConsulta.add(lblZonaDeProduccionC);
		
		fieldNombreC = new JTextField();
		fieldNombreC.setFont(new Font("SansSerif", Font.BOLD, 14));
		fieldNombreC.setColumns(10);
		fieldNombreC.setBackground(new Color(255, 255, 174));
		fieldNombreC.setBounds(110, 11, 397, 25);
		panelConsulta.add(fieldNombreC);
		
		JRadioButton rdbtnBoyacaC = new JRadioButton("Boyacá");
		groupZonaConsulta.add(rdbtnBoyacaC);
		rdbtnBoyacaC.setForeground(new Color(0, 0, 0));
		rdbtnBoyacaC.setFont(new Font("Roboto", Font.BOLD, 13));
		rdbtnBoyacaC.setBackground(new Color(255, 255, 255));
		rdbtnBoyacaC.setBounds(110, 88, 109, 23);
		panelConsulta.add(rdbtnBoyacaC);
		
		JRadioButton rdbtnNariñoC = new JRadioButton("Nariño");
		groupZonaConsulta.add(rdbtnNariñoC);
		rdbtnNariñoC.setForeground(new Color(0, 0, 0));
		rdbtnNariñoC.setFont(new Font("Roboto", Font.BOLD, 13));
		rdbtnNariñoC.setBackground(new Color(255, 255, 255));
		rdbtnNariñoC.setBounds(233, 88, 109, 23);
		panelConsulta.add(rdbtnNariñoC);
		
		JRadioButton rdbtnCundinamarcaC = new JRadioButton("Cundinamarca");
		groupZonaConsulta.add(rdbtnCundinamarcaC);
		rdbtnCundinamarcaC.setForeground(new Color(0, 0, 0));
		rdbtnCundinamarcaC.setFont(new Font("Roboto", Font.BOLD, 13));
		rdbtnCundinamarcaC.setBackground(new Color(255, 255, 255));
		rdbtnCundinamarcaC.setBounds(360, 88, 109, 23);
		panelConsulta.add(rdbtnCundinamarcaC);
		
		fieldEspecieC = new JTextField();
		fieldEspecieC.setFont(new Font("SansSerif", Font.BOLD, 12));
		fieldEspecieC.setColumns(10);
		fieldEspecieC.setBounds(110, 56, 211, 19);
		panelConsulta.add(fieldEspecieC);
		
		btnConsultar = new JButton("CONSULTAR");
		btnConsultar.setBounds(10, 296, 544, 23);
		panelConsulta.add(btnConsultar);
		panelREA.setLayout(null);
		
		fieldHabito = new JTextField();
		fieldHabito.setFont(new Font("SansSerif", Font.BOLD, 12));
		fieldHabito.setColumns(10);
		fieldHabito.setBounds(139, 149, 472, 28);
		panelREA.add(fieldHabito);
		
		JLabel lblHabito = new JLabel("<html> Hábito de crecimiento:");
		lblHabito.setForeground(new Color(255, 255, 255));
		lblHabito.setFont(new Font("Roboto", Font.BOLD, 16));
		lblHabito.setBounds(39, 139, 99, 38);
		panelREA.add(lblHabito);
		
		
		fieldFloracion = new JTextField();
		fieldFloracion.setFont(new Font("SansSerif", Font.BOLD, 12));
		fieldFloracion.setColumns(10);
		fieldFloracion.setBounds(139, 189, 472, 19);
		panelREA.add(fieldFloracion);
		
		JLabel lblFloracion = new JLabel("Floración:");
		lblFloracion.setForeground(new Color(255, 255, 255));
		lblFloracion.setFont(new Font("Roboto", Font.BOLD, 16));
		lblFloracion.setBounds(41, 187, 97, 19);
		panelREA.add(lblFloracion);
		
		fieldBayas = new JTextField();
		fieldBayas.setFont(new Font("SansSerif", Font.BOLD, 12));
		fieldBayas.setColumns(10);
		fieldBayas.setBounds(139, 219, 472, 20);
		panelREA.add(fieldBayas);
		
		JLabel lblBayas = new JLabel("Bayas:");
		lblBayas.setForeground(new Color(255, 255, 255));
		lblBayas.setFont(new Font("Roboto", Font.BOLD, 16));
		lblBayas.setBounds(39, 217, 97, 19);
		panelREA.add(lblBayas);
		
		fieldTuberculo = new JTextField();
		fieldTuberculo.setFont(new Font("SansSerif", Font.BOLD, 12));
		fieldTuberculo.setColumns(10);
		fieldTuberculo.setBounds(139, 250, 472, 19);
		panelREA.add(fieldTuberculo);
		
		JLabel lblTuberculo = new JLabel("Tubérculo:");
		lblTuberculo.setForeground(new Color(255, 255, 255));
		lblTuberculo.setFont(new Font("Roboto", Font.BOLD, 16));
		lblTuberculo.setBounds(39, 247, 90, 19);
		panelREA.add(lblTuberculo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNombre.setBounds(39, 16, 104, 28);
		panelREA.add(lblNombre);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setForeground(Color.WHITE);
		lblEspecie.setFont(new Font("Roboto", Font.BOLD, 16));
		lblEspecie.setBounds(39, 54, 99, 28);
		panelREA.add(lblEspecie);
		
		JLabel lblZonaDeProduccion = new JLabel("<html>Zona de Producción:");
		lblZonaDeProduccion.setForeground(Color.WHITE);
		lblZonaDeProduccion.setFont(new Font("Roboto", Font.BOLD, 16));
		lblZonaDeProduccion.setBounds(39, 93, 97, 38);
		panelREA.add(lblZonaDeProduccion);
		
		fieldNombre= new JTextField();
		fieldNombre.setBackground(new Color(255, 255, 174));
		fieldNombre.setFont(new Font("SansSerif", Font.BOLD, 14));
		fieldNombre.setColumns(10);
		fieldNombre.setBounds(139, 16, 432, 25);
		panelREA.add(fieldNombre);
		
		fieldEspecie = new JTextField();
		fieldEspecie.setFont(new Font("SansSerif", Font.BOLD, 12));
		fieldEspecie.setBounds(139, 61, 211, 19);
		panelREA.add(fieldEspecie);
		fieldEspecie.setColumns(10);
		
		JLabel lblLlave = new JLabel("New label");
		lblLlave.setBounds(576, 13, 35, 35);
		lblLlave.setBackground(Color.BLACK);
		imagenEnLabel("src/imgs/llave.png",lblLlave,panelREA);
		
		JLabel lblLlaveConsulta = new JLabel("New label");
		lblLlaveConsulta.setBounds(520, 10, 35, 35);
		lblLlaveConsulta.setBackground(Color.BLACK);
		imagenEnLabel("src/imgs/llave.png",lblLlaveConsulta,panelConsulta);
		
		
		rdbtnBoyaca = new JRadioButton("Boyacá");
		groupZona.add(rdbtnBoyaca);
		rdbtnBoyaca.setFont(new Font("Roboto", Font.BOLD, 13));
		rdbtnBoyaca.setForeground(new Color(255, 255, 255));
		rdbtnBoyaca.setBackground(new Color(0, 0, 0));
		rdbtnBoyaca.setBounds(139, 93, 109, 23);
		panelREA.add(rdbtnBoyaca);
		
		rdbtnNariño = new JRadioButton("Nariño");
		groupZona.add(rdbtnNariño);
		rdbtnNariño.setFont(new Font("Roboto", Font.BOLD, 13));
		rdbtnNariño.setForeground(new Color(255, 255, 255));
		rdbtnNariño.setBackground(new Color(0, 0, 0));
		rdbtnNariño.setBounds(262, 93, 109, 23);
		panelREA.add(rdbtnNariño);
		
		rdbtnCundinamarca = new JRadioButton("Cundinamarca");
		groupZona.add(rdbtnCundinamarca);
		rdbtnCundinamarca.setFont(new Font("Roboto", Font.BOLD, 13));
		rdbtnCundinamarca.setForeground(new Color(255, 255, 255));
		rdbtnCundinamarca.setBackground(new Color(0, 0, 0));
		rdbtnCundinamarca.setBounds(389, 93, 109, 23);
		panelREA.add(rdbtnCundinamarca);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(0, 297, 211, 23);
		panelREA.add(btnRegistrar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(207, 297, 211, 23);
		panelREA.add(btnEliminar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(417, 297, 194, 23);
		panelREA.add(btnActualizar);
		
	}
	
	public void imagenEnLabel(String imagen, JLabel label, JPanel panel) {
		ImageIcon img_foto=new ImageIcon(imagen);
		Image imgIns=img_foto.getImage();
		Image newImg =imgIns.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon finalImage=new ImageIcon(newImg);
		panel.setLayout(null);
		label.setIcon(finalImage);
		panel.add(label);
	}
}
