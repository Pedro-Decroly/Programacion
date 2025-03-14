import java.util.Iterator;

public class TrabajadoresYaRegistradoException extends Exception {
    public TrabajadoresYaRegistradoException(String mensaje) {
        super(mensaje);
    }

    public static Iterator<Trabajador> iterator() {
    }
}
