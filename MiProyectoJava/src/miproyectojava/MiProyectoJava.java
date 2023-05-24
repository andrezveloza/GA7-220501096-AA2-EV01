package miproyectojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MiProyectoJava {
    public static void main(String[] args) {
        // Datos de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/ga6-220501096-aa2-ev02";
        String username = "root";
        String password = "1508";
        
        // Objeto de conexión
        Connection connection = null;
        
        try {
            // Establecer la conexión
            connection = DriverManager.getConnection(url, username, password);
            
            // Realizar operaciones con la base de datos
            // Aquí puedes ejecutar consultas, realizar inserciones, actualizaciones, etc.
            
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión a la base de datos.");
            e.printStackTrace();
        } finally {
            // Cerrar la conexión
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión.");
                    e.printStackTrace();
                }
            }
        }
    }
}
