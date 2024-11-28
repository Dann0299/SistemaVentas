package Personal;

import Archivos.Escritor;
import java.nio.file.Path;

public class Registro {
    
    public Registro() {
    }
    
    public void registrarArchivoPlano(String nombreArchivo, Empleado empleado){
        Escritor escritor = new Escritor(nombreArchivo);
        escritor.escribirTextoPlano(Empleado.getNumEmpleado() + ". " + empleado.getIdentificador() + " | " + empleado.getContrasenia());
    }
}
