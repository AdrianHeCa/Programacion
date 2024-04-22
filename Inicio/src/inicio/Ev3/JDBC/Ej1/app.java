package Ej1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class app {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/p";

        try (Connection conexion = DriverManager.getConnection(url, "root", "")) {
            String queryTodos = "SELECT * FROM coches";
            PreparedStatement statementTodos = conexion.prepareStatement(queryTodos);
            ResultSet rsTodos = statementTodos.executeQuery();
            while (rsTodos.next()) {
                System.out.println(
                    rsTodos.getString("matricula") + " " +
                    rsTodos.getString("marca") + " " +
                    rsTodos.getString("modelo") + " " +
                    rsTodos.getString("color") + " " +
                    rsTodos.getString("año") + " " +
                    rsTodos.getString("precio")
                );
            }

            String queryCaro = "SELECT * FROM coches WHERE Precio = (SELECT MAX(Precio) FROM coches)";
            PreparedStatement statementCaro = conexion.prepareStatement(queryCaro);
            ResultSet rsCaro = statementCaro.executeQuery();
            System.out.println("\nEl coche más caro es:");
            rsCaro.next();
            System.out.println(
                rsCaro.getString("matricula") + " " +
                rsCaro.getString("marca") + " " +
                rsCaro.getString("modelo") + " " +
                rsCaro.getString("color") + " " +
                rsCaro.getString("año") + " " +
                rsCaro.getString("precio")
            );
        } catch (Exception e) {
            System.out.println("Aur naur! " + e);
        }
    } 
}
