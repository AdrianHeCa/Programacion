package Ev3.LecturaProductos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ProductosApp {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Producto> inventario = new HashMap<Integer, Producto>();

        System.out.println("Introduzca la ruta del archivo:");
        String path = "Java\\Inicio\\src\\inicio\\Ev3\\LecturaProductos\\" + sc.nextLine();

        BufferedReader bf = new BufferedReader(new FileReader(path));

        leerArchivo(bf, inventario);

        int codigo = 69;
        while (codigo != 0) {
            System.out.println("Escribe el código de un producto:");
            codigo = sc.nextInt();
            if (codigo != 0) {
                Producto producto = inventario.get(codigo);
                producto.mostrarProducto();
            }
        }

        sc.close();
    }

    private static void leerArchivo(BufferedReader bf, HashMap<Integer, Producto> inventario) throws IOException{
        String texto;
        while ((texto = bf.readLine()) != null) {
            String[] linia = texto.split(",");
            Producto producto = new Producto(Integer.valueOf(linia[0]), linia[1], Double.valueOf(linia[2]));
            inventario.put(Integer.valueOf(linia[0]), producto);
        }
    }
}
