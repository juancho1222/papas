package control;

import modelo.PapaVO;

import java.sql.SQLException;
import java.util.ArrayList;

import control.DAO.PapaDAO;

public class ControlPapa {
	ArrayList<PapaVO> listaDePapas;
	PapaDAO dao= new PapaDAO();
	
	public ControlPapa() {
		
	}

	public void crearPapa(String nombre, String especie, String zona, String habito, 
	  String floracion, String bayas,String tuberculo) throws SQLException { 
		
		PapaVO papaAux= new PapaVO(nombre, especie, zona, habito, floracion, bayas, tuberculo);
		listaDePapas.add(papaAux);
		insertar(papaAux);
	}
	public void consultar() {
	
	}
	public void insertar(PapaVO papa) throws SQLException {
		dao.insertarDatos(papa);
	}
	public void eliminar() {
		
	}
}