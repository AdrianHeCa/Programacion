package Ej1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class inserciones {
    public static void main(String[] args) {
        //Url de nuestra conección a la BBDD
        String url = "jdbc:mysql://localhost:3306/p";
        // Datos de los coches a insertar
        String[][] datosCoches = {
            {"123ABC", "Toyota", "Corolla", "Rojo", "2022", "25000"},
            {"456DEF", "Ford", "Mustang", "Negro", "2021", "40000"},
            {"789GHI", "Honda", "Civic", "Azul", "2023", "28000"},
            {"987XYZ", "Chevrolet", "Camaro", "Blanco", "2020", "35000"},
            {"654JKL", "BMW", "X5", "Gris", "2022", "60000"}
        };

        // Intentamos establecer la conexión y realizar las inserciones
        try (Connection conexion = DriverManager.getConnection(url, "root", "")) {
            // Iteramos sobre los datos de los coches y los insertamos en la tabla
            for (String[] coche : datosCoches) {
                String query = "INSERT INTO coches (matricula, marca, modelo, color, año, precio) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = conexion.prepareStatement(query);
                statement.setString(1, coche[0]);
                statement.setString(2, coche[1]);
                statement.setString(3, coche[2]);
                statement.setString(4, coche[3]);
                statement.setString(5, coche[4]);
                statement.setString(6, coche[5]);
                statement.executeUpdate();
                statement.close();
            }
            System.out.println("Datos insertados correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos o al insertar datos: " + e.getMessage());
        }

    }   
}
    