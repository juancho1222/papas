package vista;

import java.awt.Image;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class WCompletacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//Cajitas de texto papas del archivo de propiedades
	public JTextField fieldNombre;
	public JTextField fieldEspecie;
	public JTextField fieldZona;
	public JTextField fieldHabito;
	public JTextField fieldFloracion;
	public JTextField fieldBayas;
	public JTextField fieldTuberculo;
	
	private final ButtonGroup turnoPapa = new ButtonGroup();
	public JRadioButton rdbtnPapa1;
	public JRadioButton rdbtnPapa2;
	public JRadioButton rdbtnPapa3;
	
	public JButton btnContinuar;
	public JButton btnSalir1;

	public WCompletacion() {
		iniciar();
	}
	/**
	 * Create the frame.
	 */
	public void iniciar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 85, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelOpciones = new JPanel();
		panelOpciones.setBackground(new Color(0, 0, 0));
		panelOpciones.setBounds(0, 0, 409, 761);
		contentPane.add(panelOpciones);
		panelOpciones.setLayout(null);
		
		JPanel panelFondo = new JPanel();
		panelFondo.setBounds(0, 0, 409, 132);
		panelFondo.setBackground(new Color(255, 255, 255));
		panelOpciones.add(panelFondo);
		panelFondo.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(20, 11, 368, 114);
		ImageIcon img_1=new ImageIcon("src/imgs/agricultura.png");
		Image imgIns=img_1.getImage();
		Image newImg =imgIns.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon finalImage=new ImageIcon(newImg);
		lblLogo.setIcon(finalImage);
		panelFondo.add(lblLogo);
		panelFondo.setLayout(null);
		
		btnSalir1 = new JButton("SALIR");
		btnSalir1.setFont(new Font("Roboto", Font.BOLD, 20));
		btnSalir1.setBounds(93, 627, 195, 38);
		panelOpciones.add(btnSalir1);
		
		rdbtnPapa1 = new JRadioButton("");
		turnoPapa.add(rdbtnPapa1);
		rdbtnPapa1.setBackground(new Color(242, 181, 36));
		rdbtnPapa1.setBounds(93, 233, 180, 23);
		panelOpciones.add(rdbtnPapa1);
		
		rdbtnPapa2 = new JRadioButton("");
		turnoPapa.add(rdbtnPapa2);
		rdbtnPapa2.setBackground(new Color(242, 181, 36));
		rdbtnPapa2.setBounds(93, 340, 180, 23);
		panelOpciones.add(rdbtnPapa2);
		
		rdbtnPapa3 = new JRadioButton("");
		turnoPapa.add(rdbtnPapa3);
		rdbtnPapa3.setBackground(new Color(242, 181, 36));
		rdbtnPapa3.setBounds(93, 450, 180, 23);
		panelOpciones.add(rdbtnPapa3);
		
		fieldNombre = new JTextField();
		fieldNombre.setFont(new Font("SansSerif", Font.BOLD, 14));
		fieldNombre.setBounds(431, 179, 146, 28);
		contentPane.add(fieldNombre);
		fieldNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Roboto", Font.BOLD, 16));
		lblNombre.setBounds(431, 140, 146, 28);
		contentPane.add(lblNombre);
		
		JSeparator separatorNombre = new JSeparator();
		separatorNombre.setBounds(431, 218, 146, 2);
		contentPane.add(separatorNombre);
		
		fieldEspecie = new JTextField();
		fieldEspecie.setFont(new Font("SansSerif", Font.BOLD, 14));
		fieldEspecie.setColumns(10);
		fieldEspecie.setBounds(608, 179, 146, 28);
		contentPane.add(fieldEspecie);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setForeground(new Color(255, 255, 255));
		lblEspecie.setFont(new Font("Roboto", Font.BOLD, 16));
		lblEspecie.setBounds(608, 140, 146, 28);
		contentPane.add(lblEspecie);
		
		JSeparator separatorEspecie = new JSeparator();
		separatorEspecie.setBounds(608, 218, 146, 2);
		contentPane.add(separatorEspecie);
		
		fieldZona = new JTextField();
		fieldZona.setFont(new Font("SansSerif", Font.BOLD, 14));
		fieldZona.setColumns(10);
		fieldZona.setBounds(793, 179, 160, 28);
		contentPane.add(fieldZona);
		
		JLabel lblZona = new JLabel("Zona de Producción:");
		lblZona.setForeground(new Color(255, 255, 255));
		lblZona.setFont(new Font("Roboto", Font.BOLD, 16));
		lblZona.setBounds(793, 140, 160, 28);
		contentPane.add(lblZona);
		
		JSeparator separatorZona = new JSeparator();
		separatorZona.setBounds(793, 218, 160, 2);
		contentPane.add(separatorZona);
		
		JLabel lblNewLabel = new JLabel("DATOS DE LA PAPA:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 35));
		lblNewLabel.setBounds(530, 24, 354, 66);
		contentPane.add(lblNewLabel);
		
		fieldHabito = new JTextField();
		fieldHabito.setFont(new Font("SansSerif", Font.BOLD, 14));
		fieldHabito.setColumns(10);
		fieldHabito.setBounds(431, 289, 522, 28);
		contentPane.add(fieldHabito);
		
		JLabel lblHabito = new JLabel("Hábito de crecimiento:");
		lblHabito.setForeground(new Color(255, 255, 255));
		lblHabito.setFont(new Font("Roboto", Font.BOLD, 16));
		lblHabito.setBounds(431, 250, 522, 28);
		contentPane.add(lblHabito);
		
		JSeparator separatorHabito = new JSeparator();
		separatorHabito.setBounds(431, 328, 522, 2);
		contentPane.add(separatorHabito);
		
		fieldFloracion = new JTextField();
		fieldFloracion.setFont(new Font("SansSerif", Font.BOLD, 14));
		fieldFloracion.setColumns(10);
		fieldFloracion.setBounds(431, 390, 522, 28);
		contentPane.add(fieldFloracion);
		
		JLabel lblFloracion = new JLabel("Floración:");
		lblFloracion.setForeground(new Color(255, 255, 255));
		lblFloracion.setFont(new Font("Roboto", Font.BOLD, 16));
		lblFloracion.setBounds(431, 351, 522, 28);
		contentPane.add(lblFloracion);
		
		JSeparator separatorFloracion = new JSeparator();
		separatorFloracion.setBounds(431, 429, 522, 2);
		contentPane.add(separatorFloracion);
		
		fieldBayas = new JTextField();
		fieldBayas.setFont(new Font("SansSerif", Font.BOLD, 14));
		fieldBayas.setColumns(10);
		fieldBayas.setBounds(431, 496, 522, 28);
		contentPane.add(fieldBayas);
		
		JLabel lblBayas = new JLabel("Hábito de crecimiento:");
		lblBayas.setForeground(new Color(255, 255, 255));
		lblBayas.setFont(new Font("Roboto", Font.BOLD, 16));
		lblBayas.setBounds(431, 457, 522, 28);
		contentPane.add(lblBayas);
		
		JSeparator separatorBayas = new JSeparator();
		separatorBayas.setBounds(431, 535, 522, 2);
		contentPane.add(separatorBayas);
		
		fieldTuberculo = new JTextField();
		fieldTuberculo.setFont(new Font("SansSerif", Font.BOLD, 14));
		fieldTuberculo.setColumns(10);
		fieldTuberculo.setBounds(431, 598, 522, 28);
		contentPane.add(fieldTuberculo);
		
		JLabel lblTuberculo = new JLabel("Tubérculo:");
		lblTuberculo.setForeground(new Color(255, 255, 255));
		lblTuberculo.setFont(new Font("Roboto", Font.BOLD, 16));
		lblTuberculo.setBounds(431, 559, 522, 28);
		contentPane.add(lblTuberculo);
		
		JSeparator separatorTuberculo = new JSeparator();
		separatorTuberculo.setBounds(431, 637, 522, 2);
		contentPane.add(separatorTuberculo);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setFont(new Font("Roboto", Font.BOLD, 20));
		btnContinuar.setBounds(755, 684, 195, 38);
		contentPane.add(btnContinuar);
		
		//Bloqueamos que el usuario no pueda escoger la papa a llenar
		rdbtnPapa1.setEnabled(false);
		rdbtnPapa2.setEnabled(false);
		rdbtnPapa3.setEnabled(false);
		
		//Bloqueamos que el usuario pueda modificar al inicio el nombre, la especie y la zona
		fieldNombre.setEditable(false);
		fieldEspecie.setEditable(false);
		fieldZona.setEditable(false);
	}
	
	public void cambiarTurno(JRadioButton papa) {
		turnoPapa.clearSelection();
		papa.setSelected(true);	
	}
	public int avisoCerrarVentana() {
		int val= JOptionPane.showConfirmDialog(null,"¿Está seguro que desea terminar el programa?", "Avertencia", JOptionPane.YES_NO_OPTION);
		return val;
	}
	
	public void cambiarNombreEspecieZona(String nombre,String especie, String zona) {
		fieldNombre.setText(nombre);
		fieldEspecie.setText(especie);
		fieldZona.setText(zona);
	}
	 public void limpiarParaLlenado() {
		 fieldHabito.setText("");
		 fieldFloracion.setText("");
		 fieldBayas.setText("");
		 fieldTuberculo.setText("");
	 }
	public void aviso(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);

	}
}
