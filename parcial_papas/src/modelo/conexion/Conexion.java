package modelo.conexion;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection cn = null;
    //(Poner la url de la base de datos correspondiente)
    private static String URLBD = "jdbc:mysql://localhost:3310/Universidad";
    private static String usuario = "root";
    private static String contrasena = "";

    public static Connection getConexion() {
        try {
        	cn = DriverManager.getConnection(URLBD, usuario, contrasena);
        } catch (SQLException ex) {
            System.out.println("No se puede cargar el controlado");
        }
        return cn;
    }

    public static void desconectar() {
        cn = null;
    }
}
*/