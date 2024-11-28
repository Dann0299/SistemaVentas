package Personal;

import Entidades.Persona;

public class Empleado extends Persona {

    private static int numEmpleado;
    private String identificador;
    private String contrasenia;
    private String rol;

    // Bloque de inicialización estática
    static {
        numEmpleado = 0;
    }

    public Empleado() {
        this.identificador = null;
        this.contrasenia = null;
        this.rol = null;
    }

    public Empleado(String nombre, String apellidos, String tipoDocIdentidad, String numDocIdentidad, String contrasenia, String rol) {
        super(nombre, apellidos, tipoDocIdentidad, numDocIdentidad);
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.identificador = generarIdentificador();
    }

    public static int getNumEmpleado() {
        return numEmpleado;
    }

    public static void setNumEmpleado(int numEmpleado) {
        Empleado.numEmpleado = numEmpleado;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    private String generarIdentificador() {
        String id = "";
        numEmpleado++;
        
        if (this.getRol().equals("Vendedor")) {
            id = "VDR" + String.format("%06d", this.getNumEmpleado());
        }
        
        return id;
    }
}
