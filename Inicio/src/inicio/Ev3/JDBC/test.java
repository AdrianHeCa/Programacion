import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) {
        //Url de nuestra conección a la BBDD
        String url = "jdbc:mysql://localhost:3306/p";
        try {
            Connection conexion = DriverManager.getConnection(url, "root","");
            PreparedStatement myst = conexion.prepareStatement("select nombre from persona"); ResultSet rs = myst.executeQuery();
            while (rs.next()) {
            System.out.println(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error de BBDD" + e);
        } catch (Exception ex) {
            System.out.println("Error desconocido" + ex);
        }
    }
}
