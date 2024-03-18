package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Papas;
import vista.WCompletacion;

public class GestorPrincipal implements ActionListener{
	private WCompletacion inicio;
	public GestorPrincipal() {
		//Creación de la ventana
			inicio = new WCompletacion();
			inicio.setVisible(true);
			inicio.setResizable(false);
			inicio.setLocationRelativeTo(null);
			inicio.setTitle("Papas Nativas Colombianas");
			
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
