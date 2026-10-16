/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.sistema.ventas.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jeffe
 */
public class ConexionDB {
    private static final String URL =
            
        "jdbc:sqlserver://localhost:56089;"
      + "databaseName=SistemaVentas;"
      + "encrypt=true;"
      + "trustServerCertificate=true;";
    
    private static final String USER = "sa";

    private static final String PASSWORD = "Miservidor1139";

public static Connection conectar() {

        try {

            Connection conexion =
                    DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
                );

            System.out.println("Conexion exitosa a MI SQL Server");

            return conexion;

        } catch (SQLException e) {

            System.out.println("Error de conexion:");
            e.printStackTrace();

            return null;
        }
    }
}
