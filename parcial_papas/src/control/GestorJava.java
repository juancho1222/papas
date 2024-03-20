package control;

import java.util.ArrayList;

import control.DAO.PapaDAO;
import modelo.PapaVO;

public class GestorJava {
private PapaDAO miPapaDAO;
public void registrarPapa(String nombre, String especie, String zona, String habito, 
				  String floracion, String bayas,String tuberculo){

miPapaDAO.insertarDatos(new PapaVO(nombre,  especie,  zona,  habito,floracion,  bayas, tuberculo));
}
public PapaVO buscarNombre(String nombre) {
	return miPapaDAO.consultarPapasNombre(nombre);
}
public  ArrayList<PapaVO> buscarCaracteristica(String clave){
	return miPapaDAO.consultarPapasDatos(clave);
}
}
