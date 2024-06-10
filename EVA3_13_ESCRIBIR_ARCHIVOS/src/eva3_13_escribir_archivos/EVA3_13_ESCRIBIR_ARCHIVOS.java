/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package eva3_13_escribir_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Usuario
 */
public class EVA3_13_ESCRIBIR_ARCHIVOS {

    final static String Ruta = "E:\\archivos\\";

    public static void main(String[] args) {
        try {
            writeUsingFiles(Ruta + "texto2.text", "PROBANDO PROBANDO..."
                    + "1 2 3... 1 2 3"
                    + " con FILES");
            writeUsingFileWriter(Ruta + "texto3.text", "PROBANDO PROBANDO..."
                    + "viva Murder Drones >:]"
                    + " con FileWriter");
            writeUsingBufferedWriter(Ruta + "texto4.text", "PROBANDO PROBANDO..."
                    + "adoro a mi novia <3"
                    + " con BufferedWriter");
        } catch (IOException e) {
        }
    }

    public static void writeUsingFiles(String ruta, String datos) throws IOException {
        Path path = Paths.get(ruta);
        Files.write(path, datos.getBytes());

    }

    public static void writeUsingFileWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta);
        FileWriter filewriter = new FileWriter(file);
        filewriter.write(datos);
        filewriter.close();
    }

    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException {
 File file = new File(ruta);
        FileWriter filewriter = new FileWriter(file);
        BufferedWriter bw= new BufferedWriter(filewriter);
        bw.write(datos);
        bw.close();
    }
}
