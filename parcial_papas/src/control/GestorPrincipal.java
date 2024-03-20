package control;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;


import vista.WBaseDeDatos;
import vista.WCompletacion;

public class GestorPrincipal implements ActionListener{
	private WCompletacion inicio;
	private WBaseDeDatos wbd;
	public ControlPapa ctpapa;
	
	int cont;
	public GestorPrincipal() {
		//Creación de la ventana
			inicio = new WCompletacion();
			inicio.setVisible(true);
			inicio.setResizable(false);
			inicio.setLocationRelativeTo(null);
			inicio.setTitle("Completando Papas ...");
			cont=0;
			
		//Orejas de los actionlisteners
			this.inicio.btnSalir1.addActionListener(this);
			this.inicio.btnSalir1.setActionCommand("salir1");
			
			this.inicio.btnContinuar.addActionListener(this);
			this.inicio.btnContinuar.setActionCommand("continuar");
	}
	
	//EJECUCIÓN DE ACCIONES DE BOTONES
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (("salir1").equals(e.getActionCommand())) {	
			
			cerrarVentana(this.inicio.avisoCerrarVentana());
			
		}else if(("continuar").equals(e.getActionCommand())) {
			if (!(this.inicio.fieldHabito.getText().isEmpty() ||
				this.inicio.fieldFloracion.getText().isEmpty() || 
				this.inicio.fieldBayas.getText().isEmpty() || 
				this.inicio.fieldTuberculo.getText().isEmpty())) {
				cont++;
				
				this.inicio.fieldNombre.setText("");
				this.inicio.fieldEspecie.setText("");
				this.inicio.fieldZona.setText("");
				
				try {
					ctpapa.crearPapa(this.inicio.fieldNombre.getText(), 
						this.inicio.fieldEspecie.getText(), 
						this.inicio.fieldZona.getText(), 
						this.inicio.fieldHabito.getText(),
						this.inicio.fieldFloracion.getText(),						
						this.inicio.fieldBayas.getText(),
						this.inicio.fieldTuberculo.getText());
				}catch(SQLException ex) {
					this.inicio.aviso("No se pudo realizar la inserción en la base de datos");
				}
				
				if (cont==3) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								//Abrir ventana de base de datos
								wbd = new WBaseDeDatos();
								wbd.setVisible(true);
								wbd.setResizable(false);
								wbd.setLocationRelativeTo(null);
								wbd.setTitle("Base de Datos Papas Nativas Colombianas");
								
								//cerrar la actual ventana
								inicio.setVisible(false);
							
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
			}else {
				this.inicio.aviso("Hay campos que NO ha llenado. Por favor rellénelos.");
			}
		}
		
		
		
	}
	
	
	public void cerrarVentana(int val) {
		if (val == JOptionPane.YES_NO_OPTION) {
			System.exit(0);			
		}
	}
}
