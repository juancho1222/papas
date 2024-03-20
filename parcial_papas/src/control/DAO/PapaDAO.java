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
    public void insertarDatos(PapaVO papa) throws SQLException {
            con = Conexion.getConexion();
            st = con.createStatement();
            String insercion = "INSERT INTO Estudiantes VALUES('" + papa.getNombre() + "','" + papa.getEspecie() + "'," + papa.getZona() + papa.getHabito() + "'," + papa.getFloracion() + papa.getBayas() + "'," + papa.getTuberculo() + ")"; 
            st.executeUpdate(insercion);
            st.close();
            Conexion.desconectar();
        
    }
}