package sistemausuarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    // Parámetros de conexión
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_usuarios";
    private static final String USER = "root";  
    private static final String PASSWORD = ""; 

    // Método para establecer la conexión
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Error de conexión: " + ex.getMessage());
            return null;
        }
    }
}
