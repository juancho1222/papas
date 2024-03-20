package control.DAO;


import modelo.conexion.*;
import modelo.PapaVO;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PapaDAO {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public PapaDAO() {
        con = null;
        st = null;
        rs = null;
    }
    public void insertarDatos(PapaVO papa) {
    	try {
    		con=Conexion.getConexion();
    		st=con.createStatement();
    		String insercion ="INSERT INTO base_de_papas('"+ papa.getNombre() +"','"+ papa.getEspecie()+"','"+papa.getZona()+"','"+papa.getHabito()+"','"+papa.getFloracion()+"','"+papa.getBayas()+"','"+papa.getTuberculo()+"')";
    		st.executeUpdate(insercion);
    		st.close();
    		Conexion.desconectar();
    		
    	}catch(SQLException ex) {
    	
    	}
    }
    public PapaVO consultarPapasNombre(String nombre) {
    	PapaVO papa=null;
    	String consulta="SELECT * FROM base_de_papas where nombre='"+nombre+"'";
    	try {
    		con =(Connection)Conexion.getConexion();
    		st=con.createStatement();
    		rs=st.executeQuery(consulta);
    		if(rs.next()) {
    			papa= new PapaVO();
    			papa.setNombre(rs.getString("nombre"));
    			papa.setEspecie(rs.getString("especie"));
    			papa.setHabito(rs.getString("habito"));
    			papa.setZona(rs.getString("zona"));
    			papa.setFloracion(rs.getString("floracion"));
    			papa.setBayas(rs.getString("bayas"));
    			papa.setTuberculo(rs.getString("tuberculo"));
    		}
    		st.close();
    		Conexion.desconectar();
    	}catch(SQLException ex) {
    		
    	}
    	return papa;
    }
    public ArrayList<PapaVO> consultarPapasDatos(String clave) {
    	ArrayList<PapaVO> misPapas=new ArrayList<PapaVO>();
    	String consulta="SELECT * FROM base_de_papas where nombre='"+clave+"'";
    	try {
    		con =(Connection)Conexion.getConexion();
    		st=con.createStatement();
    		rs=st.executeQuery(consulta);
    		while(rs.next()) {
    			PapaVO papas= new PapaVO();
    			papas.setNombre(rs.getString("nombre"));
    			papas.setEspecie(rs.getString("especie"));
    			papas.setHabito(rs.getString("habito"));
    			papas.setZona(rs.getString("zona"));
    			papas.setFloracion(rs.getString("floracion"));
    			papas.setBayas(rs.getString("bayas"));
    			papas.setTuberculo(rs.getString("tuberculo"));
    			misPapas.add(papas);
    		}
    		st.close();
    		Conexion.desconectar();
    	}catch(SQLException ex) {
    		
    	}
    	return misPapas;
    }
}
