package Productos;

public class Producto {

    private static int numProducto;
    private String codigo;
    private String nombre;
    private float precio;
    private int cantidad;
    private String unidadMedida;

    static{
        numProducto = 0;
    }
    
    public Producto() {
        this.codigo = null;
        this.nombre = null;
        this.precio = 0;
        this.cantidad = 0;
        this.unidadMedida = null;
    }

    public Producto(String nombre, float precio, int cantidad, String unidadMedida) {
        this.codigo = generarCodigo();
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
    }

    public static int getNumProducto() {
        return numProducto;
    }

    public static void setNumProducto(int numProducto) {
        Producto.numProducto = numProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    private String generarCodigo(){
        numProducto++;
        return String.format("%06d", this.getNumProducto());
    }
}
