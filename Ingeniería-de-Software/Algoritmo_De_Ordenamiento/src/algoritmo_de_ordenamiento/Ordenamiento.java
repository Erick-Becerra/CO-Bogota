
package algoritmo_de_ordenamiento;


import java.io.*;
import java.util.*;

public class Ordenamiento {

    public static void ordenarArchivo(String archivoEntrada, String archivoSalida) throws IOException {
        System.out.println("Entra a ordenarArchivo");
        
        // Buffer para leer el archivo
        BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada));
        
        // Guardamos los valores en un array separándolos por comas 
        String[] valores = reader.readLine().split(",");
        
        // Creamos un ArrayList que será donde ordenaremos los numeros
        List<Integer> numeros = new ArrayList<>();
        
        // Agregamos los valores al arraylist
        // System.out.println("Va a iniciar el ciclo");
        for (String valor : valores) {
            numeros.add(Integer.valueOf(valor.trim()));
        }
        // System.out.println("Termina el ciclo");
        
        // Los ordenamos
        Collections.sort(numeros);
        
        // Los escribimos en el archivo
        BufferedWriter writer = new BufferedWriter(new FileWriter(archivoSalida));
        for (int numero : numeros) {
            writer.write(numero + ",");
        }
        
        System.out.println("Sale de ordenarArchivo");
    }

}
