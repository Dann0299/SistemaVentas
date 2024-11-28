package Entidades;

public class Persona {

    protected String codigo;
    protected String nombre;
    protected String apellidos;
    protected String tipoDocIdentidad;
    protected String numDocIdentidad;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String tipoDocIdentidad, String numDocIdentidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoDocIdentidad = tipoDocIdentidad;
        this.numDocIdentidad = numDocIdentidad;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocIdentidad() {
        return tipoDocIdentidad;
    }

    public void setTipoDocIdentidad(String tipoDocIdentidad) {
        this.tipoDocIdentidad = tipoDocIdentidad;
    }

    public String getNumDocIdentidad() {
        return numDocIdentidad;
    }

    public void setNumDocIdentidad(String numDocIdentidad) {
        this.numDocIdentidad = numDocIdentidad;
    }
}
