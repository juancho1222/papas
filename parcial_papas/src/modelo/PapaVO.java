package modelo;

public class PapaVO {
	String nombre;
	String especie;
	String zona;
	String habito;
	String floracion;
	String bayas;
	String tuberculo;
	
	//CONSTRUCTORES
	public PapaVO() {
		
	}
	
	public PapaVO(String nombre, String especie, String zona, String habito, 
				  String floracion, String bayas,String tuberculo) {
		this.nombre = nombre;
		this.especie = especie;
		this.zona = zona;
		this.habito = habito;
		this.floracion = floracion;
		this.bayas = bayas;
		this.tuberculo = tuberculo;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getHabito() {
		return habito;
	}
	public void setHabito(String habito) {
		this.habito = habito;
	}
	public String getFloracion() {
		return floracion;
	}
	public void setFloracion(String floracion) {
		this.floracion = floracion;
	}
	public String getBayas() {
		return bayas;
	}
	public void setBayas(String bayas) {
		this.bayas = bayas;
	}
	public String getTuberculo() {
		return tuberculo;
	}
	public void setTuberculo(String tuberculo) {
		this.tuberculo = tuberculo;
	}
}
