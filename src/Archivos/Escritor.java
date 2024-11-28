package Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Escritor {

    private String nombreArchivo;

    public Escritor() {
    }

    public Escritor(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getRuta() {
        return nombreArchivo;
    }

    public void setRuta(String ruta) {
        this.nombreArchivo = ruta;
    }

    public void escribirTextoPlano(String separador, ArrayList<String> listaPalabras, String inicioCadena, String finCadena) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.getRuta()))) {

            bw.write(inicioCadena);

            for (int i = 0; i < listaPalabras.size(); i++) {
                bw.write(listaPalabras.get(i));
                if (i < listaPalabras.size() - 1) {
                    bw.write(separador);
                }
            }

            bw.write(finCadena);
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirTextoPlano(String texto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.getRuta(), true))) {
            bw.write(texto);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
