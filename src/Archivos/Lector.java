package Archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lector {

    private String nombreArchivo;

    public Lector() {
    }

    public Lector(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public ArrayList<String> leerTextoPlano(String valorBuscado) {

        ArrayList<String> listaFiltrada = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String lineaLimpia = linea.replaceAll("[^a-zA-Z0-9\\s]", "");

                if (linea.contains(valorBuscado)) {
                    listaFiltrada.add(lineaLimpia);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaFiltrada;
    }

    public boolean lineaContienePalabras(String... palabras) {
        try (BufferedReader br = new BufferedReader(new FileReader(this.getNombreArchivo()))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                boolean todasCoinciden = true;
                for (String palabra : palabras) {
                    if (!linea.matches(".*\\b" + palabra + "\\b.*")) {
                        todasCoinciden = false;
                        break;
                    }
                }

                if (todasCoinciden) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int obtenerNumero(String rutaArchivo) {
        int numeroMayor = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                
                // Se divide la línea para obtener la parte antes del punto
                String[] partes = linea.split("\\.");
                if (partes.length > 0) {
                    int numeroActual = Integer.parseInt(partes[0].trim());
                    if (numeroActual > numeroMayor) {
                        numeroMayor = numeroActual;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return numeroMayor;
    }
}
