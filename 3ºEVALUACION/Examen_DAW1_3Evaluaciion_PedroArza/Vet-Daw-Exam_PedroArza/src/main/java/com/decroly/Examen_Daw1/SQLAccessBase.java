package com.decroly.Examen_Daw1;

import java.sql.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SQLAccessBase {


    static void RegistrarMascotasistema(Mascota mascota, Object RegistrarMascotasistema) {
        List<String> registro = new LinkedList<>();

        // Define la consulta SQL para seleccionar todos los productos
        String sql = "INSERT INTO RegistrarMascotasistema(nombre, pasaporte, FechaNacimiento, peso, Tipo, Propietario) values(?, ?)";

        // Intenta establecer una conexión y preparar la consulta
        try (Connection connection = SQLManager.getConecction();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            // Ejecuta la consulta y obtiene el conjunto de resultados

            statement.setString(1, String.valueOf(RegistrarMascotasistema.getClass()));


            statement.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al insertar la mascota: " + e.getMessage());
        }
    }

}