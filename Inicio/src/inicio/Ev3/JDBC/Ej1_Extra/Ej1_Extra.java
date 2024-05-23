package Ej1_Extra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Ej1_Extra {
    public static Dimension tamañoPantalla = Toolkit. getDefaultToolkit(). getScreenSize();
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/p";
        
        JFrame ventana = new JFrame("Ej1 Extra");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setBounds((int)tamañoPantalla.getWidth()/2 - 250, (int)tamañoPantalla.getHeight()/2 - 250, 500, 250);
        
        JPanel panel = new JPanel(new BorderLayout());
        ventana.add(panel);

        DefaultTableModel modeloTabla = new DefaultTableModel();
        JTable tabla = new JTable(modeloTabla);
        modeloTabla.addColumn("Matricula");
        modeloTabla.addColumn("Marca");
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Color");
        modeloTabla.addColumn("Año");
        modeloTabla.addColumn("Precio");
        panel.add(tabla, BorderLayout.CENTER);
        panel.add(tabla.getTableHeader(), BorderLayout.NORTH);

        try (Connection conexion = DriverManager.getConnection(url, "root", "")) {
            String queryTodos = "SELECT * FROM coches";
            PreparedStatement statementTodos = conexion.prepareStatement(queryTodos);
            ResultSet rsTodos = statementTodos.executeQuery();
            while (rsTodos.next()) {
                modeloTabla.addRow(new Object[]{
                    rsTodos.getString("matricula"),
                    rsTodos.getString("marca"),
                    rsTodos.getString("modelo"),
                    rsTodos.getString("color"),
                    rsTodos.getString("año"),
                    rsTodos.getString("precio")
                });
            }

            String queryCaro = "SELECT * FROM coches WHERE Precio = (SELECT MAX(Precio) FROM coches)";
            PreparedStatement statementCaro = conexion.prepareStatement(queryCaro);
            
            JPanel panelCaro = new JPanel();
            panel.add(panelCaro, BorderLayout.SOUTH);
            
            ResultSet rsCaro = statementCaro.executeQuery();
            rsCaro.next();
            JLabel etiqueta = new JLabel("El coche más caro es:");
            JLabel coche = new JLabel(
                rsCaro.getString("matricula") + " " +
                rsCaro.getString("marca") + " " +
                rsCaro.getString("modelo") + " " +
                rsCaro.getString("color") + " " +
                rsCaro.getString("año") + " " +
                rsCaro.getString("precio")
            );
            panelCaro.add(etiqueta);
            panelCaro.add(coche);

            ventana.setVisible(true);
        } catch (Exception e) {
            System.out.println("Aur naur! " + e);
        }
    } 
}
