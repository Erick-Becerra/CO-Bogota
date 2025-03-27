package algoritmo_de_ordenamiento;

import java.io.IOException;

public class Algoritmo_De_Ordenamiento {

    public static void main(String[] args) {
        //System.out.println("Entra a Main");
        
        // Definimos los archivos de donde vamos a tomar los datos, y el archivo a donde vamos a guardarlos ordenados
        // La variable de archivo de entrada necesita ser ajustada dependiendo la ruta estática del archivo en cada computadora.        
        String archivoEntrada = "C:\\Users\\l2114\\OneDrive\\Documentos\\ITQ\\Semestre 8 (Bogotá)\\Ingeniería de Software\\datos_de_prueba_1M.csv"; // Archivo con los datos desordenados
        String archivoSalida = "datos_ordenados_2.csv"; // Archivo donde se guardarán los datos ordenados

        try {
            System.out.println("Iniciando el proceso de ordenamiento...");

            // Llamar al algoritmo de ordenamiento externo
            Ordenamiento.ordenarArchivo(archivoEntrada, archivoSalida);

            System.out.println("Proceso completado. Los datos ordenados se encuentran en: " + archivoSalida);
        } catch (IOException e) {
            System.err.println("Error durante el procesamiento: " + e.getMessage());
        }
        System.out.println("");
    }
    
}
