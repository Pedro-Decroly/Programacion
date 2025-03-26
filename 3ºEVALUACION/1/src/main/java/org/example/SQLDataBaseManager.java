package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDataBaseManager {

    //Paso1 Declarar la conexion a nuestra base de datos

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String SCHEMA = "Churreria";
    private static final String USUARIO = "root";
    private static final String CLAVE = "daw12";

    //Paso2 Creamos una variable para conectarse
    public static Connection getConnection(){
        Connection connection = null;

        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL+SCHEMA, USUARIO, CLAVE);

        } catch (ClassNotFoundException e) {
            System.out.println("Error de acceso al driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }

        return connection;
    }

}
