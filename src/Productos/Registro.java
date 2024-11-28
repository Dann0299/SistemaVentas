package Productos;

import Archivos.Escritor;

public class Registro {

    private String nombreArchivo;

    public Registro() {
    }

    
    public Registro(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void registraArchivoPlano(Producto producto) {
        Escritor escritor = new Escritor(this.getNombreArchivo());
        escritor.escribirTextoPlano(producto.getCodigo() + ". " + producto.getNombre() + " | " + producto.getCantidad() + " | " + producto.getPrecio() + " | " + producto.getUnidadMedida());
    }
}
